package vue;

import java.io.IOException;
import java.sql.SQLException;

import connexion.Compte;
import donnee.*;
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


public class HippoTables {

    @FXML
    private Button modifier;

    @FXML
    private Button renommer;

    @FXML
    private Button supprimmer;

    @FXML
    private Button plus;

    @FXML
    private Button deconnexion;

    @FXML private TableView<Table> tableView;
    @FXML private TableColumn<Table, String> tabColumn;



    @FXML
    private void initialize() {
        tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
        List<Table> table = new ArrayList<Table>();
        Table table1 = new Table("hippocampes 2018");        
        table.add(table1);
        tableView.getItems().setAll(table);
    }


    @FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == modifier){
            Scene scene = modifier.getScene();
            System.out.println("aeaze");
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == renommer){
            Scene scene = modifier.getScene();
            System.out.println("aeaze");
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }
        
        else if(event.getSource() == supprimmer){
            Scene scene = modifier.getScene();
            System.out.println("aeaze");
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == plus){
            Scene scene = modifier.getScene();
            System.out.println("aeaze");
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            scene.setRoot(root);
        }
    }

}