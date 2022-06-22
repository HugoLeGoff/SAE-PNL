package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.util.ArrayList;

public class InsertData {

    private ArrayList<String> values;
    private ArrayList<String> columns;
    private String table;
    private String message = new String("Ajout réussi");


    public InsertData(String table) {
        this.values = new ArrayList<String>();
        this.columns=new ArrayList<String>();
        this.table = table;
    }


    public void setColumns(ArrayList<String> columns) {
        this.columns = columns;
    }
    public void setValues(ArrayList<String> values) {
        this.values = values;
    }
    public void setTable(String table) {
        this.table = table;
    }

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
    public void insert(){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            Statement stmt = c.createStatement();
            String query = requete();
            stmt.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
            this.message = e.getMessage();
        }
    }
    public String getMsg() {
        return message;
    }
}
