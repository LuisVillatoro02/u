/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author ANDREA_NOVA
 */
public class Carro {
    private String patente;
    private String tamaño;
    private int marca;
    private int año;
    private String color;

public Carro(String patente, String tamaño, int marca, int año, String color){
this.patente=patente;
this.tamaño=tamaño;
this.marca=marca;
this.año=año;
this.color=color;
}
public String nombre;
    public String getPatente(){
    return patente;
}
public void setpatente(String patente){
this.patente=patente;
}
public String getTamaño(){
return tamaño;
}
public void setTamaño(String tamaño){
this.tamaño=tamaño;
}
public int getMarca (){
    return marca;
}
public void setMarca(int marca){
this.marca=marca;
}
public int getAño(){
    return año;
}
public void setAño(int año){
  this.año=año;
}
public String getcolor(){
    return color;
}
public void setColor (String color){
    this.color=color;
}
public void mostrarDatos(String nombreClase){
    System.out.println(nombreClase);
    System.out.println("Patente"+patente);
    System.out.println("Tamaño"+ tamaño);
    System.out.println("Marca"+ marca);
    System.out.println("Año"+ año);
    System.out.println("Color"+color);
}
}
