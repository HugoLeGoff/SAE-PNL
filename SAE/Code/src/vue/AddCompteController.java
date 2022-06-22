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
 * This class is the controller of the AddChouette page. It gets the page interactive.
 */
public class AddCompteController {

    @FXML
    private Label msgLab = new Label(" ");
    @FXML
    private TextField zoneIdUser;
    @FXML
    private TextField zoneLogin;
    @FXML
    private TextField zonePassw;
    @FXML
    private TextField zoneNom;
    @FXML
    private TextField zonePrenom;
    @FXML
    private ComboBox<String> zoneStatut;
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

        liste = FXCollections.observableArrayList("OBSERVATEUR","ADMINISTRATEUR");
        zoneStatut.setItems(liste);

        AllData ad = new AllData();
        zoneIdUser.setText(ad.getID());
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
            values.put("idU",zoneIdUser.getText());
            values.put("nom",zoneLogin.getText());
            values.put("prenom",zonePassw.getText());
            values.put("login",zoneNom.getText());
            values.put("passw",zonePrenom.getText());
            values.put("nomStatut",zoneStatut.getValue());


            ChoixVal val = new ChoixVal("Comptes", values);

            ArrayList<String> message = val.getMsg();
            msgLab.setText("");
            for(int i=0; i<message.size(); i++){
                msgLab.setText(msgLab.getText()+ " \n"+message.get(i));
            }

        }
        else if(event.getSource() == buttonAnnuler){
            Scene scene = buttonAnnuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("GestionCompte.fxml"));
            scene.setRoot(root);
        }
    }

}
