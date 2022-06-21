package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.util.ArrayList;

public class InsertData {
    private String espece;
    private ArrayList<String> values;
    private ArrayList<String> columns;
    private String table;

    public InsertData(String espece, ArrayList<String> values) {
        this.espece = espece;
        this.values = values;
        createColumns();
        this.table = choiceTable(espece);
    }


    public String choiceTable(String espece){
        String ret="";
        if(espece.equals("Hippocampes")){
            ret="obs_hippocampe";
        }else if(espece.equals("GCI")){
            ret="obs_gci";
        }else if(espece.equals("Loutres")){
            ret="obs_loutre";
        }else if(espece.equals("Batraciens")){
            ret="obs_batracien";
        }else if(espece.equals("Chouettes")){
            ret="obs_chouette";
        }
        return ret;
    }
    public void createColumns(){
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("espece");
    }

    public String requete(String table, ArrayList<String> columns,ArrayList<String> values) {
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
    public void insert(String table,ArrayList<String> columns,ArrayList<String> values){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pnr", "admin", "mdp_admin");
            Statement stmt = c.createStatement();
            String query = requete(table, columns, values);
            stmt.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
