package vue;
import java.io.IOException;
import java.sql.SQLException;

import data.AccTest;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.fxml.*;


public class HippoController {

    @FXML
    private Button ouvrirNewTuples;

    @FXML
    private Button buttonAdd;

    @FXML
    private TextField zoneObsH;

    @FXML
    private TextField zoneEspace;

    @FXML
    private TextField zoneSexe;

    @FXML
    private TextField zoneTemperatureEau;

    @FXML
    private TextField zoneTypeDePeche;

    @FXML
    private TextField zoneTaille;

    @FXML
    private TextField zoneGestant;
        
    
    @FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        if (event.getSource() == ouvrirNewTuples){
            popUp();
        } else if (event.getSource() == buttonAdd) {
            ajouterTuple();
        }

    }

    protected void popUp () throws IOException{
        Scene scene = ouvrirNewTuples.getScene();
        Stage stage = new Stage(); 
        Parent root = FXMLLoader.load(getClass().getResource("addHippo.fxml"));
        scene.setRoot(root);
        stage.setScene(scene);
        stage.setTitle("Ajout de tuples");
        stage.show();
    }

    protected void ajouterTuple () throws IOException{
        zoneObsH.setText("test");
    }
    
}