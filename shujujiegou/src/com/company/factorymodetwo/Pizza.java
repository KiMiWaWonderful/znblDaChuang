package com.company.factorymodetwo;

public abstract class Pizza {

    String name;
    String type;

    String souce;
    String cheese;
    String cream;

    abstract void prepare();

    void bake(){
        System.out.println("bake");
    }

    void cut(){
        System.out.println("cut");
    }

    void box(){
        System.out.println("box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getCream() {
        return cream;
    }

    public void setCream(String cream) {
        this.cream = cream;
    }

//    public Pizza(String name, String type, String souce, String cheese, String cream) {
//        this.name = name;
//        this.type = type;
//        this.souce = souce;
//        this.cheese = cheese;
//        this.cream = cream;
//    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", souce='" + souce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", cream='" + cream + '\'' +
                '}';
    }
}
