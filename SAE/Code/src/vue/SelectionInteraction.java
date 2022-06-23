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
 * This class is the controller of the SelectionInteraction page. It gets the page interactive.
 */
public class SelectionInteraction {

    private String especeTMP;
    @FXML private Button gestionDo;
    @FXML private Button deconnexion;
    @FXML private Button consultation;
    @FXML private Button exportation;
    @FXML private Button retour;
    @FXML private Label espece = new Label();
    @FXML private Label nom = new Label();

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