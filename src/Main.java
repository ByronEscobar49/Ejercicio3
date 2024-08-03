import Bibloteca_de_Vehiculos.Coche;
import Bibloteca_de_Vehiculos.Moto;

public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("Nissan","Skyline R34", 2002);
        c1.mostrarInformacion();
        Moto m2 = new Moto("Susuki","R6",2010);
        m2.mostrarInformacion();
    }
}