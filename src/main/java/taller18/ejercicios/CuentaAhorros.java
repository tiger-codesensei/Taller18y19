package taller18.ejercicios;
public class CuentaAhorros implements IRetiro {
    @Override
    public double realizarRetiro(double monto) {
        System.out.println("Cuenta Ahorros: Retiro exitoso: $" + monto);
        return monto;
    }
}
