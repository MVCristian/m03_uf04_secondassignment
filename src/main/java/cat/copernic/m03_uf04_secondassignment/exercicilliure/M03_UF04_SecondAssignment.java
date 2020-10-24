/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exercicilliure;

/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) {
        System.out.println("Hi");
        
           Item i1 = new Ropa("Camisa",25,"Camiseta blanca marca nike talla XL","Camisa",002);
           Item i2 = new Ropa("Pantalon",20.0,"Pantalones negros talla 44","Pantalon",001);
           
           CarritoDeLaCompra carro1 = new CarritoDeLaCompra();
            carro1.añade(new Detalle(123, 2, new Ropa("Camisa", 20.0,"Camisa talla XL", "Camisa de vestir", 123)));

            System.out.println(carro1);
            System.out.println("Hi");
           //Detalle carrito1 = new Detalle(123, 2, new Ropa("Camisa", 20.0,"Camisa talla XL", "Camisa de vestir", 123));
           
           //System.out.println(i1);
           //System.out.println(i2);
          // System.out.println(carrito1);
    }
    
}
