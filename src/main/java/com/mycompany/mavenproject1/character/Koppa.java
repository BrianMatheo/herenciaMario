package com.mycompany.mavenproject1.character;
public class Koppa extends Character{
    private String shellType;

    public Koppa(String name, int height, String power, String shellType) {
        super(name, height, power);
        this.shellType = shellType;
    }
    
    @Override
    public void attack(){
        super.attack();
        System.out.println("Lanzar martillos");
    }
}
