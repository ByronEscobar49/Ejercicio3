package Bibloteca_de_Vehiculos;

public class Coche extends Vehiculo {
        private final int numeroPuertas;


        public Coche(String marca, String modelo, int ano) {
            super(marca, modelo, ano);
            this.numeroPuertas = 4;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();


            System.out.println("Número de puertas: " + numeroPuertas);
        }
    }


