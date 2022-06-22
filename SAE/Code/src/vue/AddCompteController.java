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
    private TextField zoneStatut;
    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonAnnuler;

    ObservableList<String> liste;
    
    @FXML
    private void initialize() throws SQLException {

        AllData ad = new AllData();
        zoneIdUser.setText(ad.getID());
    }

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == buttonAdd){
            HashMap<String,String> values = new HashMap<String,String>();
            values.put("protocole",zoneIdUser.getText());
            values.put("typeObs",zoneLogin.getText());
            values.put("leNumIndividu",zonePassw.getText());
            values.put("numObs",zoneNom.getText());
            values.put("espece",zonePrenom.getText());
            values.put("espece",zoneStatut.getText());


            ChoixVal val = new ChoixVal("Chouettes", values);

        }
        else if(event.getSource() == buttonAnnuler){
            Scene scene = buttonAnnuler.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesChouette.fxml"));
            scene.setRoot(root);
        }
    }

}
