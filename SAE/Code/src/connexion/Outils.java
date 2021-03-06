package connexion;

import java.io.*;
import java.io.File;

import java.util.*;

/**
 * This class creates the tools.
 */
public class Outils {

    /**
     * Writes in a file
     * @param dataList dataList
     * @param nameFile nameFile
     */
    public static void writeFile(ArrayList<String> dataList, String nameFile){
        try {
            File suppfile = new File(nameFile);
            suppfile.delete();
            File file = new File(nameFile);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
                FileWriter myWriter = new FileWriter(nameFile);
                for (String string : dataList) {
                    myWriter.write(string + "\n");
            
                }
                myWriter.close();
            } 
            else {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Reads the file
     * @param nameFile nameFile
     * @return the file
     */
    public static ArrayList<String> readFile(String nameFile){
        ArrayList<String> data = new ArrayList<String>();
        try {

            File myObj = new File(nameFile);

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data.add(myReader.nextLine());
            }
            myReader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        return data;
    }
}
    

