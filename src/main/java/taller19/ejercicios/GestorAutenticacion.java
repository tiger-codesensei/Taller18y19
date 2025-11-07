package taller19.ejercicios;
public class GestorAutenticacion {
    private final ServicioAutenticacion servicio;
    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }
    public void iniciarSesion(String usuario, String clave) {
        if (servicio.autenticarUsuario(usuario, clave)) {
            System.out.println("Gestor: Sesión iniciada.");
        } else {
            System.out.println("Gestor: Error de inicio de sesión.");
        }
    }
}
