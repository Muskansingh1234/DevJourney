package com.example.Myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // it make it as bean and we can use it anywhere :
@Scope(value = "prototype") // Now by-default insance will not be created :
public class Alien {


    private  int aid;
    private  String aname;
    private String tech;
    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;

Alien(){
    super();
    System.out.println("object created");
}




    public String getAname() {
        return aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public  void show(){
        System.out.println("working");
        laptop.compile();

    }
}
