package vue;
import java.io.IOException;
import java.sql.SQLException;

import data.*;
import connexion.Compte;
import data.AccTest;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.fxml.*;




public class AccueilController {

    public Compte compteCo;

@FXML 
private TextField login ;

@FXML
private PasswordField pw ;

@FXML
private Label msgErr ;



@FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException, SQLException{
        if(login != null && pw != null){
        AccTest test = new AccTest();
        boolean testLog = test.testMDP(this.login.getText(), this.pw.getText());
        if(testLog == true){   
            setCompteCo();
            if(getStatut()==1){}
                Scene scene = login.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("SelectionEspeceAdmin.fxml"));
                scene.setRoot(root);
            }
            else if(getStatut()==2){
                Scene scene = login.getScene();
                Parent root = FXMLLoader.load(getClass().getResource("Selection.fxml"));
                scene.setRoot(root);

            }
            
            
        }
        else{
            msgErr.setText("Identifiant ou mot de passe incorrect");
        }
    }
    

    public void setCompteCo() {
        this.compteCo = new Compte(this.login.getText(),  this.pw.getText());
    }

    public int getStatut() throws SQLException {
        AllData ad = new AllData();
        int ret = ad.getStatut(this.login.getText());

        return ret;
        
    }

    

}