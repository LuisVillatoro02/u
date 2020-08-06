package herencia;

/**
 *
 * @author ANDREA_NOVA
 */
public class Playera extends Ropa{
     public Playera(int id, double precio, String talla, String color, String corte){
         super(id, precio, talla, color);
         this.corte=corte;
         
     }
 private String corte;
 
 
public String getCorte(){
    return corte;
}
public void setCorte(String corte){
    this.corte=corte;
}
    public void mostrarDatos(String nombreClase){
        super.mostrarDatos(nombreClase);
        System.out.println("corte:"+corte);
    }
}


