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
 * This class is the controller of the SelectionInteraction page. It gets the page interactive.
 */
public class SelectionInteraction {

    private String especeTMP;

    
    @FXML Button gestionDo;

    @FXML Button deconnexion;

    @FXML Button consultation;

    @FXML Button exportation;

    @FXML Button retour;

    @FXML Label espece = new Label();



    @FXML Label nom = new Label();




    @FXML
    /**
     * Initializes the data already here on the page.
     */
    private void initialize() {
        Compte compte = new Compte();
        String log = compte.getLogin();
        nom.setText(log);

        ChoixEspece especeChoix = new ChoixEspece();
        String nomEspece = especeChoix.getEspece();
        espece.setText(nomEspece);
        especeTMP = nomEspece;


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
        
        else if(event.getSource() == gestionDo){
            if(especeTMP.equals("Hippocampes")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("Batraciens")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("TablesBatraciens.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("Chouettes")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("tableschouette.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("GCI")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("tablesGCI.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("Loutres")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("tablesLoutre.fxml"));
                scene.setRoot(root);
            }
        }
        
        

        else if(event.getSource() == this.consultation){
            if(especeTMP.equals("Hippocampes")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("VisuTablesHippo.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("Batraciens")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("VisuTablesBatraciens.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("Chouettes")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("VisuTablesChouette.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("GCI")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("VisuTablesGCI.fxml"));
                scene.setRoot(root);
            }
            else if(especeTMP.equals("Loutres")){
                Scene scene = gestionDo.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("VisuTablesLoutre.fxml"));
                scene.setRoot(root);
            }
        }

        else if(event.getSource() == this.exportation){
            Scene scene = exportation.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Exportation.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == this.retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Selection.fxml"));
            scene.setRoot(root);
        }
    }





}