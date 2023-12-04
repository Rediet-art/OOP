/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belowwaterapp;

import java.util.ArrayList;

/**
 *
 * @author RedietBerhe
 */
public class Data {
    private ArrayList<Data> aList;
    private double hour;
    private int totalFish;
    private int caught;
    private int sold;
    private double fuel;
    private String companyName;

    public Data( String companyName,double hour, int totalFish, int caught, int sold, double fuel) {
       
        this.hour = hour;
        this.totalFish = totalFish;
        this.caught = caught;
        this.sold = sold;
        this.fuel = fuel;
        this.companyName= companyName;
    }
    public Data(){
        hour=0.0;
        totalFish=0;
        caught=0;
        sold=0;
        fuel=0.0;
        companyName=" ";
        
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public int getTotalFish() {
        return totalFish;
    }

    public void setTotalFish(int totalFish) {
        this.totalFish = totalFish;
    }

    public int getCaught() {
        return caught;
    }

    public void setCaught(int caught) {
        this.caught = caught;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    
    
    
    
}

