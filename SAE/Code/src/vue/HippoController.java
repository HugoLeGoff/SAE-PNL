
package vue;
import java.io.IOException;
import java.sql.SQLException;

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




public class HippoController {

@FXML
    private Text actiontarget;

@FXML 
    private TextField login ;

@FXML
    private PasswordField pw ;


@FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException, SQLException{
        Scene scene = actiontarget.getScene();
        Parent root = FXMLLoader.load(getClass().getResource("Selection.fxml"));
        scene.setRoot(root);
    }


}