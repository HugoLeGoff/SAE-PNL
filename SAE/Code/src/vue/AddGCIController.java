package vue;
import data.*;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import java.util.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;

/**
 * This class is the controller of the AddGCI page. It gets the page interactive.
 */
public class AddGCIController {
    @FXML private Label msgLab = new Label();
    @FXML private TextField zoneObsG;
    @FXML private TextField zoneNombre;
    @FXML private TextField zonePresentMaisNonObs;
    @FXML private TextField zoneIdNid;
    @FXML private TextField zoneNomPlage;
    @FXML private ComboBox<String> zoneNature;
    @FXML private ComboBox<String> zoneRaisonArretObservation;
    @FXML private TextField zoneProtection;
    @FXML private TextField zoneBagueMale;
    @FXML private TextField zoneBagueFemelle;
    @FXML private TextField zoneDateObs;
    @FXML private TextField zoneHeureObs;
    @FXML private TextField zoneLieu_Lambert_X;
    @FXML private TextField zoneLieu_Lambert_Y;
    @FXML private TextField zoneIdObservateur;
    @FXML private Button buttonAdd;
    @FXML private Button buttonAnnuler;
    ObservableList<String> liste;

    @FXML
     /**
     * Initializes the data already on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {
        liste = FXCollections.observableArrayList("Oeuf","Poussin","Nid");
        zoneNature.setItems(liste);

        liste = FXCollections.observableArrayList("Envol", "Inconnu", "Maree", "Pietinement", "Prédation");
        zoneRaisonArretObservation.setItems(liste);

        AllData ad = new AllData();
        zoneObsG.setText(ad.getID());
    }

    @FXML
    /**
     * Initializes the action to execute when pressing a button.
     * @param event event
     * @throws IOException IOException
     * @throws SQLIntegrityConstraintViolationException SQLIntegrityConstraintViolationException
     */
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException, SQLIntegrityConstraintViolationException{
        if(event.getSource() == buttonAdd){
            HashMap<String,String> values = new HashMap<String,String>();
            values.put("obsH",zoneObsG.getText());
            values.put("espece",zoneNombre.getText());
            values.put("sexe",zonePresentMaisNonObs.getText());
            values.put("temperatureEau",zoneIdNid.getText());
            values.put("typePeche",zoneNomPlage.getText());
            values.put("taille",zoneNature.getValue());
            values.put("gestant",zoneRaisonArretObservation.getValue());
            values.put("dateObs",zoneProtection.getText());
            values.put("heureObs",zoneBagueMale.getText());
            values.put("lieu_Lambert_X",zoneBagueFemelle.getText());
            values.put("lieu_Lambert_Y",zoneDateObs.getText());
            values.put("lObservateur",zoneHeureObs.getText());
            values.put("nom",zoneLieu_Lambert_X.getText());
            values.put("prenom",zoneLieu_Lambert_Y.getText());
            values.put("prenom",zoneIdObservateur.getText());

            ChoixVal val = new ChoixVal("GCI", values);

            ArrayList<String> message = val.getMsg();
            msgLab.setText("");
            for(int i=0; i<message.size(); i++){
                msgLab.setText(msgLab.getText()+ " \n"+message.get(i));
            }

        }
        if(event.getSource() == buttonAnnuler){
            Scene scene = buttonAnnuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesGCI.fxml"));
            scene.setRoot(root);
        }
    }
}
