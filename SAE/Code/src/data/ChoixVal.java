package data;

import java.util.ArrayList;
import java.util.HashMap;


public class ChoixVal {
    private HashMap<String,String> valuesTotal;
    private ArrayList<String> values;
    private ArrayList<String> columns;
    private String espece;
    private InsertData insertData;

    public ChoixVal(String espece, HashMap<String,String> values) {
        this.valuesTotal = values;
        this.espece = espece;
        this.values = new ArrayList<String>();
        this.columns=new ArrayList<String>();
        insertData=new InsertData(espece);
        insertEspece();

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
            columns=new ArrayList<String>();
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
            columns=new ArrayList<String>();
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
            values.add(valuesTotal.get("obsG"));
            insertData.setTable("Observation");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            columns.add("idNid");
            columns.add("nomPlage");
            columns.add("raisonArretObservation");
            columns.add("nbEnvol");
            columns.add("protection");
            columns.add("bagueMale");
            columns.add("bagueFemelle");
            remplirValues();
            insertData.setTable("Nid_GCI");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            columns.add("obsG");
            columns.add("nature");
            columns.add("nombre");
            columns.add("presentMaisNonObs");
            remplirValues();
            columns.add("leNid");
            values.add(valuesTotal.get("idNid"));
            insertData.setTable("Obs_GCI");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            values=new ArrayList<String>();
            columns.add("lObservation");
            columns.add("lObservateur");
            values.add(valuesTotal.get("obsG"));
            values.add(valuesTotal.get("idObservateur"));
            insertData.setTable("AObserve");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();



            
        }
        else if(espece.equals("Loutres")){
            insertData.setTable("Lieu");
            columns=new ArrayList<String>();
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
            values.add(valuesTotal.get("obsL"));
            insertData.setTable("Observation");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            columns.add("obsL");
            columns.add("commune");
            columns.add("lieuDit");
            columns.add("indice");
            remplirValues();
            insertData.setTable("Obs_Loutre");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();


            columns=new ArrayList<String>();
            values=new ArrayList<String>();
            columns.add("lObservation");
            columns.add("lObservateur");
            values.add(valuesTotal.get("obsL"));
            values.add(valuesTotal.get("idObservateur"));
            insertData.setTable("AObserve");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            
        }
        else if(espece.equals("Batraciens")){
            insertData.setTable("Lieu");
            columns=new ArrayList<String>();
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
            values.add(valuesTotal.get("obsL"));
            insertData.setTable("Observation");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            columns.add("idVegeLieu");
            remplirValues();
            insertData.setTable("Lieu_Vegetation");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            columns.add("natureVege");
            columns.add("vegetation");
            remplirValues();
            columns.add("idVege");
            columns.add("decrit_LieuVege");
            values.add(valuesTotal.get("concerne_vege"));
            values.add(valuesTotal.get("idVegeLieu"));
            insertData.setTable("Vegetation");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            columns.add("zh_temporaire");
            columns.add("zh_profondeur");
            columns.add("zh_surface");
            columns.add("zh_typeMare");
            columns.add("zh_pente");
            columns.add("zh_ouverture");
            remplirValues();
            columns.add("zh_id");
            values.add(valuesTotal.get("concerne_zh"));
            insertData.setTable("ZoneHumide");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            columns.add("obsB");
            columns.add("espece");
            columns.add("nombreAdultes");
            columns.add("nombreAmplexus");
            columns.add("nombrePonte");
            columns.add("nombreTetard");
            columns.add("temperature");
            columns.add("meteo_ciel");
            columns.add("meteo_temp");
            columns.add("meteo_vent");
            columns.add("meteo_pluie");
            columns.add("concernce_zh");
            columns.add("concernce_vege");
            remplirValues();
            insertData.setTable("Obs_Batracien");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();


            columns=new ArrayList<String>();
            values=new ArrayList<String>();
            columns.add("lObservation");
            columns.add("lObservateur");
            values.add(valuesTotal.get("obsB"));
            values.add(valuesTotal.get("lObservateur"));
            insertData.setTable("AObserve");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            
        }
        else if(espece.equals("Chouettes")){
            insertData.setTable("Lieu");
            columns=new ArrayList<String>();
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
            values.add(valuesTotal.get("numObs"));
            insertData.setTable("Observation");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            columns.add("espece");
            columns.add("sexe");
            remplirValues();
            columns.add("numIndividu");
            values.add(valuesTotal.get("leNumIndividu"));
            insertData.setTable("Chouette");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();

            columns=new ArrayList<String>();
            columns.add("protocole");
            columns.add("typeObs");
            columns.add("leNumIndividu");
            columns.add("numObs");
            remplirValues();
            insertData.setTable("Obs_Chouette");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();


            columns=new ArrayList<String>();
            values=new ArrayList<String>();
            columns.add("lObservation");
            columns.add("lObservateur");
            values.add(valuesTotal.get("numObs"));
            values.add(valuesTotal.get("lObservateur"));
            insertData.setTable("AObserve");
            insertData.setColumns(columns);
            insertData.setValues(values);
            insertData.insert();
            
        }
    }
}
