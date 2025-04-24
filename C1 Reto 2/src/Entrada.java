public class Entrada { //clase principal
    String nombreDelEvento;
    double PrecioDeEntrada;

    //contructor
    public Entrada (String nombreDelEvento, double PrecioDeEntrada) {
        this.nombreDelEvento = nombreDelEvento;
        this.PrecioDeEntrada = PrecioDeEntrada;
    }
    //método para mostrar la información de los datos
    public void MostrarInformacion() {
        System.out.print("Nombre del evento: " + nombreDelEvento + " | ");
        System.out.println("Precio del entrada: $" + PrecioDeEntrada);

    }
}
