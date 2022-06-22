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

/**
 * This class is the controller of the AddHippo page. It gets the page interactive.
 */
public class AddLoutreController {

    @FXML
    private Label msg;
    @FXML
    private TextField zoneObsL;
    @FXML
    private TextField zoneLieuDit;
    @FXML
    private ComboBox<String> zoneIndice;
    @FXML
    private TextField zoneIdObs;
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
    private TextField zoneIdObservateur;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonAnnuler;
    @FXML
    private Label msgLab = new Label(" ");


    ObservableList<String> liste;
    

    
    @FXML
    /**
     * Initializes the data already on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {
        liste = FXCollections.observableArrayList("Positif","Negatif","Non prospection");
        zoneIndice.setItems(liste);

        AllData ad = new AllData();
        zoneObsL.setText(ad.getID());
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
            values.put("obsL",zoneObsL.getText());
            values.put("lieuDit",zoneLieuDit.getText());
            values.put("indice",zoneIndice.getValue());
            values.put("dateObs",zoneDateObs.getText());
            values.put("heureObs",zoneHeureObs.getText());
            values.put("lieu_Lambert_X",zoneLieu_Lambert_X.getText());
            values.put("lieu_Lambert_Y",zoneLieu_Lambert_Y.getText());
            values.put("lObservateur",zoneIdObservateur.getText());



            ChoixVal val = new ChoixVal("Loutres", values);

            ArrayList<String> message = val.getMsg();
            msgLab.setText("");
            for(int i=0; i<message.size(); i++){
                msgLab.setText(msgLab.getText()+ " \n"+message.get(i));
            }




        }
        if(event.getSource() == buttonAnnuler){
            Scene scene = buttonAnnuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesLoutre.fxml"));
            scene.setRoot(root);
        }
    }

}
