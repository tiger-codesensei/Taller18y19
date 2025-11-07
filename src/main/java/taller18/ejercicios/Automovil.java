package taller18.ejercicios;
public class Automovil implements IConduccion {
    @Override
    public void arrancarMotor() {
        System.out.println("Automóvil: Motor arrancado.");
    }
    @Override
    public void conducir() {
        System.out.println("Automóvil: Conduciendo.");
    }
}
