
package vue;
import java.io.IOException;

import data.Database;
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

@FXML
    private Text actiontarget;

@FXML 
private TextField login ;

@FXML
private PasswordField pw ;


@FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        boolean estValide = Database.testMDP(this.login.getText(), this.pw.getText());
        Scene scene = actiontarget.getScene();
        Parent root = FXMLLoader.load(getClass().getResource("Selection.fxml"));
        scene.setRoot(root);
    }


}