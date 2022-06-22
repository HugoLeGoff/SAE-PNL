package vue;

import java.io.IOException;
import java.sql.SQLException;

import connexion.*;
import donnee.*;
import data.*;

import java.util.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.web.*;

import java.util.*;

/**
 * This class is the controller of the Exportation page. It gets the page interactive.
 */
public class ExportCarteDataController {

    @FXML
    private WebView webView = new WebView();

    private String especeTMP;

    public void setEspece(String espece) {
        this.especeTMP = espece;
    }


    @FXML
    private Label nom = new Label();

    
    @FXML
    private Label espece = new Label();



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
        System.out.println(webView.toString());
        
        
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

        /*else if(event.getSource() == this.deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("connexion.fxml"));
            scene.setRoot(root);
        }*/

        else if(event.getSource() == this.retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionInteraction.fxml"));
            scene.setRoot(root);
        }


    }
}