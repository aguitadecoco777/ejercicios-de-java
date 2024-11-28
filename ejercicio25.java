class Persona{
    String nombre;
    public Persona(String nombre){
        this.nombre=nombre;
    }
}

public class ejercicio25{
    public static void main(String[] args) {
                Persona persona = new Persona(null);
                persona.nombre = "Luisa";
                cambiarNombre(persona);
                System.out.println("Nombre " + persona.nombre);  
            }
        
            public static void cambiarNombre(Persona persona) {
                persona.nombre = "Elizabeth";
            }
}
