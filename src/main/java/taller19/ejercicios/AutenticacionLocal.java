package taller19.ejercicios;
public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticarUsuario(String usuario, String clave) {
        if (usuario.equals("user") && clave.equals("pass")) {
            System.out.println("Autenticación Local exitosa.");
            return true;
        }
        System.out.println("Autenticación Local fallida.");
        return false;
    }
}
