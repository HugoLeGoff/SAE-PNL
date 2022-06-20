package vue;

import java.io.IOException;
import java.sql.SQLException;

import connexion.*;
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


public class ChoixTables {

    private String especeTMP;

    public void setEspece(String espece) {
        this.especeTMP = espece;
    }

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
    
            /*Compte compte = new Compte();
            String log = compte.getLogin();
            nom.setText(log);
    
            ChoixEspece especeChoix = new ChoixEspece();
            String nomEspece = especeChoix.getEspece();
            espece.setText(nomEspece);
            especeTMP = espece;

            
        if(espece.equals("hippocampe")){*/
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableHippo();
            
            tableView.getItems().setAll(tables);
        //}
    }


    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == modifier){
            Scene scene = modifier.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }
        
        else if(event.getSource() == supprimmer){
            Scene scene = modifier.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == plus){
            Scene scene = modifier.getScene();
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