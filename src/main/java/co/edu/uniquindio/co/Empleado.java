package co.edu.uniquindio.co;

public class Empleado extends Persona {

    public Empleado (byte edad, String telefono, int identificacíon, String nombre, String apellido, String dirección){
        super(edad, telefono, identificacíon, nombre, apellido, dirección);
    }

    @Override
    public String toString() {
        return "Empleado ";
    }
    
    
}
