
package com.mycompany.marioexample;

import java.util.Scanner;
 
public class MarioExample {
    public static void main(String[] args) {
        Heroe melvin = new Heroe("Melvin");
        System.out.println("It's super Melvin Bros");
        Scanner lector = new Scanner(System.in);
        

    do{
           System.out.println("Sobrevive");
           System.out.println("a. Salta");
           System.out.println("s. Mueve");
           System.out.println("z. Salir");
            char tecla = lector.next().charAt(0);
            tecla = Character.toLowerCase(tecla);
            switch (tecla) {
                case 's':
                    melvin.movimiento();
                    break;
                case 'a':
                    melvin.saltar();
                    break;
                case 'z':
                    System.out.println("Saliendo del juego");
                    break;
                default: 
                    System.out.println("Tecla invalida");
            }
            if (melvin.getX() == 10){
             melvin.goomba(1);
            }
            if (melvin.getvidas() <= 0){
                System.out.println(melvin.getnombre() + " ha perdido todas sus vidas");
                tecla = 'z';
            }
                   
    }while(tecla != 'z');
            System.out.println("Game over...");
    }
}//final