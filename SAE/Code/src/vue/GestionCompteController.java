package vue;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.mysql.cj.MysqlConnection;

import connexion.Compte;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
public class GestionCompteController implements Initializable{

    @FXML
    private TableView<Compte> table_compte;

    @FXML
    private TableColumn<Compte, String> col_login;

    @FXML
    private TableColumn<Compte, String> col_mdp;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        col_login.setCellValueFactory(new PropertyValueFactory<>("login"));
        col_mdp.setCellValueFactory(new PropertyValueFactory<>("mdp"));

        ObservableList<Compte> comptes = data.Database.getComptes();
        table_compte.setItems(comptes);

    }

    ObservableList<Compte> listM;
    ObservableList<Compte> dataList;
    
   
    
    int index = -1;
    
    Connection conn =null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
     
    public void Add_users (){    

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            String sql = "INSERT INTO Connexion (login, mdp) VALUES (?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, col_login.getText());
            pst.setString(2, col_mdp.getText());
            pst.executeUpdate();
            conn.close();
            System.out.println("Ajout réussi");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public void Edit (){   

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            String sql = "UPDATE Connexion SET login=?, mdp=? WHERE login=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, col_login.getText());
            pst.setString(2, col_mdp.getText());
            pst.setInt(5, index);
            pst.executeUpdate();
            conn.close();
            System.out.println("Modification réussi");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void Delete(){


        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            String sql = "DELETE FROM Connexion WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, index);
            pst.executeUpdate();
            conn.close();
            System.out.println("Suppression réussi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    public void UpdateTable(){

        listM = data.Database.getComptes();
        table_compte.setItems(listM);
    }
}