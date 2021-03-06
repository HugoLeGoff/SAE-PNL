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
 * This class is the controller of the AddChouette page. It gets the page interactive.
 */
public class AddChouetteController {

    @FXML private Label msgLab = new Label(" ");
    @FXML private TextField zoneProtocole;
    @FXML private ComboBox<String> zoneTypeObs;
    @FXML private TextField zoneLeNumIndividu;
    @FXML private TextField zoneNumObs;
    @FXML private ComboBox<String> zoneEspece;
    @FXML private ComboBox<String> zoneSexe;
    @FXML private TextField zoneDateObs;
    @FXML private TextField zoneHeureObs;
    @FXML private TextField zoneLieu_Lambert_X;
    @FXML private TextField zoneLieu_Lambert_Y;
    @FXML private TextField zoneIdObservation;
    @FXML private Button buttonAdd;
    @FXML private Button buttonAnnuler;

    ObservableList<String> liste;
    
    @FXML
    /**
     * Initializes the data already on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {
        liste = FXCollections.observableArrayList("SONORE","VISUEL","SONORE_VISUELLE");
        zoneTypeObs.setItems(liste);

        liste = FXCollections.observableArrayList("EFFRAIE","HULOTTE","CHEVECHE");
        zoneEspece.setItems(liste);

        liste = FXCollections.observableArrayList("MALE","FEMELLE","INCONNU");
        zoneSexe.setItems(liste);

        AllData ad = new AllData();
        zoneNumObs.setText(ad.getID());
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
            values.put("protocole",zoneProtocole.getText());
            values.put("typeObs",zoneTypeObs.getValue());
            values.put("leNumIndividu",zoneLeNumIndividu.getText());
            values.put("numObs",zoneNumObs.getText());
            values.put("espece",zoneEspece.getValue());
            values.put("sexe",zoneSexe.getValue());
            values.put("dateObs",zoneDateObs.getText());
            values.put("heureObs",zoneHeureObs.getText());
            values.put("lieu_Lambert_X",zoneLieu_Lambert_X.getText());
            values.put("lieu_Lambert_Y",zoneLieu_Lambert_Y.getText());
            values.put("lObservateur",zoneIdObservation.getText());

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
