

/**
 *
 * @author Luis Soto
 */
public class Tarea {
    //variables
    private String nombre;
    private String descripcion;
    //constructores
    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Tarea() {
    }
    //gets y sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" + " nombre= " + nombre + ", descripcion= " + descripcion + '}';
    }
    
}
