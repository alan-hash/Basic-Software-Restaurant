/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richa
 */
public class Sopas extends menu{
    public float suma;
    private float precio;

    public Sopas(float suma, float precio) {
        this.suma = suma;
        this.precio = precio;
    }
    private float total;

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getSuma() {
        return suma;
    }

    public float getPrecio() {
        return precio;
    }

    public float getTotal() {
        return total;
    }
    
}
