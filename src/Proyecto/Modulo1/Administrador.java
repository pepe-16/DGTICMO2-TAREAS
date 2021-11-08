package Proyecto.Modulo1;

public class Administrador implements User {

    private String clave = "SystemSicopon123";

    public String getClave() {
        return clave;
    }

    public boolean loogean(String contrasena) {
        if (contrasena.equals(this.getClave())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean altausuario(Usuario altaus) {
        //Se estrucutra el query para agregar un nuevo usuario en la base de datos;
        //Se ejecuta el query para enviar los datos
        //Si la operacion fue exitosa se retorna un valor de true;
        return true;
        //Si la operacion no fue exitosa se retorna un valor de false;
    }
}
