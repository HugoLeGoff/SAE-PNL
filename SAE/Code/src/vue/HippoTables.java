import java.io.IOException;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.fxml.*;


public class HippoTables {

    @FXML
    private Button modifier;

    @FXML
    private Button renommer;

    @FXML
    private Button supprimmer;

    @FXML
    private Button plus;

    @FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{

        if(event.getSource() == modifier){
            Scene scene = modifier.getScene();
            System.out.println("aeaze");
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }

        else if(event.getSource() == renommer){
            Scene scene = modifier.getScene();
            System.out.println("aeaze");
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }       
        
        else if(event.getSource() == supprimmer){
            Scene scene = modifier.getScene();
            System.out.println("aeaze");
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }

        if(event.getSource() == plus){
            Scene scene = modifier.getScene();
            System.out.println("aeaze");
            Parent root = FXMLLoader.load(getClass().getResource("tableshippo.fxml"));
            scene.setRoot(root);
        }
    }

}