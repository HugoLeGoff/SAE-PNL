package vue;
import connexion.*;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.*;

/**
 * This class is the controller of the SelectionEspece page. It gets the page interactive.
 */
public class SelectionEspeceController {

    @FXML Button deconnexion;
    @FXML Button observateur;
    @FXML Button hippo;
    @FXML Button gci;
    @FXML Button loutres;
    @FXML Button chouettes;
    @FXML Button batraciens;
    @FXML Label nom = new Label(" ");

    @FXML
    /**
     * Initializes the data already here on the page.
     */
    private void initialize() {
        Compte compte = new Compte();
        String log = compte.getLogin();
        nom.setText(log);
    }

    @FXML
    /**
     * Initializes the action to execute when pressing a button.
     * @param event the event
     * @throws IOException IOException
     */
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        if(event.getSource() == this.deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == this.hippo){
            new ChoixEspece("Hippocampes");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }
        else if(event.getSource() == this.batraciens){
            new ChoixEspece("Batraciens");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }
        else if(event.getSource() == this.loutres){
            new ChoixEspece("Loutres");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }
        else if(event.getSource() == this.gci){
            new ChoixEspece("GCI");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }
        else if(event.getSource() == this.chouettes){
            new ChoixEspece("Chouettes");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }

        else if(event.getSource() == this.observateur){
            Scene scene = observateur.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("tablesObservateur.fxml"));
            scene.setRoot(root);   
        }
    }
}
