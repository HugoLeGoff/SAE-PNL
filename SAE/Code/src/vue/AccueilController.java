package vue;
import data.*;

import java.io.IOException;
import java.sql.SQLException;

import connexion.Compte;
import data.AccTest;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.*;

/**
 * This class is the controller of the Accueil page. It gets the page interactive.
 */
public class AccueilController {

    public Compte compteCo;

    @FXML private TextField login ;
    @FXML private PasswordField pw ;
    @FXML private Label msgErr ;

    @FXML
    /**
     * Initializes the action to execute when pressing a button.
     * @param event the event
     * @throws IOException IOException
     * @throws SQLException SQLException
     */
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException, SQLException{
        if(login != null && pw != null){
            AccTest test = new AccTest();
            boolean testLog = test.testMDP(this.login.getText(), this.pw.getText());
            if(testLog == true){ 
                setCompteCo();
                int statut = getStatut();
                if(statut==1){
                    Scene scene = login.getScene();
                    Parent root = FXMLLoader.load(getClass().getResource("SelectionEspeceAdmin.fxml"));
                    scene.setRoot(root);
                }
                else if(statut == 2){
                    Scene scene = login.getScene();
                    Parent root = FXMLLoader.load(getClass().getResource("Selection.fxml"));
                    scene.setRoot(root);
                }
            }
            else{
                msgErr.setText("Identifiant ou mot de passe incorrect");
            }
        }
    }

    /**
     * Sets the current account.
     */
    public void setCompteCo(){
        this.compteCo = new Compte(this.login.getText(),  this.pw.getText());
    }

    /**
     * Gets the login of the current account.
     * @return the login of the current account
     * @throws SQLException SQLException
     */
    public int getStatut() throws SQLException {
        AllData ad = new AllData();
        int ret = ad.getStatut(this.login.getText());
        return ret;
    }
}