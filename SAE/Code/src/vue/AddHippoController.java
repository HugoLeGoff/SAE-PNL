package vue;
import java.io.IOException;
import java.sql.SQLException;

import data.*;
import java.util.*;
import donnee.AfficheObsHippocampes;
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



public class AddHippoController {

    
    @FXML
    private TextField zoneObsH;
    @FXML
    private ComboBox<String> zoneEspece;
    @FXML
    private ComboBox<String> zoneSexe;
    @FXML
    private TextField zoneTemperatureEau;
    @FXML
    private ComboBox<String> zoneTypePeche;
    @FXML
    private TextField zoneTaille;
    @FXML
    private TextField zoneGestant;
    @FXML
    private TextField zoneDateObs;
    @FXML
    private TextField zoneHeureObs;
    @FXML
    private TextField zoneLieu_Lambert_X;
    @FXML
    private TextField zoneLieu_Lambert_Y;
    @FXML
    private TextField zoneLObservation;
    @FXML
    private TextField zoneNom;
    @FXML
    private TextField zonePrenom;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button annuler;

    ObservableList<String> liste;
    

    
    @FXML
    private void initialize() throws SQLException {
        liste = FXCollections.observableArrayList("MALE","FEMELLE","INCONNU");
        zoneSexe.setItems(liste);

        liste = FXCollections.observableArrayList("Syngnathus acus","Hippocampus guttulatus","Hippocampus Hippocampus","Entelurus aequoreus");
        zoneEspece.setItems(liste);

        liste = FXCollections.observableArrayList("casierCrevettes","casierMorgates","PetitFilet","verveuxAnguilles");
        zoneTypePeche.setItems(liste);

        AllData ad = new AllData();
        zoneObsH.setText(ad.getID());
    }







    @FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        if(event.getSource() == buttonAdd){
            HashMap<String,String> values = new HashMap<String,String>();
            values.put("obsH",zoneObsH.getText());
            values.put("espece",zoneEspece.getValue());
            values.put("sexe",zoneSexe.getValue());
            values.put("temperatureEau",zoneTemperatureEau.getText());
            values.put("typePeche",zoneTypePeche.getValue());
            values.put("taille",zoneTaille.getText());
            values.put("gestant",zoneGestant.getText());
            values.put("dateObs",zoneDateObs.getText());
            values.put("heureObs",zoneHeureObs.getText());
            values.put("lieu_Lambert_X",zoneLieu_Lambert_X.getText());
            values.put("lieu_Lambert_Y",zoneLieu_Lambert_Y.getText());
            values.put("lObservateur",zoneLObservation.getText());
            values.put("nom",zoneNom.getText());
            values.put("prenom",zonePrenom.getText());


            ChoixVal val = new ChoixVal("Hippocampes", values);

        }
        if(event.getSource() == annuler){
            Scene scene = annuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }
    }
    

}
