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



public class SelectionEspeceAdminController {

   
    
    @FXML Button deconnexion;

    @FXML Button buttonAdmin;

    @FXML Button hippo;

    @FXML Button gci;

    @FXML Button loutres;

    @FXML Button chouettes;

    @FXML Button batraciens;

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
            ChoixEspece espece = new ChoixEspece("Hippocampes");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }
        else if(event.getSource() == this.buttonAdmin){
            Scene scene = buttonAdmin.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionActionAdmin.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == this.batraciens){
            ChoixEspece espece = new ChoixEspece("Batraciens");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }
        else if(event.getSource() == this.loutres){
            ChoixEspece espece = new ChoixEspece("Loutres");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }
        else if(event.getSource() == this.gci){
            ChoixEspece espece = new ChoixEspece("GCI");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }
        else if(event.getSource() == this.chouettes){
            ChoixEspece espece = new ChoixEspece("Chouettes");

            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);   
        }
    }





}