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
 * Producte que volem comprar
 * 
 * precio, descripcion, nombre, id
 * 
 * Se recomienda extender esta clase 
 * 
 * 
 */
public class Item {
    private double precio;
    private String descripcion;
    private String nombre;
    private int id;

    public Item(double precio, String descripcion, String nombre, int id) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Item{" + "precio=" + precio + ", descripcion=" + descripcion + ", nombre=" + nombre + ", id=" + id + '}';
    }
    
    
}
