package taller19.ejercicios;
public interface Almacenamiento {
    void guardarArchivo(String nombre, byte[] datos);
    byte[] recuperarArchivo(String nombre);
}
