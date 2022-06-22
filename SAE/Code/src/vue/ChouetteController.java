package vue;
import java.io.IOException;
import java.sql.SQLException;

import connexion.*;
import data.*;
import java.util.*;
import donnee.AfficheObsChouette;
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

/**
 * This class is the controller of the Accueil page. It gets the page interactive.
 */
public class ChouetteController {

    @FXML
    private Button supprimer;
    @FXML private TextField id;
    @FXML
    private Label nomObservateur = new Label();

    
    @FXML
    private Button carte;

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
    private Button buttonAdd;

    @FXML
    private Button recharger;

    
    @FXML
    private TableColumn<AfficheObsChouette, String> typeObs;

    @FXML
    private ComboBox<String> choixAnnee;

    ObservableList<String> liste;

    AllData ad ;

    ArrayList<AfficheObsChouette> obsChouette;


    

    @FXML
    /**
     * Initializes the data already on the page.
     * @throws SQLException SQLException
     */
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


        

        ad = new AllData();
        obsChouette = ad.chouette();
        
        
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

        ArrayList<Table> tables = ad.tableChouette();
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
            Stage stage = new Stage(); 
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root); 
        }
        else if(event.getSource() == buttonAdd){
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("addChouette.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == supprimer){
            Delete dl = new Delete("Chouettes",id.getText());
            dl.deleteTuple();
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tableschouette.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == recharger){
            if(choixAnnee.getValue()!=null){
                if (choixAnnee.getValue().equals("toute")){
                    try {
                        obsChouette= ad.chouette();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    
                    try {
                        obsChouette = ad.chouetteAnnee(choixAnnee.getValue());
                    } catch (SQLException e) {
                        
                        e.printStackTrace();
                    }
                }
                tableView.getItems().setAll(obsChouette);
            }
        }
            
<<<<<<< HEAD
            
        }
=======

>>>>>>> 6738c876e76a3378389c48433daa24429f822c03
        else if(event.getSource() == carte){
            Scene scene = carte.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("carte.fxml"));
            scene.setRoot(root);
<<<<<<< HEAD

=======
>>>>>>> 6738c876e76a3378389c48433daa24429f822c03
        }
    }





} 
