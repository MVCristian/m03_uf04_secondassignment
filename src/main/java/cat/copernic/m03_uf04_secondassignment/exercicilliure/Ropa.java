/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exercicilliure;

/**
 *
 * @author HP
 */
public class Ropa extends Item {
    private String tipoDePrenda;

    public Ropa(String tipoDePrenda, double precio, String descripcion, String nombre, int id) {
        super(precio, descripcion, nombre, id);
        this.tipoDePrenda = tipoDePrenda;
    }
    
    
}
