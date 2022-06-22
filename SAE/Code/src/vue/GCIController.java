package vue;
import java.io.IOException;
import java.sql.SQLException;

import donnee.*;
import data.*;
import java.util.*;

import connexion.Compte;
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

/**
 * This class is the controller of the GCI page. It gets the page interactive.
 */
public class GCIController {
    


    @FXML
    private Label nomObservateur = new Label();
    @FXML
    private Button supprimer;

    @FXML
    private TextField id;

    @FXML
    private Button retour;

    
    @FXML
    private Button carte;

    @FXML
    private Button buttonAdd;

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
    private Button recharger;

    @FXML ComboBox<String> choixAnnee;

    @FXML
    private TextField zoneTaille;

    @FXML
    private TextField zoneGestant;

    ObservableList<String> liste;

    AllData ad ;

    ArrayList<AfficheObsGCI> obsGCI;

    @FXML private TableView<AfficheObsGCI> tableView;
    @FXML private TableColumn<AfficheObsGCI, String> obsG;
    @FXML private TableColumn<AfficheObsGCI, String> nature;
    @FXML private TableColumn<AfficheObsGCI, String> nombre;
    @FXML private TableColumn<AfficheObsGCI, String> presentMaisNonObs;
    @FXML private TableColumn<AfficheObsGCI, String> idNid;
    @FXML private TableColumn<AfficheObsGCI, String> nomPlage;
    @FXML private TableColumn<AfficheObsGCI, String> raisonArretObservation;
    @FXML private TableColumn<AfficheObsGCI, String> protection;
    @FXML private TableColumn<AfficheObsGCI, String> bagueMale;
    @FXML private TableColumn<AfficheObsGCI, String> bagueFemelle;
    @FXML private TableColumn<AfficheObsGCI, String> dateObs;
    @FXML private TableColumn<AfficheObsGCI, String> heureObs;
    @FXML private TableColumn<AfficheObsGCI, String> lieu_Lambert_X;
    @FXML private TableColumn<AfficheObsGCI, String> lieu_Lambert_Y;
    @FXML private TableColumn<AfficheObsGCI, String> idObservateur;
    @FXML private TableColumn<AfficheObsGCI, String> nom;
    @FXML private TableColumn<AfficheObsGCI, String> prenom;


    

    @FXML
    /**
     * Initializes the data already created on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {

        Compte compte = new Compte();
        String log = compte.getLogin();
        nomObservateur.setText(log);

        obsG.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("obsG"));
        nature.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("nature"));
        nombre.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("nombre"));
        presentMaisNonObs.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("presentMaisNonObs"));
        idNid.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("idNid"));
        nomPlage.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("nomPlage"));
        raisonArretObservation.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("raisonArretObservation"));
        protection.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("protection"));
        bagueMale.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("bagueMale"));
        bagueFemelle.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("bagueFemelle"));
        dateObs.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("dateObs"));
        heureObs.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("heureObs"));
        lieu_Lambert_X.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("lieu_Lambert_X"));
        lieu_Lambert_Y.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("lieu_Lambert_Y"));
        idObservateur.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("idObservateur"));
        nom.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("nom"));
        prenom.setCellValueFactory(new PropertyValueFactory<AfficheObsGCI, String>("prenom"));

        ad = new AllData();
        obsGCI = ad.gci();
        
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



 

        tableView.getItems().setAll(obsGCI);

        ArrayList<Table> tables = ad.tableGCI();
        liste = FXCollections.observableArrayList();
        for(Table t :tables){
            liste.add(t.getTable());
        }
        liste.add("toute");
        choixAnnee.setItems(liste);
    }


    @FXML

    /**
     * Initializes the action to execute when pressing a button.
     * @param event the event
     * @throws IOException IOException
     */
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);
        }
        
        else if(event.getSource() == buttonAdd){
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("addGCI.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == supprimer){
            Delete dl = new Delete("gci",id.getText());
            dl.deleteTuple();
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesGCI.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == recharger){
            if(choixAnnee.getValue()!=null){
                if (choixAnnee.getValue().equals("toute")){
                    try {
                        obsGCI = ad.gci();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    
                    try {
                        obsGCI = ad.gciAnnee(choixAnnee.getValue());
                    } catch (SQLException e) {
                        
                        e.printStackTrace();
                    }
                }
                tableView.getItems().setAll(obsGCI);
            }

            
            
        }
        else if(event.getSource() == carte){
            Scene scene = carte.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("carte.fxml"));
            scene.setRoot(root);
        }
    }
} 