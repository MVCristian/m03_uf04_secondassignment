/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exercicilliure;

/**
 *
 * @author pep
 * 
 * id, cantidad, Item 
 * 
 */
public class Detalle {
    private int id;
    private String cantidad;
    private Item item;

    public Detalle(int id, String cantidad, Item item) {
        this.id = id;
        this.cantidad = cantidad;
        this.item = item;
    }
    
    
}
