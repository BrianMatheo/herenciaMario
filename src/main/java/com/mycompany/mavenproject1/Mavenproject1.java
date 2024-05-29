package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.character.Character;
import com.mycompany.mavenproject1.character.Goomba;
import com.mycompany.mavenproject1.character.Koppa;
import com.mycompany.mavenproject1.character.Peach;
public class Mavenproject1 {
    public static void main(String[] args) {
        
        Peach peach = new Peach("Princesa", 140,"Congelar");
        peach.longJump();
        
        Goomba goomba = new Goomba("Goomba", 50, "Ninguno");
        goomba.walk();
        
        Koppa koppa = new Koppa("Koopa", 70, "Ninguno", "Verde");
        koppa.attack();
        
        
        
    }
}
