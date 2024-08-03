package Bibloteca_de_Vehiculos;

public class Vehiculo {
        private final String marca;
        private final String modelo;
        private final int ano;

        public Vehiculo(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano= ano;
        }

    public void mostrarInformacion() {
            System.out.println("La Marca del Vehiculo es: " + marca);
            System.out.println("El Modelo del Vehiculio es: " + modelo);
            System.out.println("El año de lanzamiento es"+ ano);
        }

    }


