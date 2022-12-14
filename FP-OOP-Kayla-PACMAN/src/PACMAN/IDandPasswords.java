package PacMan.src.PACMAN;

import java.util.HashMap;

public class IDandPasswords {

    private String name;
    public String getName(){ //encapsulation
        return name;
    }

    public String setName(String newName) {
        this.name = newName;
        return newName;
    }
    String[] nama = {"Kayla"};
    Name<String> inama = new Name<>("Tes");
    HashMap<String,String> logininfo = new HashMap<String,String>(); //collection (hashmap)
        IDandPasswords(){
        logininfo.put("ana","123");
        logininfo.put(nama[0],"321"); //(arraylist)
        logininfo.put("lina","000");
        logininfo.put(inama.getNama(),"888");
        logininfo.put(setName("emilia"),"111");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
