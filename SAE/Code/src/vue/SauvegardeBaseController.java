package vue;

import connexion.*;
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


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SauvegardeBaseController {
     @FXML Button deconnexion;

    @FXML Button sauvegarder;

    @FXML
    private Button retour;

    @FXML Label nom = new Label(" ");
    



    @FXML
    private void initialize() {

        Compte compte = new Compte();
        String log = compte.getLogin();
        nom.setText(log);
    }

    @FXML


    protected void handleSubmitButtonAction(ActionEvent event) throws IOException{
        if(event.getSource() == this.deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == this.retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionActionAdmin.fxml"));
            scene.setRoot(root);
        }
        else if(event.getSource() == this.sauvegarder){
            ProcessBuilder processBuilder= new ProcessBuilder();
  
            List<String> builderList = new ArrayList<>();
    
            // add the list of commands to a list
            builderList.add("mysqldump -u admin -pmdp_admin bd_pnr > backup_bd_pnr_$(date +%Y-%m-%d--%H-%M-%S).sql");
    
            try {
                // Using the list , trigger the command
                processBuilder.command(builderList);
                Process process = processBuilder.start();
    
                // To read the output list
                BufferedReader reader
                    = new BufferedReader(new InputStreamReader(
                        process.getInputStream()));
    
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
    
                int exitCode = process.waitFor();
                System.out.println("\nExited with error code : "
                                + exitCode);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
