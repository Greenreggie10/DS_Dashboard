package org.example;
import java.util.*;


public class Route {
    private String location;
    private String name;
    private double Packages;

    public Route(String location)
    {
        this.location = location;
        name = "";
        Packages = 0;
    }

    public Route(String location, String name)
    {
        this.location = location;
        this.name = name;
        Packages = 0;
    }
    //constructor w 3*parameters
    public Route(String location, String name, double Packages) {
        this.location = location;
        this.name = name;
        this.Packages = Packages;
    }

    public double getPackages() {
        return Packages;
    }
    public void setPackages(double Packages) {
        this.Packages = Packages;
    }

    @Override
    public String toString() {
        return "Employee: " + this.name + ". Location: " + this.location +
                ". Has this many Packages Today: " + this.location;
    }
}
