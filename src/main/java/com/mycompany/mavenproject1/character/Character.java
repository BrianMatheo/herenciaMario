package com.mycompany.mavenproject1.character;
public class Character {
    private String name;
    private int height;
    private String power;

    public Character(String name, int height, String power) {
        this.name = name;
        this.height = height;
        this.power = power;
    }
    
    public void walk(){
        System.out.println("Personaje caminando");
    }
    
    public void attack(){
        System.out.println("Personaje atacando");
    }
    
    
    final public void die(){
        System.out.println("Personaje murió");
    }
    
}
