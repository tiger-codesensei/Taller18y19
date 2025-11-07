package taller19.ejercicios;
public class GestorArchivos {
    private final Almacenamiento almacenamiento;
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void subirArchivo(String nombre, byte[] datos) {
        System.out.println("Gestor Archivos: Iniciando subida.");
        almacenamiento.guardarArchivo(nombre, datos);
    }
}
