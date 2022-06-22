package vue;
import java.io.IOException;
import java.sql.SQLException;

import donnee.*;
import data.*;
import java.util.*;
import donnee.AfficheObsHippocampes;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.*;


public class GCIController {

    @FXML
    private Button pop;

    @FXML
    private Button retour;

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
    private TextField zoneTaille;

    @FXML
    private TextField zoneGestant;

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
    private void initialize() throws SQLException {
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

        AllData ad = new AllData();
        ArrayList<AfficheObsGCI> obsGCI = ad.gci();
        
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
    }


    @FXML


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
    }





} 