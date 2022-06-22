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
    }
} 