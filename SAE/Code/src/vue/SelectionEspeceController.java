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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.fxml.*;


public class SelectionEspeceController {

    @FXML
    private ImageView action;
    
    @FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        Scene scene = action.getScene();
        System.out.println("aeaze");
        Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
        scene.setRoot(root);
    }

}
