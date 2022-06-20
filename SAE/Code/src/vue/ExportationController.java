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


public class ExportationController {

    private String especeTMP;

    public void setEspece(String espece) {
        this.especeTMP = espece;
    }

    @FXML
    private Button exporter;

    @FXML
    private Button retour;

    @FXML
    private Button deconnexion;
    
    @FXML 
    private TextField annee;

    @FXML 
    private TextField nomFichier;

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

        if(event.getSource() == exporter){
            ChoixEspece especeChoix = new ChoixEspece();
            String nomEspece = especeChoix.getEspece();
            
            ExportData fichier = new ExportData(this.nomFichier.getText(), this.annee.getText(), "Batracien" );
            fichier.exportData();
            
        }

        else if(event.getSource() == this.deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("connexion.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == this.retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);
        }


    }
}