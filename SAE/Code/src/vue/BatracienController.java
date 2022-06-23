package vue;
import data.*;
import connexion.Compte;
import donnee.AfficheObsBatracien;
import donnee.Table;

import java.io.IOException;
import java.sql.SQLException;

import java.util.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;

/**
 * This class is the controller of the Batracien page. It gets the page interactive.
 */
public class BatracienController {

    @FXML private Label nomObservateur = new Label();
    @FXML private Button carte;
    @FXML private Button retour;
    @FXML private Button deconnexion;
    @FXML private Button buttonAdd;
    @FXML private Button recharger;
    @FXML private ComboBox<String> choixAnnee;
    ObservableList<String> liste;
    AllData ad;
    ArrayList<AfficheObsBatracien> obsBatracien;
    @FXML private Button supprimer;
    @FXML private TextField id;
    @FXML private TableView<AfficheObsBatracien> tableView;
    @FXML private TableColumn<AfficheObsBatracien, String> obsB;
    @FXML private TableColumn<AfficheObsBatracien, String> espece;
    @FXML private TableColumn<AfficheObsBatracien, String> nombreAdultes;
    @FXML private TableColumn<AfficheObsBatracien, String> nombreAmplexus;
    @FXML private TableColumn<AfficheObsBatracien, String> nombrePonte;
    @FXML private TableColumn<AfficheObsBatracien, String> nombreTetard;
    @FXML private TableColumn<AfficheObsBatracien, String> temperature;
    @FXML private TableColumn<AfficheObsBatracien, String> meteo_ciel;
    @FXML private TableColumn<AfficheObsBatracien, String> meteo_temp;
    @FXML private TableColumn<AfficheObsBatracien, String> meteo_vent;
    @FXML private TableColumn<AfficheObsBatracien, String> meteo_pluie;
    @FXML private TableColumn<AfficheObsBatracien, String> concerne_ZH;
    @FXML private TableColumn<AfficheObsBatracien, String> concerne_vege;
    @FXML private TableColumn<AfficheObsBatracien, String> dateObs;
    @FXML private TableColumn<AfficheObsBatracien, String> heureObs;
    @FXML private TableColumn<AfficheObsBatracien, String> lieu_Lambert_X;
    @FXML private TableColumn<AfficheObsBatracien, String> lieu_Lambert_Y;
    @FXML private TableColumn<AfficheObsBatracien, String> lobservateur;
    @FXML private TableColumn<AfficheObsBatracien, String> idObservateur;
    @FXML private TableColumn<AfficheObsBatracien, String> nom;
    @FXML private TableColumn<AfficheObsBatracien, String> prenom;
    @FXML private TableColumn<AfficheObsBatracien, String> zh_temporaire;
    @FXML private TableColumn<AfficheObsBatracien, String> zh_profondeur;
    @FXML private TableColumn<AfficheObsBatracien, String> zh_surface;
    @FXML private TableColumn<AfficheObsBatracien, String> zh_typeMare;
    @FXML private TableColumn<AfficheObsBatracien, String> zh_pente;
    @FXML private TableColumn<AfficheObsBatracien, String> zh_ouverture;
    @FXML private TableColumn<AfficheObsBatracien, String> natureVege;
    @FXML private TableColumn<AfficheObsBatracien, String> vegetation;
    @FXML private TableColumn<AfficheObsBatracien, String> decrit_LieuVege;

    @FXML
    /**
     * Initializes the data already on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {

        Compte compte = new Compte();
        String log = compte.getLogin();
        nomObservateur.setText(log);

        obsB.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("obsB"));
        espece.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("espece"));
        nombreAdultes.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("nombreAdultes"));
        nombreAmplexus.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("nombreAmplexus"));
        nombrePonte.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("nombrePonte"));
        nombreTetard.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("nombreTetard"));
        temperature.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("temperature"));
        meteo_ciel.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("meteo_ciel"));
        meteo_temp.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("meteo_temp"));
        meteo_vent.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("meteo_vent"));
        meteo_pluie.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("meteo_pluie"));
        concerne_ZH.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("concerne_ZH"));
        concerne_vege.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("concerne_vege"));
        dateObs.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("dateObs"));
        heureObs.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("heureObs"));
        lieu_Lambert_X.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("lieu_Lambert_X"));
        lieu_Lambert_Y.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("lieu_Lambert_Y"));
        idObservateur.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("idObservateur"));
        nom.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("nom"));
        prenom.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("prenom"));
        zh_temporaire.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("zh_temporaire"));
        zh_profondeur.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("zh_profondeur"));
        zh_surface.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("zh_surface"));
        zh_typeMare.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("zh_typeMare"));
        zh_pente.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("zh_pente"));
        zh_ouverture.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("zh_ouverture"));
        natureVege.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("natureVege"));
        vegetation.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("vegetation"));
        decrit_LieuVege.setCellValueFactory(new PropertyValueFactory<AfficheObsBatracien, String>("decrit_LieuVege"));

        ad = new AllData();
        obsBatracien = ad.Batracien();
        
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
        tableView.getColumns().get(11).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(12).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(13).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(14).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(15).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(16).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(17).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(18).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(19).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(20).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(21).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(22).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(23).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(24).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));         tableView.getColumns().get(21).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07));
        tableView.getColumns().get(25).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(26).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(27).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 
        tableView.getColumns().get(28).prefWidthProperty().bind(tableView.widthProperty().multiply(0.07)); 

        tableView.getItems().setAll(obsBatracien);

        ArrayList<Table> tables = ad.tableBatraciens();
        liste = FXCollections.observableArrayList();

        for(Table t :tables){
            liste.add(t.getTable());
        }

        liste.add("toutes");
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
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);
        } else if(event.getSource() == buttonAdd){
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("addBatraciens.fxml"));
            scene.setRoot(root);
        } else if(event.getSource() == supprimer){
            Delete dl = new Delete("Batraciens",id.getText());
            dl.deleteTuple();
            Scene scene = buttonAdd.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("TablesBatraciens.fxml"));
            scene.setRoot(root);
        } else if(event.getSource() == recharger){
            if(choixAnnee.getValue()!=null){
                if (choixAnnee.getValue().equals("toutes")){
                    try {
                        obsBatracien= ad.Batracien();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        obsBatracien = ad.BatracienAnnee(choixAnnee.getValue());
                    } catch (SQLException e) {
                        
                        e.printStackTrace();
                    }
                }
                tableView.getItems().setAll(obsBatracien);
            }
        } else if(event.getSource() == carte){
            Scene scene = carte.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("carte.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == deconnexion){

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            scene.setRoot(root);
        }
    }
} 