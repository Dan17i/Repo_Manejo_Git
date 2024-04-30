package co.edu.uniquindio.co;
/**
 * hola  repo nuevo 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------------------------------------");
        System.out.println( "Hello World!" );
        System.out.println("----------------------------------------");

        Persona Persona1 = new Persona();
        
        Persona1.setNombre("Daniel");
        Persona1.setApellido("Jurado");
        Persona1.setDirección("barrio clementina");
        Persona1.setEdad((byte)18);
        Persona1.setIdentificacíon(1011092637);
        Persona1.setTelefono("3127535358");

        System.out.println(Persona1);
        System.out.println("----------------------------------------");
    }
}
