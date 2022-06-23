package vue;
import connexion.*;
import data.*;

import java.io.IOException;
import java.sql.SQLException;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.web.*;

/**
 * This class is the controller of the Exportation page. It gets the page interactive.
 */
public class ExportCarteDataController {

    @FXML private WebView webView = new WebView();
    @FXML private Label nom = new Label();
    @FXML private Label espece = new Label();
    @FXML private Button deconnexion;
    @FXML private Button test1;
    @FXML private Button retour;
    ObservableList<String> liste;

    @FXML
    /**
     * Initializes the data already created on the page.
     * @throws SQLException SQLException
     */
    private void initialize() throws SQLException {
    
        Compte compte = new Compte();
        String log = compte.getLogin();
        nom.setText(log);

        ChoixEspece especeChoix = new ChoixEspece();
        String nomEspece = especeChoix.getEspece();
        espece.setText(nomEspece);

        webView.getEngine().load("https://umap.openstreetmap.fr/fr/map/new/");
    }

    @FXML
    /**
     * Initializes the action to execute when pressing a button.
     * @param event the event
     * @throws IOException IOException
     */
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == test1){
            try{
                ChoixEspece especeChoix = new ChoixEspece();
                String nomEspece = especeChoix.getEspece();

                    ExportCarteData fichier = new ExportCarteData(nomEspece+"carte.csv", nomEspece);
                    fichier.exportData();
            
            }catch(NumberFormatException nfe){
                System.out.println(nfe);
            } 
        }

        else if(event.getSource() == this.deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("connexion.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == this.retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);
        }
    }
}