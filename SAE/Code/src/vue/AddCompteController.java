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



public class AddCompteController {

    
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
    private void initialize() throws SQLException {

        liste = FXCollections.observableArrayList("OBSERVATEUR","ADMINISTRATEUR");
        zoneStatut.setItems(liste);

        AllData ad = new AllData();
        zoneIdUser.setText(ad.getID());
    }

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == buttonAdd){
            HashMap<String,String> values = new HashMap<String,String>();
            values.put("idUser",zoneIdUser.getText());
            values.put("login",zoneLogin.getText());
            values.put("passw",zonePassw.getText());
            values.put("nom",zoneNom.getText());
            values.put("prenom",zonePrenom.getText());
            values.put("statut",zoneStatut.getValue());


            ChoixVal val = new ChoixVal("Comptes", values);

        }
        else if(event.getSource() == buttonAnnuler){
            Scene scene = buttonAnnuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("GestionCompte.fxml"));
            scene.setRoot(root);
        }
    }

}
