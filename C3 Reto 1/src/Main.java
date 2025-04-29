public class Main {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "P123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        //Reservar asiento
        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        }

        //Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario() + "\n");

        //Cancelar reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        //Mostrar itinerario nuevamente
        System.out.println(vuelo.obtenerItinerario() + "\n");

        //Reservar con datos directos
        vuelo.reservarAsiento("Mario Gonzalez", "P654321");

        //Mostrar itinerario final
        System.out.println(vuelo.obtenerItinerario());
    }
}
