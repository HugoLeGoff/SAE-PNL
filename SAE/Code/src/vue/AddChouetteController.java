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



public class AddChouetteController {

    
    @FXML
    private TextField zoneProtocole;
    @FXML
    private ComboBox<String> zoneTypeObs;
    @FXML
    private TextField zoneLeNumIndividu;
    @FXML
    private TextField zoneNumObs;
    @FXML
    private ComboBox<String> zoneEspece;
    @FXML
    private ComboBox<String> zoneSexe;
    @FXML
    private TextField zoneDateObs;
    @FXML
    private TextField zoneHeureObs;
    @FXML
    private TextField zoneLieu_Lambert_X;
    @FXML
    private TextField zoneLieu_Lambert_Y;
    @FXML
    private TextField zoneIdObservation;
    @FXML
    private Button buttonAdd;

    @FXML
    private Button annuler;

    ObservableList<String> liste;
    
    @FXML
    private void initialize() throws SQLException {
        liste = FXCollections.observableArrayList("SONORE","VISUELLE","SONORE_VISUELLE");
        zoneTypeObs.setItems(liste);

        liste = FXCollections.observableArrayList("EFFRAIE","HULOTTE","CHEVECHE");
        zoneEspece.setItems(liste);

        liste = FXCollections.observableArrayList("MALE","FEMELLE","INCONNU");
        zoneSexe.setItems(liste);

        AllData ad = new AllData();
        zoneNumObs.setText(ad.getID());
    }

    @FXML
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

        }
    }

}
