/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ANDREA_NOVA
 */
public class Herencia {
public static void main(String[] args) {
       Playera playera=new Playera(1, 299.5, "CH", "Gris", "Polo");
       Jeans Jeans =new Jeans(2, 799, "32", "Azul", "Pepe", 'F');
       Zapatos Zapatos=new Zapatos(3, 29, "M", "Rojo");
       playera.mostrarDatos("Playera Gris");
       Jeans.mostrarDatos("Jeans Mujeres");
       Zapatos.mostrarDatos("Foot");
    }
    
}
