package taller19.ejercicios;
public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Reporte PDF: Generando documento a partir de " + datos);
    }
}
