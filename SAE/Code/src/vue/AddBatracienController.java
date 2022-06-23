package vue;
import data.*;

import java.io.IOException;
import java.sql.SQLException;

import java.util.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;

/**
 * This class is the controller of the AddBatracien page. It gets the page interactive.
 */
public class AddBatracienController {

    @FXML private TextField zoneObsB;
    @FXML private ComboBox<String> zoneEspece;
    @FXML private TextField zoneNombreAdultes;
    @FXML private TextField zoneNombreAmplexus;
    @FXML private TextField zoneNombrePonte;
    @FXML private TextField zoneNombreTetard;
    @FXML private TextField zoneTemperature;
    @FXML private ComboBox<String> zoneMeteo_ciel;
    @FXML private ComboBox<String> zoneMeteo_temp;
    @FXML private ComboBox<String> zoneMeteo_vent;
    @FXML private ComboBox<String> zoneMeteo_pluie;
    @FXML private TextField zoneConcerne_ZH;
    @FXML private TextField zoneConcernes_vege;
    @FXML private TextField zoneDateObs;
    @FXML private TextField zoneHeureObs;
    @FXML private TextField zoneLieu_Lambert_X;
    @FXML private TextField zoneLieu_Lambert_Y;
    @FXML private TextField zoneLobservateur;
    @FXML private TextField zoneZh_temporaire;
    @FXML private TextField zoneZh_profondeur;
    @FXML private TextField zoneZh_surface;
    @FXML private ComboBox<String> zoneZh_typeMare;
    @FXML private ComboBox<String> zoneZh_pente;
    @FXML private ComboBox<String> zoneZh_ouverture;
    @FXML private ComboBox<String> zoneNatureVege;
    @FXML private TextField zoneIdVegeLieu;
    @FXML private TextField zoneVegetation;
    @FXML private Button buttonAdd;
    @FXML private Button buttonAnnuler;
    @FXML private Label msgLab = new Label();

    ObservableList<String> liste;
    
    @FXML
    /**
     * Initializes the data already on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {
        liste = FXCollections.observableArrayList("CALAMITE","PELODYTE");
        zoneEspece.setItems(liste);

        liste = FXCollections.observableArrayList("dégagé", "semi-dégagé", "nuageux");
        zoneMeteo_ciel.setItems(liste);

        liste = FXCollections.observableArrayList("froid", "moyen", "chaud");
        zoneMeteo_temp.setItems(liste);

        liste = FXCollections.observableArrayList("non", "léger", "moyen", "fort");
        zoneMeteo_vent.setItems(liste);

        liste = FXCollections.observableArrayList("non", "légère", "moyenne", "forte");
        zoneMeteo_pluie.setItems(liste);

        liste = FXCollections.observableArrayList("Prairie", "Etang", "Marais", "Mare");
        zoneZh_typeMare.setItems(liste);

        liste = FXCollections.observableArrayList("Raide", "Abrupte", "Douce");
        zoneZh_pente.setItems(liste);

        liste = FXCollections.observableArrayList("Abritee", "Semi-Abritee", "Ouverte");
        zoneZh_ouverture.setItems(liste);

        liste = FXCollections.observableArrayList("environnement","bordure","ripisyle");
        zoneNatureVege.setItems(liste);

        AllData ad = new AllData();
        zoneObsB.setText(ad.getID());
    }

    @FXML
    /**
     * Initializes the action to execute when pressing a button.
     * @param event the event
     * @throws IOException IOException
     */
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        if(event.getSource() == buttonAdd){
            HashMap<String,String> values = new HashMap<String,String>();
            values.put("obsB",zoneObsB.getText());
            values.put("espece",zoneEspece.getValue());
            values.put("nombreAdultes",zoneNombreAdultes.getText());
            values.put("nombreAmplexus",zoneNombreAmplexus.getText());
            values.put("nombrePonte",zoneNombrePonte.getText());
            values.put("nombreTetard",zoneNombreTetard.getText());
            values.put("temperature",zoneTemperature.getText());
            values.put("meteo_ciel",zoneMeteo_ciel.getValue());
            values.put("meteo_temp",zoneMeteo_temp.getValue());
            values.put("meteo_vent",zoneMeteo_vent.getValue());
            values.put("meteo_pluie",zoneMeteo_pluie.getValue());
            values.put("concerne_ZH",zoneConcerne_ZH.getText());
            values.put("concernes_vege",zoneConcernes_vege.getText());
            values.put("dateObs",zoneDateObs.getText());
            values.put("heureObs",zoneHeureObs.getText());
            values.put("lieu_Lambert_X",zoneLieu_Lambert_X.getText());
            values.put("lieu_Lambert_Y",zoneLieu_Lambert_Y.getText());
            values.put("lobservateur",zoneLobservateur.getText());
            values.put("zh_temporaire",zoneZh_temporaire.getText());
            values.put("zh_profondeur",zoneZh_profondeur.getText());
            values.put("zh_surface",zoneZh_surface.getText());
            values.put("zh_typeMare",zoneZh_typeMare.getValue());
            values.put("zh_pente",zoneZh_pente.getValue());
            values.put("zh_ouverture",zoneZh_ouverture.getValue());
            values.put("natureVege",zoneNatureVege.getValue());
            values.put("vegetation",zoneVegetation.getText());
            values.put("idVegeLieu",zoneIdVegeLieu.getText());

            ChoixVal val = new ChoixVal("Batraciens", values);

            ArrayList<String> message = val.getMsg();
            msgLab.setText("");
            for(int i=0; i<message.size(); i++){
                msgLab.setText(msgLab.getText()+ " \n"+message.get(i));
            }
        }
        else if(event.getSource() == buttonAnnuler){
            Scene scene = buttonAnnuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("TablesBatraciens.fxml"));
            scene.setRoot(root);
        }
    }
}
