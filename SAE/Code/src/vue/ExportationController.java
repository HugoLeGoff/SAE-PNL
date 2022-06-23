package vue;
import connexion.*;
import donnee.*;
import data.*;

import java.io.IOException;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.*;
import java.util.*;

/**
 * This class is the controller of the Exportation page. It gets the page interactive.
 */
public class ExportationController {

    @FXML private Label nom = new Label();
    @FXML private Label espece = new Label();
    @FXML private Label tables = new Label();
    @FXML private Button exporter;
    @FXML private Button retour;
    @FXML private Button deconnexion;
    @FXML private ComboBox<String> annee;
    @FXML private TextField nomFichier;
    @FXML private TableView<Table> tableView;
    @FXML private TableColumn<Table, String> tabColumn;
    @FXML private Label msgImport;
    ObservableList<String> liste;

    @FXML
    /**
     * Initializes the data already created on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {
    
        Compte compte = new Compte();
        String log = compte.getLogin();
        nom.setText(log);

        ChoixEspece especeChoix = new ChoixEspece();
        String nomEspece = especeChoix.getEspece();
        espece.setText(nomEspece);
        tables.setText("Tables "+nomEspece+" : ");
        
        if(nomEspece.equals("Hippocampes")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableHippo();
            liste = FXCollections.observableArrayList();
            for(Table t :tables){
                liste.add(t.getTable());
            }
            liste.add("toutes");
            annee.setItems(liste);
            tableView.getItems().setAll(tables);
        }
        else if(nomEspece.equals("Batraciens")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableBatraciens();
            liste = FXCollections.observableArrayList();
            for(Table t :tables){
                liste.add(t.getTable());
            }
            liste.add("toutes");
            annee.setItems(liste);
            tableView.getItems().setAll(tables);
        }
        else if(nomEspece.equals("GCI")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableGCI();
            liste = FXCollections.observableArrayList();
            for(Table t :tables){
                liste.add(t.getTable());
            }
            liste.add("toutes");
            annee.setItems(liste);
            tableView.getItems().setAll(tables);
        }
        else if(nomEspece.equals("Chouettes")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableChouettes();
            liste = FXCollections.observableArrayList();
            for(Table t :tables){
                liste.add(t.getTable());
            }
            liste.add("toutes");
            annee.setItems(liste);
            tableView.getItems().setAll(tables);
        }
        else if(nomEspece.equals("Loutres")){
            tabColumn.setCellValueFactory(new PropertyValueFactory<Table, String>("table"));
            AllData ad = new AllData();
            ArrayList<Table> tables = ad.tableLoutres();
            liste = FXCollections.observableArrayList();
            for(Table t :tables){
                liste.add(t.getTable());
            }
            liste.add("toutes");
            annee.setItems(liste);
            tableView.getItems().setAll(tables);
            }
    }

    @FXML
    /**
     * Initializes the action to execute when pressing a button.
     * @param event the event
     * @throws IOException IOException
     */
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == exporter){
            try{
                ChoixEspece especeChoix = new ChoixEspece();
                String nomEspece = especeChoix.getEspece();

                if(this.annee.getValue().equals("toutes")){
                    ExportData fichier = new ExportData(this.nomFichier.getText(), nomEspece);
                    fichier.exportData();
                } else {
                    ExportData fichier = new ExportData(this.nomFichier.getText(),this.annee.getValue(), nomEspece);
                    fichier.exportData();
                }
                msgImport.setText("Le fichier à été exporter à l'adresse \n C:/Users/Public/Downloads");
            
            }catch(NumberFormatException nfe){
                msgImport.setText("Le numéro de l'année doit être valide");
            } 
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