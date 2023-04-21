package models;

public class Order{

    private  int id;
    private  int userId;
    private int masinaId;

    private int cantitate;

    public Order(int id, int userId, int masinaId, int cantitate){
        this.id=id;
        this.userId=userId;
        this.masinaId=masinaId;
        this.cantitate=cantitate;
    }

    public String afisareOrder(){
        String text="";
        text+="Id Order"+this.id+"\n";
        text+="Id User"+this.userId+"\n";
        text+="Id Masina"+this.masinaId+"\n";
        text+="Cantitate"+this.cantitate+"\n";
        return  text;

    }
    public void setId(int id){
        this.id=id;
    }

    public  int getId(){
        return this.id;
    }

    public  void setUserId(int userId){
        this.userId=userId;
    }

    public int getUserId(){
        return  this.userId;
    }

    public  void setMasinaId(int masinaId){
        this.masinaId=masinaId;
    }

    public  int getMasinaId(){
        return  this.masinaId;
    }

    public void setCantitate(int cantitate){
        this.cantitate=cantitate;
    }

    public  int getCantitate(){
        return  this.cantitate;
    }
}
