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


public class AddLoutreController {

    
    @FXML
    private TextField zoneObsL;
    @FXML
    private TextField zoneLieuDit;
    @FXML
    private ComboBox zoneIndice;
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
    private Button annuler;

    ObservableList<String> liste;
    

    
    @FXML
    private void initialize() throws SQLException {
        liste = FXCollections.observableArrayList("Positif","Negatif","Non prospection");
        zoneIndice.setItems(liste);
    }






    @FXML


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



            ChoixVal val = new ChoixVal("Hippocampes", values);

        }
    }

}
