package vue;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * This class launches the whole application (this is the main class) and displays the Accueil page.
 */
public class Accueil extends Application {

@Override
    /**
     * Starts the application and displays the Accueil page.
     */
    public void start(Stage stage)
    throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
        stage.setTitle("PNR");
        stage.setScene(new Scene(root, 900,650));
        stage.show();
    }

    /**
     * Main method.
     * @param args args of the main
     */
    public static void main(String[] args) {
        Application.launch(Accueil.class, args);
    }
}