package vue;
import java.io.IOException;
import java.sql.SQLException;

import connexion.*;
import data.AccTest;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.fxml.*;


public class SelectionEspeceController {

   
    
    @FXML Button deconnexion;

    @FXML Button hippo;

    @FXML Label nom = new Label(" ");




    @FXML
    private void initialize() {
        Compte compte = new Compte();
        String log = compte.getLogin();
        nom.setText(log);
    }

    @FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        if(event.getSource() == this.deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == this.hippo){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);
        }
    }





}