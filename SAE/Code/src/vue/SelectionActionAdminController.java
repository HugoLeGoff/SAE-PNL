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


/**
 * This class is the controller of the SelectionActionAdmin page. It gets the page interactive.
 */
public class SelectionActionAdminController {

   
    @FXML Button admin;

    @FXML Button deconnexion;

    @FXML Button gestionSauvegarde;

    @FXML Button gestionCompte;


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
        else if(event.getSource() == this.gestionSauvegarde){
            /*Scene scene = gestionSauvegarde.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("sauvegardeBase.fxml"));
            scene.setRoot(root);*/
        }
        else if(event.getSource() == this.gestionCompte){

            Scene scene = gestionCompte.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("GestionCompte.fxml"));
            scene.setRoot(root);   
        }
        else if(event.getSource() == this.admin){

            Scene scene = admin.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionEspeceAdmin.fxml"));
            scene.setRoot(root);   
        }
    }





}