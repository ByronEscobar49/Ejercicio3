package Bibloteca_de_Vehiculos;

public class Moto extends Vehiculo {
    private final boolean tieneSidecar;


    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.tieneSidecar = false;
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene sidecar: " + tieneSidecar);
    }
}
