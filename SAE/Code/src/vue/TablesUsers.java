package vue;
import donnee.*;
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

/**
 * This class is the controller of the TableObservateurs page. It gets the page interactive.
 */
public class TablesUsers {


    @FXML
    private Label nomObservateur = new Label();

    @FXML
    private TableView<AfficheUsers> tableView;

    @FXML
    private TableColumn<AfficheUsers, String> nom;

    
    @FXML
    private TableColumn<AfficheUsers, String> prenom;

    @FXML
    private TableColumn<AfficheUsers, String> id;

    @FXML
    private Button retour;

    @FXML
    private Button buttonAdd;
    

    @FXML
    /**
     * Initializes the data already here on the page.
     */
    private void initialize() throws SQLException {

        Compte compte = new Compte();
        String log = compte.getLogin();
        nomObservateur.setText(log);

        id.setCellValueFactory(new PropertyValueFactory<AfficheUsers, String>("idU"));
        nom.setCellValueFactory(new PropertyValueFactory<AfficheUsers, String>("nom"));
        prenom.setCellValueFactory(new PropertyValueFactory<AfficheUsers, String>("prenom"));        

        AllData ad = new AllData();
        ArrayList<AfficheUsers> users = ad.getAllObs();

        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tableView.getColumns().get(0).prefWidthProperty().bind(tableView.widthProperty().multiply(0.33));   //33% for dt column size
        tableView.getColumns().get(1).prefWidthProperty().bind(tableView.widthProperty().multiply(0.33));
        tableView.getColumns().get(2).prefWidthProperty().bind(tableView.widthProperty().multiply(0.33));

        tableView.getItems().setAll(users);
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
            Parent root = FXMLLoader.load(getClass().getResource("Selection.fxml"));
<<<<<<< HEAD
            scene.setRoot(root); 
=======
            scene.setRoot(root);
>>>>>>> 8c80260a09369cab0370480c56483a4e7e6ec0d3
        }
        else if(event.getSource() == buttonAdd){
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("addObservateur.fxml"));
            scene.setRoot(root);
        }
    }
} 