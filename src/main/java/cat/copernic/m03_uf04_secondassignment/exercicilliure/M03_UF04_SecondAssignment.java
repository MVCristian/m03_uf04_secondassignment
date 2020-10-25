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
        
        double totalCompra;
        //System.out.println("Hi");
        
           Item i1 = new Ropa("Camisa",25,"Camiseta blanca marca nike talla XL","Camisa",002);
           Item i2 = new Ropa("Pantalon",20.0,"Pantalones negros talla 44","Pantalon",001);
           
           
           CarritoDeLaCompra carro1 = new CarritoDeLaCompra();
           
           Detalle prueba1 = new Detalle (123, 2, new Ropa("Camisa", 20.0,"Camisa talla XL", "Camisa de vestir", 123)); 
           Detalle prueba2 = new Detalle(1234, 1, new Ropa("Camisa 2", 25.0,"Camisa talla S", "Camisa de deporte", 1234));
           Detalle prueba3 = new Detalle(1234, 1, i2);
           
           carro1.anade(prueba1);
           carro1.anade(prueba2);
           carro1.anade(prueba3);

           totalCompra = carro1.checkout();
           System.out.println("Precio total del carrito = " + totalCompra + "€");
           
           carro1.elimina(prueba1);
           
           totalCompra = carro1.checkout();
           System.out.println("");
           System.out.println("Precio total del carrito = " + totalCompra + "€");
           
           
           
           

            //System.out.println(carro1);
            //System.out.println("Hi");
           //Detalle carrito1 = new Detalle(123, 2, new Ropa("Camisa", 20.0,"Camisa talla XL", "Camisa de vestir", 123));
           
           //System.out.println(i1);
           //System.out.println(i2);
          // System.out.println(carrito1);
    }
    
}
