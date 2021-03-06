package vue;
import data.*;
import connexion.Compte;
import donnee.AfficheObsHippocampes;
import donnee.Table;

import java.io.IOException;
import java.sql.SQLException;

import java.util.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;

/**
 * This class is the controller of the Hippocampe page. It gets the page interactive.
 */
public class HippoController {
    
    @FXML private Button deconnexion;

    @FXML private Label nomObservateur = new Label();
    @FXML private ComboBox<String> choixAnnee;
    @FXML private Button supprimer;
    @FXML private TextField id;
    @FXML private Button retour;
    @FXML private Button carte;
    @FXML private Button buttonAdd;
    @FXML private Button recharger;
    ObservableList<String> liste;
    AllData ad ;
    ArrayList<AfficheObsHippocampes> obsHippo;
    @FXML private TableView<AfficheObsHippocampes> tableView;
    @FXML private TableColumn<AfficheObsHippocampes, String> ObsH;
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
    /**
     * Initializes the data already created on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {

        Compte compte = new Compte();
        String log = compte.getLogin();
        nomObservateur.setText(log);
        
        ObsH.setCellValueFactory(new PropertyValueFactory<AfficheObsHippocampes, String>("ObsH"));
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

        ad = new AllData();
        obsHippo = ad.hippocampe();
        
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

        liste.add("toutes");
        choixAnnee.setItems(liste);
    }

    @FXML
    /**
     * Initializes the action to execute when pressing a button.
     * @param event the event
     * @throws IOException IOException
     * @throws SQLException SQLException
     */   
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
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == recharger){
            if(choixAnnee.getValue()!=null){
                if (choixAnnee.getValue().equals("toutes")){
                    try {
                        obsHippo = ad.hippocampe();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    try {
                        obsHippo = ad.hippocampeAnnee(choixAnnee.getValue());
                    } catch (SQLException e) {
                        
                        e.printStackTrace();
                    }
                }
                tableView.getItems().setAll(obsHippo);
            }
        }
        else if(event.getSource() == carte){
            Scene scene = carte.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("carte.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == deconnexion){

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            scene.setRoot(root);
        }
        
    }
}