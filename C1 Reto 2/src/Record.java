// Un record es una forma concisa de definir una clase inmutable en Java.
public record Record  (String evento, double precio ){
    public void mostrarInformacion() {
        System.out.print("Nombre del evento: " + evento + " | ");
        System.out.println("Precio de la entrada: $" + precio);

    }
}
