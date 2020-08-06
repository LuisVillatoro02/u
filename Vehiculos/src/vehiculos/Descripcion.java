package vehiculos;

/**
 *
 * @author ANDREA_NOVA
 */
public class Descripcion extends Vehiculos {
    int kilometraje;
    int capacidad;
    public Descripcion (String patente,String tamaño, int marca, int año, String color, int kilometraje, int capacidad){
        this.kilometraje=kilometraje;
        this.capacidad=capacidad;
    }
    public int getKilometraje(){
    return kilometraje;
}
public void setKilometraje (int kilometraje){
    this.kilometraje=kilometraje;
}
public int getCapacidad(){
    return capacidad;
}
public void setCapacidad (int capacidad){
    this.capacidad=capacidad;
}
}


