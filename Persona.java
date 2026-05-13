public class Persona {
    String nombre;
    int edad;
    String direccion;

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    @override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Dirección: " + direccion;
    }
}