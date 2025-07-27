package com.lab.lab4;

import java.util.PrimitiveIterator;

public class Main2ClassInterface {
    public static void main(String[] args) {
        InternationalPlane ip=new InternationalPlane();
        ip.display();
        Ducks d=new Ducks("quack", 2.4F);

    }
}
interface fly {
    boolean canfly = true;
}
interface swim{
    boolean canswim=true;//constant values are initialised and cannot be changed in other class or interface
}
interface plane extends fly{
    void specification();//Abstract method

}
class InternationalPlane implements plane{
    private int capacity;
    private int countEngines;
    private int countPilot;
    private String name;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountEngines() {
        return countEngines;
    }

    public void setCountEngines(int countEngines) {
        this.countEngines = countEngines;
    }

    public int getCountPilot() {
        return countPilot;
    }

    public void setCountPilot(int countPilot) {
        this.countPilot = countPilot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void specification() {
        setCapacity(100);
        setCountEngines(2);
        setCountPilot(2);
        setName("Boing 717");

    }
    public InternationalPlane(){
        specification();
    }
    public void display(){
        System.out.println(getName());
        System.out.println(getCapacity());
        System.out.println(getCountEngines());
        System.out.println(getCountPilot());
    }

}
class Ducks implements fly,swim{
    private String name;
    private float size;
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public float getSize() {
        return size;
    }
    public Ducks(String name,float size){
        setName(name);
        setSize(size);
        System.out.println("can fly:"+canfly);
        System.out.println("can swim:"+canswim);
    }
}
