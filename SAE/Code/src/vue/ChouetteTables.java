package vue;

import java.io.IOException;
import java.sql.SQLException;

import donnee.*;
import data.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.fxml.*;

import java.util.*;


public class ChouetteTables {

    @FXML
    private Button modifier;

    @FXML
    private Button supprimmer;

    @FXML
    private Button plus;

    @FXML
    private Button deconnexion;

    @FXML private TableView<Table> tableView;
    @FXML private TableColumn<Table, String> tabColumn;



    @FXML
    private void initialize() throws SQLException {

        tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
        AllData ad = new AllData();
        ArrayList<Table> tables = ad.tableHippo();
        
        tableView.getItems().setAll(tables);
    }

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == modifier){
            Scene scene = modifier.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tableschouette.fxml"));
            scene.setRoot(root);
        }
        
        else if(event.getSource() == supprimmer){
            Scene scene = modifier.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tableschouette.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == plus){
            Scene scene = modifier.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tableschouette.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            scene.setRoot(root);
        }
    }
}
