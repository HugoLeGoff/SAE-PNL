package vue;
import java.io.IOException;
import java.sql.SQLException;

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


public class HippoController {

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
            Stage stage = new Stage(); 
            Parent root = FXMLLoader.load(getClass().getResource("addHippo.fxml"));
            scene.setRoot(root);
        }
    }





} 