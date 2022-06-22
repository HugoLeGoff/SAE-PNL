package vue;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import data.AllData;
import donnee.AfficheCompte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
public class GestionCompteController{

    @FXML
    private TableView<AfficheCompte> tableView;

    @FXML
    private TableColumn<AfficheCompte, String> idUser;

    @FXML
    private TableColumn<AfficheCompte, String> login;

    @FXML
    private TableColumn<AfficheCompte, String> passw;

    @FXML
    private TableColumn<AfficheCompte, String> nom;

    @FXML
    private TableColumn<AfficheCompte, String> prenom;

    @FXML
    private TableColumn<AfficheCompte, String> statut;

    @FXML
    private Button retour;

    @FXML
    private Button buttonAdd;

    @FXML
    private void initialize() throws SQLException {

        idUser.setCellValueFactory(new PropertyValueFactory<AfficheCompte, String>("idUser"));
        login.setCellValueFactory(new PropertyValueFactory<AfficheCompte, String>("login"));
        passw.setCellValueFactory(new PropertyValueFactory<AfficheCompte, String>("passw"));
        nom.setCellValueFactory(new PropertyValueFactory<AfficheCompte, String>("login"));
        prenom.setCellValueFactory(new PropertyValueFactory<AfficheCompte, String>("passw"));

        AllData ad = new AllData();
        ArrayList<AfficheCompte> comptes = ad.getAllCompte();
        
        
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tableView.getColumns().get(0).prefWidthProperty().bind(tableView.widthProperty().multiply(0.2));
        tableView.getColumns().get(1).prefWidthProperty().bind(tableView.widthProperty().multiply(0.2));
        tableView.getColumns().get(2).prefWidthProperty().bind(tableView.widthProperty().multiply(0.2));
        tableView.getColumns().get(3).prefWidthProperty().bind(tableView.widthProperty().multiply(0.2));
        tableView.getColumns().get(4).prefWidthProperty().bind(tableView.widthProperty().multiply(0.2));
        tableView.getColumns().get(5).prefWidthProperty().bind(tableView.widthProperty().multiply(0.2));


        tableView.getItems().setAll(comptes);
    }


    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == retour){
            Scene scene = retour.getScene();
            Stage stage = new Stage(); 
            Parent root = FXMLLoader.load(getClass().getResource("SelectionActionAdmin.fxml"));
            scene.setRoot(root); 
        }
        else if(event.getSource() == buttonAdd){
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("addChouette.fxml"));
            scene.setRoot(root);
        }
    }


}