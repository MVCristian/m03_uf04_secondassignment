/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exercicilliure;

import java.util.ArrayList;

/**
 *
 * @author pep
 * 
 * Implementa una ejercicio original con:
 * 
 * Herencia
 * 
 * Polimorfismo
 * 
 * Intefaces
 * 
 * Propiedades, etc.
 * 
 * 
 * Opcionalmente, usa este ejemplo para tu desarrollo.
 * 
 * Fecha limite entrega Domingo 25 a las 12 de la noche.
 * 
 * 
 * No olvides implementar y verificar checkout()
 * 
 */
public class CarritoDeLaCompra implements Finalizable {
    
    private ArrayList<Detalle> carrito = new ArrayList<>();
    
    
    public void anade(Detalle detalle) {
        carrito.add(detalle);
    }
    
    public void elimina(Detalle detalle) {
        carrito.remove(detalle);
    }
    
    
    

    @Override
    public double checkout() { //total carrito
        double totalCompra=0;
        int cantidad;
        double precio;
        
        for(int i = 0; i<carrito.size(); i++){
            cantidad=carrito.get(i).getCantidad();
            precio = carrito.get(i).getItem().getPrecio();
            totalCompra += (cantidad * precio);
            System.out.println(carrito.get(i).toString());
        }
        return totalCompra;
    }
    
    
    
    
}
