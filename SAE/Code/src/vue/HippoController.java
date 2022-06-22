package vue;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import data.*;
import java.util.*;
<<<<<<< HEAD


import connexion.Compte;
=======
>>>>>>> 6bcda495d6c57d4ccaa8c58c3912b72e771da7d0
import donnee.AfficheObsHippocampes;
import donnee.Table;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;


public class HippoController {
    @FXML
    private ComboBox<String> choixAnnee;
    @FXML
    private Button supprimer;

    @FXML
    private TextField id;

    @FXML
    private Button retour;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button recharger;

    @FXML
    private TextField zoneObsH;

    @FXML
    private TextField zoneEspace;

    @FXML
    private TextField zoneSexe;

    @FXML
    private TextField zoneTemperatureEau;

    @FXML
    private TextField zoneTypeDePeche;

    @FXML
    private TextField zoneTaille;

    @FXML
    private TextField zoneGestant;

    ObservableList<String> liste;

    @FXML private TableView<AfficheObsHippocampes> tableView;
    @FXML private TableColumn<AfficheObsHippocampes, String> idObs;
    @FXML private TableColumn<AfficheObsHippocampes, String> espece;
    @FXML private TableColumn<AfficheObsHippocampes, String> sexe;
    @FXML private TableColumn<AfficheObsHippocampes, String> temp;
    @FXML private TableColumn<AfficheObsHippocampes, String> type;
    @FXML private TableColumn<AfficheObsHippocampes, String> taille;
    @FXML private TableColumn<AfficheObsHippocampes, String> gestant;
    @FXML private TableColumn<AfficheObsHippocampes, String> dateObs;
    @FXML private TableColumn<AfficheObsHippocampes, String> heureObs;
    @FXML private TableColumn<AfficheObsHippocampes, String> CooX;
    @FXML private TableColumn<AfficheObsHippocampes, String> CooY;
    @FXML private TableColumn<AfficheObsHippocampes, String> idObservateur;
    @FXML private TableColumn<AfficheObsHippocampes, String> nom;
    @FXML private TableColumn<AfficheObsHippocampes, String> prenom;

    

    @FXML
    private void initialize() throws SQLException {
        idObs.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("obsH"));
        espece.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("espece"));
        sexe.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("sexe"));
        temp.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("temperatureEau"));
        type.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("typePeche"));
        taille.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("taille"));
        gestant.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("gestant"));
        dateObs.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("dateObs"));
        heureObs.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("heureObs"));
        CooX.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("lieu_Lambert_X"));
        CooY.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("lieu_Lambert_Y"));
        idObservateur.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("idObservateur"));
        nom.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("nom"));
        prenom.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("prenom"));

        AllData ad = new AllData();
        ArrayList<AfficheObsHippocampes> obsHippo = ad.hippocampe();
        try{
            if (choixAnnee.getValue()=="toute"){
                obsHippo = ad.hippocampe();
            }else{
                
                obsHippo = ad.hippocampeAnnee(choixAnnee.getValue());
            }
        }catch(Exception e){
        }
        
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tableView.getColumns().get(0).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));    //33% for id column size
        tableView.getColumns().get(1).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));   //33% for dt column size
        tableView.getColumns().get(2).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(3).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(4).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(5).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(6).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(7).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(8).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(9).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(10).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(11).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(12).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(13).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 



 

        tableView.getItems().setAll(obsHippo);
        
        
        ArrayList<Table> tables = ad.tableHippo();
        liste = FXCollections.observableArrayList();
        for(Table t :tables){
            liste.add(t.getTable());
        }
        liste.add("toute");
        choixAnnee.setItems(liste);
    }


    @FXML

    
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException, SQLException{

        if(event.getSource() == retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);
        }
        
        else if(event.getSource() == buttonAdd){
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("addHippo.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == supprimer){
            Delete dl = new Delete("Hippocampes",id.getText());
            dl.deleteTuple();
        }
        else if(event.getSource() == recharger){
            try{
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }





}