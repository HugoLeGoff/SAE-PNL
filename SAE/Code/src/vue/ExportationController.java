package vue;

import java.io.IOException;
import java.sql.SQLException;

import connexion.*;
import donnee.*;
import data.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private Label nom = new Label();

    
    @FXML
    private Label espece = new Label();

    @FXML
    private Label tables = new Label();



    @FXML
    private Button exporter;


    @FXML
    private Button retour;

    @FXML
    private Button deconnexion;
    
    @FXML 
    private ComboBox<String> annee;

    @FXML 
    private TextField nomFichier;

    @FXML private TableView<Table> tableView;
    @FXML private TableColumn<Table, String> tabColumn;

    @FXML private Label msgImport;

    ObservableList<String> liste;


    @FXML
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
            annee.setItems(liste);
            tableView.getItems().setAll(tables);
            }
        
    }


    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == exporter){
            try{
                ChoixEspece especeChoix = new ChoixEspece();
                String nomEspece = especeChoix.getEspece();

                System.out.println(nomEspece);

                ExportData fichier = new ExportData(this.nomFichier.getText(), this.annee.getValue(), nomEspece);
                fichier.exportData();

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