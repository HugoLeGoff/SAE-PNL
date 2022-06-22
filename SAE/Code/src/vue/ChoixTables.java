package vue;

import java.io.IOException;
import java.sql.SQLException;

import connexion.*;
import donnee.*;
import data.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.fxml.*;

import java.util.*;


public class ChoixTables {

    private String especeTMP;

    public void setEspece(String espece) {
        this.especeTMP = espece;
    }

    @FXML
    private Label nom = new Label();

    @FXML
    private Label espece = new Label();

    @FXML
    private Label table = new Label();

    @FXML
    private Button modifier;


    @FXML
    private Button retour;



    @FXML
    private Button deconnexion;

    @FXML private TableView<Table> tableView;
    @FXML private TableColumn<Table, String> tabColumn;



    @FXML
    private void initialize() throws SQLException {
    
        Compte compte = new Compte();
        String log = compte.getLogin();
        nom.setText(log);

        ChoixEspece especeChoix = new ChoixEspece();
        String nomEspece = especeChoix.getEspece();
        espece.setText(nomEspece);
        table.setText("Tables "+nomEspece+" : ");
        setEspece(nomEspece);
        
        

        
        if(nomEspece.equals("Hippocampes")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableHippo();
            
            tableView.getItems().setAll(tables);
        }
        else if(nomEspece.equals("Batraciens")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableBatraciens();
            
            tableView.getItems().setAll(tables);
        }
        else if(nomEspece.equals("GCI")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableGCI();
            
            tableView.getItems().setAll(tables);
        }
        else if(nomEspece.equals("Chouettes")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableChouettes();
            
            tableView.getItems().setAll(tables);
        }
        else if(nomEspece.equals("Loutres")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableLoutres();
            
            tableView.getItems().setAll(tables);
            }
        
    }


    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == modifier){
            if(especeTMP.equals("Hippocampes")){
                Scene scene = modifier.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("Batraciens")){
                Scene scene = modifier.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("TablesBatraciens.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("Chouettes")){
                Scene scene = modifier.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("tableschouette.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("GCI")){
                Scene scene = modifier.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("tablesGCI.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("Loutres")){
                Scene scene = modifier.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("tablesLoutre.fxml"));
                scene.setRoot(root);
            }
        }
        


        else if(event.getSource() == deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == this.retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);
        }
    }
}