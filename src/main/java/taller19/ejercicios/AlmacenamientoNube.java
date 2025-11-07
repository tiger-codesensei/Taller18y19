package taller19.ejercicios;
public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, byte[] datos) {
        System.out.println("Almacenamiento Nube: Guardando archivo " + nombre);
    }
    @Override
    public byte[] recuperarArchivo(String nombre) {
        System.out.println("Almacenamiento Nube: Recuperando archivo " + nombre);
        return new byte[0];
    }
}
