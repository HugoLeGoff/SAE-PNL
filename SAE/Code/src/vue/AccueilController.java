
package vue;
import java.io.IOException;

import data.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.fxml.*;




public class AccueilController {

@FXML
    private Text actiontarget;
@FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        Scene scene = actiontarget.getScene();
        Parent root = FXMLLoader.load(getClass().getResource("Selection.fxml"));
        scene.setRoot(root);
    }
}