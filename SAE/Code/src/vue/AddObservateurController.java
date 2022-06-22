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
 * This class is the controller of the AddObservateur page. It gets the page interactive.
 */
public class AddObservateurController {

    
    @FXML
    private TextField zoneIdObservateur;
   
    @FXML
    private TextField zoneNom;

    @FXML
    private TextField zonePrenom;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonAnnuler;

    ObservableList<String> liste;
    
    @FXML
    /**
     * Initializes the data already on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {

        AllData ad = new AllData();
        zoneIdObservateur.setText(ad.getID());
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
            values.put("idObservateur",zoneIdObservateur.getText());
            values.put("nom",zoneNom.getText());
            values.put("prenom",zonePrenom.getText());

            ChoixVal val = new ChoixVal("Observateur", values);

        }
        else if(event.getSource() == buttonAnnuler){
            Scene scene = buttonAnnuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesObservateur.fxml"));
            scene.setRoot(root);
        }
    }

}
