package taller19.ejercicios;
public class GestorReportes {
    private final GeneradorReporte generador;
    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }
    public void crearReporte(String datos) {
        System.out.println("Gestor Reportes: Solicitando generación.");
        generador.generarReporte(datos);
    }
}
