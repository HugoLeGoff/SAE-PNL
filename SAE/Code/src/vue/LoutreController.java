package vue;
import java.io.IOException;
import java.sql.SQLException;

import donnee.*;
import connexion.*;
import data.*;
import java.util.*;
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
 * This class is the controller of the Loutre page. It gets the page interactive.
 */
public class LoutreController {

    @FXML
    private Button supprimer;
    @FXML private TextField id;
    @FXML
    private Label nomObservateur = new Label();

    
    @FXML
    private Button carte;

    @FXML  
    private TableView<AfficheObsLoutre> tableView;

    @FXML
    private TableColumn<AfficheObsLoutre, String> obsL;

    
    @FXML
    private TableColumn<AfficheObsLoutre, String> commune;
    
    @FXML
    private TableColumn<AfficheObsLoutre, String> lieuDit;

    @FXML
    private TableColumn<AfficheObsLoutre, String> indice;

    @FXML
    private TableColumn<AfficheObsLoutre, String> dateObs;

    @FXML
    private TableColumn<AfficheObsLoutre, String> heureObs;

    @FXML
    private TableColumn<AfficheObsLoutre, String> lieu_Lambert_X;

    @FXML
    private TableColumn<AfficheObsLoutre, String> lieu_Lambert_Y;

    @FXML
    private TableColumn<AfficheObsLoutre, String> nom;

    @FXML
    private TableColumn<AfficheObsLoutre, String> prenom;

    @FXML
    private TableColumn<AfficheObsLoutre, String> idObservateur;

    @FXML
    private Button retour;

    @FXML
    private Button recharger;

    @FXML
    private Button buttonAdd;

    
    @FXML
    private TableColumn<AfficheObsLoutre, String> typeObs;

    @FXML
    private ComboBox<String> choixAnnee;

    ObservableList<String> liste;

    AllData ad ;

    ArrayList<AfficheObsLoutre> obsLoutre;


    

    @FXML
    /**
     * Initializes the data already created on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {

        Compte compte = new Compte();
        String log = compte.getLogin();
        nomObservateur.setText(log);



        obsL.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("obsL"));
        commune.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("commune"));
        lieuDit.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("lieuDit"));
        indice.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("indice"));
        dateObs.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("dateObs"));
        heureObs.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("heureObs"));
        lieu_Lambert_X.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("lieu_Lambert_X"));
        lieu_Lambert_Y.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("lieu_Lambert_Y"));
        idObservateur.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("idObservateur"));
        nom.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("nom"));
        prenom.setCellValueFactory(new PropertyValueFactory<AfficheObsLoutre, String>("prenom"));


        

        ad = new AllData();
        obsLoutre = ad.loutre();
        
        
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



 

        tableView.getItems().setAll(obsLoutre);


        ArrayList<Table> tables = ad.tableLoutres();
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
            Parent root = FXMLLoader.load(getClass().getResource("addLoutre.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == supprimer){
            Delete dl = new Delete("Loutres",id.getText());
            dl.deleteTuple();
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesLoutre.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == recharger){
            if(choixAnnee.getValue()!=null){
                if (choixAnnee.getValue().equals("toute")){
                    try {
                        obsLoutre= ad.loutre();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    
                    try {
                        obsLoutre = ad.loutreAnnee(choixAnnee.getValue());
                    } catch (SQLException e) {
                        
                        e.printStackTrace();
                    }
                }
                tableView.getItems().setAll(obsLoutre);
            }
            
            
<<<<<<< HEAD

        }else if(event.getSource() == carte){
            Scene scene = carte.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("carte.fxml"));
            scene.setRoot(root);
=======
        }
        else if(event.getSource() == carte){
            Scene scene = carte.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("carte.fxml"));
            scene.setRoot(root);

>>>>>>> 6738c876e76a3378389c48433daa24429f822c03
        }
    }
    





} 