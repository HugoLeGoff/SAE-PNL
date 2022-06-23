package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.util.ArrayList;

/**
 * Inserts the data
 */
public class InsertData {

    private ArrayList<String> values;
    private ArrayList<String> columns;
    private String table;
    private String message = new String("Ajout réussi");

    /**
     * Builder that creates the object
     * @param table table
     */
    public InsertData(String table) {
        this.values = new ArrayList<String>();
        this.columns=new ArrayList<String>();
        this.table = table;
    }


    /**
     * Sets colums
     * @param columns columns
     */
    public void setColumns(ArrayList<String> columns) {
        this.columns = columns;
    }

    /**
     * Sets values
     * @param values values
     */
    public void setValues(ArrayList<String> values) {
        this.values = values;
    }

    /**
     * Sets table
     * @param table table
     */
    public void setTable(String table) {
        this.table = table;
    }

    /**
     * Creates a query
     * @return a query
     */
    public String requete() {
        int i=0;
        String query = "INSERT INTO " + table + " (";
        for (String s : columns) {
            query += s;
            if (i < columns.size() - 1) {
                query += ", ";
            }
            i++;
        }
        i=0;
        query += ") VALUES (";
        for (String s : values) {
            query += "'" + s + "'";
            if (i < values.size() - 1) {
                query += ", ";
            }
            i++;
        }
        query += ");";

        return query;
    }

    /**
     * Inserta data
     */
    public void insert(){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            Statement stmt = c.createStatement();
            String query = requete();
            stmt.executeUpdate(query);
            c.close();
        }catch(Exception e){
            System.out.println(e);
            this.message = e.getMessage();
        }
    }

    /**
     * Gets the message
     * @return the message
     */
    public String getMsg() {
        return message;
    }
}
