package vue;
import java.io.IOException;
import java.sql.SQLException;

import connexion.Compte;
import donnee.ObsHippocampes;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.*;


public class HippoController {

    @FXML
    private Stage stageRetour;

    @FXML
    private Button pop;

    @FXML
    private Button retour;

    @FXML
    private Button buttonAdd;

    @FXML
    private TextField zoneObsH;

    @FXML
    private TextField zoneEspace;

    @FXML
    private TextField zoneSexe;

    @FXML
    private TextField zoneTemperatureEau;

    @FXML
    private TextField zoneTypeDePeche;

    @FXML
    private TextField zoneTaille;

    @FXML
    private TextField zoneGestant;

    @FXML
    private TableView<ObsHippocampes> tableau;

    @FXML
    private TableColumn<ObsHippocampes, String> colObsH;

    /*
    public HippoController (Stage stageRetour){
        try{
			if(stageRetour==null){
				throw new IllegalArgumentException("L'indice est null");
			}else{
				this.stageRetour = stageRetour; 
			}

		}catch(IllegalArgumentException i){
			i.printStackTrace();
		}
    }
    */

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        if (event.getSource() == pop){
            popUp();
           
        } else if (event.getSource() == buttonAdd) {
            ajouterTuple();
        }
        else if(event.getSource() == retour){
            stageRetour.show();

        }
    }

    @FXML
    protected void popUp () throws IOException{
        Scene scene = pop.getScene();
        Stage stage = new Stage(); 
        Parent root = FXMLLoader.load(getClass().getResource("addHippo.fxml"));
        scene.setRoot(root);
        stage.setScene(scene);
        stage.setTitle("Ajout de tuples");
        stage.show();
    }

    @FXML
    protected void ajouterTuple () throws IOException{
        zoneObsH.setText("test");
        tableau = new TableView<ObsHippocampes>();

        colObsH 
        = new TableColumn<ObsHippocampes, String>("test");
    }

} 