package controllers;

import models.Masina;

import java.util.ArrayList;

public class MasinaController {


    private ArrayList<Masina> masina;


    public  MasinaController() {
        this.masina=new ArrayList<>();
        this.load();
    }

    public  void load(){

        Masina masina1= new Masina( 10, "Audi", "A8", 1999, 123456, 23, "Hibrid" );
        Masina masina2= new Masina( 11, "VW", "B8", 2023, 12, 55, "Hibrid" );
        Masina masina3= new Masina( 12, "Toyota", "Auris", 2018, 12456, 2, "Benzina" );
        Masina masina4= new Masina( 13, "Dacia", "Logan", 2021, 58963, 5892, "Diesel" );
        Masina masina5= new Masina( 14, "Mercede", "B200", 2022, 125, 1, "Diesel" );

        this.masina.add(masina1);
        this.masina.add(masina2);
        this.masina.add(masina3);
        this.masina.add(masina4);
        this.masina.add(masina5);
    }

    public Masina findcarByMarcaAndId(String marca, int id){
        for(int i=0; i<masina.size();i++){
            if((masina.get(i).getMarca().equals(marca)) && (masina.get(i).getId()==id)){
                return masina.get(i);
            }
        }
        return  null;
    }

    public void eraseMasina(Masina masina){
        this.masina.remove(masina);
    }

    public void addMasina(Masina masina){
        this.masina.add((masina));
    }
    //todo: functie ce editeaza modelul

    public Boolean editModel(String model, int id, String marca){
        Masina findcarByMarcaAndId = this.findcarByMarcaAndId(marca, id);
        if(findcarByMarcaAndId!=null){
            findcarByMarcaAndId.setModel(model);
            return true;
        }
        return  false;
    }



    //todo: functie ce editeaza anul
    public Boolean editAnul(String marca, int id, int an){

        Masina findByMarcaAndId = this.findcarByMarcaAndId(marca,id);
        if(findByMarcaAndId!=null){
            findByMarcaAndId.setAnFabricatie(an);
            return  true;

        }
        return false;
    }

    //todo:functie ce editeaza km
    public Boolean editKm(String marca, int id, int km){

        Masina findByMarcaAndId= this.findcarByMarcaAndId(marca,id);
        if(findByMarcaAndId!=null){
            findByMarcaAndId.setKmLaBord(km);
            return true;
        }
        return false;

    }
    //todo:functie ce editeaza stocul

    public Boolean editStocul(String marca, int id, int stoc){
        Masina findByMarcaAndId = this.findcarByMarcaAndId(marca, id);
        if(findByMarcaAndId!=null){
            findByMarcaAndId.setStoc(stoc);
            return true;
        }
        return false;
    }

    //todo: functie ce editeaza combustibilul

    public Boolean editCombustibil(String marca,int id, String combustibil){
        Masina fidByMarcaAndId = this.findcarByMarcaAndId(marca, id);
        if(fidByMarcaAndId!= null){
            fidByMarcaAndId.setCombustie(combustibil);
            return true;
        }
        return false;
    }

}
