package vue;
import java.io.IOException;
import java.sql.SQLException;

import data.*;
import java.util.*;
import donnee.AfficheObsHippocampes;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;



public class AddBatracienController {

    
    @FXML
    private TextField zoneObsB;
    @FXML
    private ComboBox<String> zoneEspece;
    @FXML
    private TextField zoneNombreAdultes;
    @FXML
    private TextField zoneNombreAmplexus;
    @FXML
    private TextField zoneNombrePonte;
    @FXML
    private TextField zoneNombreTetard;
    @FXML
    private TextField zoneTemperature;
    @FXML
    private TextField zoneMeteo_ciel;
    @FXML
    private TextField zoneMeteo_temp;
    @FXML
    private TextField zoneMeteo_vent;
    @FXML
    private TextField zoneMeteo_pluie;
    @FXML
    private TextField zoneConcerne_ZH;
    @FXML
    private TextField zoneConcernes_vege;
    @FXML
    private TextField zoneDateObs;
    @FXML
    private TextField zoneHeureObs;
    @FXML
    private TextField zoneLieu_Lambert_X;
    @FXML
    private TextField zoneLieu_Lambert_Y;
    @FXML
    private TextField zoneLobservateur;
    @FXML
    private TextField zoneZh_temporaire;
    @FXML
    private TextField zoneZh_profondeur;
    @FXML
    private TextField zoneZh_surface;
    @FXML
    private TextField zoneZh_typeMare;
    @FXML
    private TextField zoneZh_pente;
    @FXML
    private TextField zoneZh_ouverture;
    @FXML
    private TextField zoneNatureVege;
    @FXML
    private TextField zoneIdVegeLieu;
    @FXML
    private TextField zoneVegetation;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonAnnuler;

    @FXML
    private Label msgLab = new Label(" ");


    ObservableList<String> liste;
    
    @FXML
    private void initialize() throws SQLException {
        liste = FXCollections.observableArrayList("CALAMITE","PELODYTE");
        zoneEspece.setItems(liste);

        AllData ad = new AllData();
        zoneObsB.setText(ad.getID());
    }

    @FXML
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
            values.put("meteo_ciel",zoneMeteo_ciel.getText());
            values.put("meteo_temp",zoneMeteo_temp.getText());
            values.put("meteo_vent",zoneMeteo_vent.getText());
            values.put("meteo_pluie",zoneMeteo_pluie.getText());
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
            values.put("zh_typeMare",zoneZh_typeMare.getText());
            values.put("zh_pente",zoneZh_pente.getText());
            values.put("zh_ouverture",zoneZh_ouverture.getText());
            values.put("natureVege",zoneIdVegeLieu.getText());
            values.put("idVegeLieu",zoneVegetation.getText());


            ChoixVal val = new ChoixVal("Chouettes", values);

            ArrayList<String> message = val.getMsg();
            msgLab.setText("");
            for(int i=0; i<message.size(); i++){
                msgLab.setText(msgLab.getText()+ " \n"+message.get(i));
            }
        

        }
        else if(event.getSource() == buttonAnnuler){
            Scene scene = buttonAnnuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesChouette.fxml"));
            scene.setRoot(root);
        }
    }

}
