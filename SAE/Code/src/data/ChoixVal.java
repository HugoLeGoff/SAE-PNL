package data;

import java.util.ArrayList;
import java.util.HashMap;


public class ChoixVal {
    private HashMap<String,String> valuesTotal;
    private ArrayList<String> values;
    private ArrayList<String> columns;
    private String espece;
    private InsertData insertData;
    public ChoixVal(HashMap<String,String> values) {
        this.valuesTotal = values;
        this.espece = valuesTotal.get("espece");
        insertData=new InsertData(espece);
    }
    public void remplirValues(){
        values=new ArrayList<String>();
        for(String s : columns){
            values.add(valuesTotal.get(s));
        }
        
    }
    public void insertEspece(){
        if(espece.equals("Hippocampes")){
            insertData.setTable("Lieu");
            columns.add("coord_Lambert_X");
            columns.add("coord_Lambert_Y");
            values.add(valuesTotal.get("lieu_Lambert_X"));
            values.add(valuesTotal.get("lieu_Lambert_Y"));
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            columns=new ArrayList<String>();
            columns.add("dateObs");
            columns.add("heureObs");
            columns.add("lieu_Lambert_X");
            columns.add("lieu_Lambert_Y");
            remplirValues();
            columns.add("idObs");
            values.add(valuesTotal.get("obsH"));
            insertData.setTable("Observation");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            columns=new ArrayList<String>();
            columns.add("obsH");
            columns.add("espece");
            columns.add("sexe");
            columns.add("temperatureEau");
            columns.add("typePeche");
            columns.add("taille");
            columns.add("gestant");
            remplirValues();
            insertData.setTable("Obs_Hippocampe");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            columns=new ArrayList<String>();
            values=new ArrayList<String>();
            columns.add("lObservation");
            columns.add("lObservateur");
            values.add(valuesTotal.get("obsH"));
            values.add(valuesTotal.get("lObservateur"));
            insertData.setTable("AObserve");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
        }
        else if(espece.equals("GCI")){
            insertData.setTable("Lieu");
            columns.add("coord_Lambert_X");
            columns.add("coord_Lambert_Y");
            values.add(valuesTotal.get("lieu_Lambert_X"));
            values.add(valuesTotal.get("lieu_Lambert_Y"));
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            columns=new ArrayList<String>();
            
        }
        else if(espece.equals("Loutres")){
            insertData.setTable("Lieu");
            columns.add("coord_Lambert_X");
            columns.add("coord_Lambert_Y");
            values.add(valuesTotal.get("lieu_Lambert_X"));
            values.add(valuesTotal.get("lieu_Lambert_Y"));
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            
        }
        else if(espece.equals("Batraciens")){
            insertData.setTable("Lieu");
            columns.add("coord_Lambert_X");
            columns.add("coord_Lambert_Y");
            values.add(valuesTotal.get("lieu_Lambert_X"));
            values.add(valuesTotal.get("lieu_Lambert_Y"));
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            
        }
        else if(espece.equals("Chouettes")){
            insertData.setTable("Lieu");
            columns.add("coord_Lambert_X");
            columns.add("coord_Lambert_Y");
            values.add(valuesTotal.get("lieu_Lambert_X"));
            values.add(valuesTotal.get("lieu_Lambert_Y"));
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            
        }
    }
}
