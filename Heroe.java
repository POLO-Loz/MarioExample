package com.mycompany.marioexample;


class Heroe {
    private String nombrePlayer;
    private int X;
    private int goomba;
    private int vidas;
    private boolean saltando;
    char tecla;
    
    public Heroe(String nombrePlayer){
        this.nombrePlayer = nombrePlayer;
        this.vidas = 3;
        this.saltando = false;
    }
    
    public int getX(){
        return X;
    }
    
    public int getvidas(){
        return vidas;
    }
    
    public String getnombre(){
        return nombrePlayer;
    }
    
    public void movimiento(){
        this.X += 1;
        System.out.println(this.nombrePlayer + " se movio un a " + this.X);
    }
    
    public void tecla(){
        
    }
    
    public void goomba(int golpe){{
        if(this.saltando){
            System.out.println(this.nombrePlayer + " evito el golpe porque estaba saltando");
        }else if(this.X == 10){
        System.out.println(this.nombrePlayer + " fue golpeado por un goomba");
        this.vidas -= golpe;
        if (this.vidas <= 0) 
            System.out.println(this.nombrePlayer + " murio. ");}
    }
    this.saltando = false;
    }
    
    public void mostrarEstado(){
        System.out.println(this.nombrePlayer + " tiene " + this.vidas);
    }
    
    public void saltar(){
        if (!saltando){
            this.saltando = true;
            System.out.println(this.nombrePlayer + " ha saltado.");}
        else{
            System.out.println(this.nombrePlayer + "ya esta saltando.");             
        }
    }
   
}
