package controllers;

import models.User;

import java.util.ArrayList;

public class UserController {

    private ArrayList<User>  user;


    public  UserController() {
    this.user=new ArrayList<>();
    this.load();
    }

    public void load(){
        User user1 = new User(1, "Aurel", "34erTas", 2345, "Alba-Iulia");
        User user2 = new User(2, "Vasile", "34tfd", 234567, "Sibiu");
        User user3 = new User(3, "Cornel", "342wec", 454533, "Bucuresti");
        User user4 = new User(4, "Cristi", "76uiop", 23453445, "Cluj");
        User user5 = new User(5, "Calin", "wer45", 233454345, "Arad");

        this.user.add(user1);
        this.user.add(user2);
        this.user.add(user3);
        this.user.add(user4);
        this.user.add(user5);

    }

    public User findUserByUsernameAndId(String username, int id){
        for(int i=0; i<user.size();i++){
            if((user.get(i).getUserName().equals(username)) && (user.get(i).getid()==id)){
                return user.get(i);
            }
        }
        return  null;
    }

    public void eraseUser(User user){
        this.user.remove(user);
    }

    public void addUser(User user){
        this.user.add(user);
    }
    //todo: functie ce editeaza password

    public Boolean editPassword(String username, int id, String password){
        User findUserByUsernameAndId = this.findUserByUsernameAndId(username, id);
        if(findUserByUsernameAndId!=null){
            findUserByUsernameAndId.setPassword(password);
            return true;
        }
        return  false;
    }



    //todo: functie ce editeaza telefon
    public Boolean editTelefon(String username, int id, int telefon){

        User findUserByMarcaAndId = this.findUserByUsernameAndId(username,id);
        if(findUserByMarcaAndId!=null){
            findUserByMarcaAndId.settelefon(telefon);
            return  true;

        }
        return false;
    }

    //todo:functie ce editeaza contact
    public Boolean editContact(String username, int id, String contact){

        User findUserByMarcaAndId= this.findUserByUsernameAndId(username,id);
        if(findUserByMarcaAndId!=null){
            findUserByMarcaAndId.setContact(contact);
            return true;
        }
        return false;

    }



}
