package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class Cafetera {

    private int capacidad_maxima;
    private int cantidad_actual;

    public Cafetera(int capacidad_maxima, int cantidad_actual) {
        this.capacidad_maxima = capacidad_maxima;
        this.cantidad_actual = cantidad_actual;
        if (cantidad_actual > capacidad_maxima) {
            this.cantidad_actual = capacidad_maxima;
        } else {
            this.cantidad_actual = cantidad_actual;
        }
    }

    public Cafetera() {
        this.capacidad_maxima = 1000;
        this.cantidad_actual = 0;
    }

    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }
    public void Llenar_Cafetera(){
        this.setCantidad_actual(capacidad_maxima);
    }
     public void servir_Taza(int cantidad_tazas){
        if (this.getCantidad_actual() < cantidad_tazas) {
            this.setCantidad_actual(0);
        }
        else {
            this.setCantidad_actual(this.getCantidad_actual() - cantidad_tazas);
        }
    }
     public void Vaciar_Cafetera(){
         this.setCantidad_actual(0);
     }
     public void Agregra_Cafe(int cantidad_cafe){
       this.setCantidad_actual(this.getCantidad_actual() + cantidad_cafe);
     }

}
