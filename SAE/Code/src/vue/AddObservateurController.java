package vue;
import java.io.IOException;
import java.sql.SQLException;

import data.*;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;


/**
 * This class is the controller of the AddObservateur page. It gets the page interactive.
 */
public class AddObservateurController {

    @FXML
    private Label msgLab = new Label();
    
    @FXML
    private TextField zoneIdObservateur;
   
    @FXML
    private TextField zoneNom;

    @FXML
    private TextField zonePrenom;

    @FXML
    private Button buttonAdd;
    
    @FXML
    private Button retour;

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
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException, NumberFormatException, SQLException{
        if(event.getSource() == buttonAdd){

            AllData ad = new AllData();
            ad.addObservateur(Integer.valueOf(zoneIdObservateur.getText()),zoneNom.getText(), zonePrenom.getText());


            String message = ad.getMsg();
            msgLab.setText(message);
            

        }
        else if(event.getSource() == buttonAnnuler){
            Scene scene = buttonAnnuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesObservateur.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesObservateur.fxml"));
            scene.setRoot(root);
        }
    }

}
