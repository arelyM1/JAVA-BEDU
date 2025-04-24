public class Main {
    public static void main(String[] args) {
     Entrada entrada = new Entrada( "Seven Kayne", 1300);
     Entrada entrada2 = new Entrada("Romeo y Julieta", 550);

     entrada.MostrarInformacion();
     entrada2.MostrarInformacion();

     Record entrada3 = new Record("SMTR25", 6500);
     entrada3.mostrarInformacion();

        System.out.println(entrada3); //genera un toString generico para Record

    }
}