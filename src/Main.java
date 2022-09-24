public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Piero";
        cliente1.edad = 21;
        cliente1.telefono = 962336436;
        System.out.printf("El cliente %s tiene %d años y su número es %d", cliente1.nombre, cliente1.edad,
                cliente1.telefono);
    }
}

class Persona {
    int edad;
    int telefono;
    String nombre;


}
class Cliente extends Persona {
    String credito;
}
class Trabajador extends Persona {
    double salario;
}