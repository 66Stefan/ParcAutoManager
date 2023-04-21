package models;

public class User {
    private int id;
    private String userName;
    private String password;

    private int telefon;
    private String contact;


    public User(int id, String userName, String password, int telefon, String contact) {

        this.id=id;
        this.userName=userName;
        this.password=password;
        this.telefon=telefon;
        this.contact=contact;
    }
    public String afisareUser(){
        String text="";
        text+="Id user"+this.id+"\n";
        text+="User name"+this.userName+"\n";
        text+="Password"+this.password+"\n";
        text+="Telefon"+this.telefon+"\n";
        text+="Contact"+this.contact+"\n";

        return  text;

    }


    public void setUserNam(String userName){
        this.userName=userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public  String getPassword(){
        return  this.password;
    }

    public void settelefon(int telefon){
        this.telefon=telefon;
    }

    public int getTelefon(){
        return this.telefon;
    }

    public void setContact(String contact){
        this.contact=contact;
    }

    public  String getContact(){
        return this.contact;
    }

    public void setId(int id){
        this.id=id;
    }

    public  int getid(){
        return this.id;
    }
}

