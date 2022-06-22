package vue;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Accueil extends Application {

@Override
    public void start(Stage stage)
    throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
        stage.setTitle("PNR");
        stage.setScene(new Scene(root, 900,650));
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Accueil.class, args);
    }
}