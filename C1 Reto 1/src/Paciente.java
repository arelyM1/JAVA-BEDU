public class Paciente { //Clase paciente
//Atributos
    String nombrePaciente;
    int edadPaciente;
    String numeroExpediente;

    //Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombrePaciente);
        System.out.println("Edad: " + edadPaciente);
        System.out.println("Numero Expediente: " + numeroExpediente);
    }

}
