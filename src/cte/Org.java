package cte;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sylvia
 */
public class Org {
    public String business, type, name, email, phoneNum, resources;
    public Org(String business, String type, String name, String email, String phoneNum, String resources){
        this.business = business;
        this.type = type;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.resources = resources;
    }
    public String getBusiness(){
        return business;
    }
    public void setBusiness(String business){
        this.business = business;
    }
    public String getType(){
        return type;
    }
    public void setBusinessType(String type){
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public String getResources(){
        return resources;
    }
    public void setResources(String resources){
        this.resources = resources;
    }
    public String toString(){
        return business + "," + type + "," + name + "," + email + "," + phoneNum + "," + resources + ",";
    }
}
