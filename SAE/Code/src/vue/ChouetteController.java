package vue;
import java.io.IOException;
import java.sql.SQLException;

import connexion.*;
import data.*;
import java.util.*;
import donnee.AfficheObsChouette;
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


public class ChouetteController {


    @FXML
    private Label nomObservateur = new Label();

    @FXML
    private TableView<AfficheObsChouette> tableView;

    @FXML
    private TableColumn<AfficheObsChouette, String> dateObs;

    
    @FXML
    private TableColumn<AfficheObsChouette, String> heureObs;


    @FXML
    private TableColumn<AfficheObsChouette, String> idObservateur;

    @FXML
    private TableColumn<AfficheObsChouette, String> leNumIndividu;

    @FXML
    private TableColumn<AfficheObsChouette, String> lieu_Lambert_X;

    @FXML
    private TableColumn<AfficheObsChouette, String> lieu_Lambert_Y;

    @FXML
    private TableColumn<AfficheObsChouette, String> nom;

    @FXML
    private TableColumn<AfficheObsChouette, String> numObs;

    @FXML
    private Button pop;

    @FXML
    private TableColumn<AfficheObsChouette, String> prenom;

    @FXML
    private TableColumn<AfficheObsChouette, String> protocole;

    @FXML
    private Button retour;

    
    @FXML
    private TableColumn<AfficheObsChouette, String> typeObs;


    

    @FXML
    private void initialize() throws SQLException {


        Compte compte = new Compte();
        String log = compte.getLogin();
        nomObservateur.setText(log);



        dateObs.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("dateObs"));
        heureObs.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("heureObs"));
        idObservateur.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("idObservateur"));
        leNumIndividu.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("leNumIndividu"));
        lieu_Lambert_X.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("lieu_Lambert_X"));
        lieu_Lambert_Y.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("lieu_Lambert_Y"));
        nom.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("nom"));
        numObs.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("numObs"));
        prenom.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("prenom"));
        protocole.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("protocole"));
        typeObs.setCellValueFactory(new PropertyValueFactory<AfficheObsChouette, String>("typeObs"));


        

        AllData ad = new AllData();
        ArrayList<AfficheObsChouette> obsChouette = ad.chouette();
        
        
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



 

        tableView.getItems().setAll(obsChouette);
    }


    @FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == retour){
            Scene scene = retour.getScene();
            Stage stage = new Stage(); 
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root); 
        }
    }





} 