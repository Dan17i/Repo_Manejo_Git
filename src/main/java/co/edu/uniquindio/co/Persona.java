package co.edu.uniquindio.co;

public class Persona {
    //-------------------------------Atributos------------------------------------------
    private int  edad;
    private int telefono;
    private int identificacíon;
    private String  Nombre;
    private String Apellido;
    private String Dirección;
    
    public Persona(int edad, int telefono, int identificacíon, String nombre, String apellido, String dirección) {
        this.edad = edad;
        this.telefono = telefono;
        this.identificacíon = identificacíon;
        Nombre = nombre;
        Apellido = apellido;
        Dirección = dirección;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
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
        return "Persona [edad=" + edad + ", telefono=" + telefono + ", identificacíon=" + identificacíon + ", Nombre="
                + Nombre + ", Apellido=" + Apellido + ", Dirección=" + Dirección + "]";
    }

    
}
