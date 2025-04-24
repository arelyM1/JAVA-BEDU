import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Paciente paciente = new Paciente(); //Crear el objeto paciente

    //Entrada de datos
        System.out.print("📝Ingresa el nombre del paciente: ");
        paciente.nombrePaciente = entrada.nextLine();
        System.out.print("🗓️Ingresa el edad del paciente: ");
        paciente.edadPaciente = entrada.nextInt();
        entrada.nextLine();
        System.out.print("📔Ingresa el número de expediente del paciente: ");
        paciente.numeroExpediente = entrada.nextLine();
        entrada.close();
        //imprime el método mostrarInformacion
        System.out.println("*****Datos de la paciente*****");
        paciente.mostrarInformacion();


    }
}