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

/**
 * This class is the controller of the SauvegardeBase page. It gets the page interactive.
 */
public class SauvegardeBaseController {
    @FXML Button deconnexion;

    @FXML Button sauvegarder;

    @FXML Button admin;

    @FXML private Button retour;

    @FXML Label nom = new Label(" ");
    



    @FXML
    /**
     * Initializes the data already created on the page.
     * @throws SQLException SQLException
     */
    private void initialize() {

        Compte compte = new Compte();
        String log = compte.getLogin();
        nom.setText(log);
    }

    @FXML

    /**
     * Initializes the action to execute when pressing a button.
     * @param event the event
     * @throws IOException IOException
     */
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException, InterruptedException{
        if(event.getSource() == this.deconnexion){
            Scene scene = deconnexion.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            scene.setRoot(root);
        } else if(event.getSource() == this.admin){
            Scene scene = admin.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionActionAdmin.fxml"));
            scene.setRoot(root);
        } else if(event.getSource() == this.retour){
            Scene scene = retour.getScene();
            Parent root = FXMLLoader.load(getClass().getResource("SelectionActionAdmin.fxml"));
            scene.setRoot(root); 
        } else if(event.getSource() == this.sauvegarder){
            saves();
            /*
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
            }*/
        }
    }
    
    private void saves() throws IOException, InterruptedException {
                    //"mysqldump -u <your login> --password=<your password> <database name to clone> | mysql -u root --password=<your password> <new database name>";
                    //mysqldump -u login_mysql -p password_mysql --databases nom_bdd > dump_bdd.sql
                    //"mysqldump -u 'admin'@'localhost' -p mdp_admin --databases bd_pnr > BackUp.sql"
                    //"mysqldump -u admin@localhost --password=mdp_admin bd_pnr | mysql -u admin@localhost --password=mdp_admin backup"
        //String command = "mysqldump -u admin@localhost --password=mdp_admin bd_pnr | mysql -u admin@localhost --password=mdp_admin backup";

        //Process p = Runtime.getRuntime().exec(new String[]{"bash","-c",command});
        //p.waitFor();

        ProcessBuilder processBuilder = new ProcessBuilder();

	    // -- Linux --

	    // Run a shell command
	    processBuilder.command("sql", "-c", "touch ./cat ");
    }
}
