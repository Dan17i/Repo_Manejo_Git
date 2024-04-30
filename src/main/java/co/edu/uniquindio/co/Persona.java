package co.edu.uniquindio.co;

public class Persona {
    //-------------------------------Atributos------------------------------------------
    private byte  edad;
    private String telefono;
    private int identificacíon;
    private String  Nombre;
    private String Apellido;
    private String Dirección;
    
    public Persona(byte edad, String telefono, int identificacíon, String nombre, String apellido, String dirección) {
        this.edad =  edad;
        this.telefono = telefono;
        this.identificacíon = identificacíon;
        Nombre = nombre;
        Apellido = apellido;
        Dirección = dirección;
    }

    public Persona(){

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdentificacíon() {
        return identificacíon;
    }

    public void setIdentificacíon(int identificacíon) {
        this.identificacíon = identificacíon;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String dirección) {
        Dirección = dirección;
    }

    @Override
    public String toString() {
        return "Persona tiene una edad de: " + edad + "\n telefono : " + telefono + "\n identificacíon :" + identificacíon + "\n Nombre :"
                + Nombre + "\n Apellido : " + Apellido + "\n Dirección :" + Dirección ;
    }

    
}
