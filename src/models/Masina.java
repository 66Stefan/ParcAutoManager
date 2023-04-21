package models;

public class Masina {
    private int id;
    private String marca;
    private String model;
    private  int anFabricatie;
    private int kmLaBord;

    private int stoc;

    private String combustie;
    //todo:constricut

    public Masina(int id, String marca, String model, int anFabricatie, int kmLaBord,int stoc, String combustie){

        this.id=id;
        this.marca=marca;
        this.model=model;
        this.anFabricatie=anFabricatie;
        this.kmLaBord=kmLaBord;
        this.stoc=stoc;
        this.combustie=combustie;
    }

    public String afisareMasina(){
        String text="";
        text+="Id user"+this.id+"\n";
        text+="Marca"+this.marca+"\n";
        text+="Model"+this.model+"\n";
        text+="An fabricatie "+this.anFabricatie+"\n";
        text+="Km la bord"+this.kmLaBord+"\n";
        text+="Combustibil"+this.combustie+"\n";

        return  text;

    }
    public void setStoc(int stoc){
        this.stoc=stoc;
    }

    public int getStoc(){
        return  this.stoc;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return  this.id;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModel(String model){
        this.model=model;
    }

    public  String getModel(){
        return this.model;

    }

    public void  setAnFabricatie(int anFabricatie){
        this.anFabricatie=anFabricatie;
    }
    public int getAnFabricatie(){
        return this.anFabricatie;
    }

    public  void setKmLaBord(int kmBord){
        this.kmLaBord=kmBord;
    }

    public int getKmLaBord(){
        return this.kmLaBord;
    }

    public  void setCombustie(String combustibil){
        this.combustie=combustibil;
    }

    public String getCombustie(){
        return this.combustie;
    }
}
