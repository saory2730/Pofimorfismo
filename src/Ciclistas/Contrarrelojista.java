package Ciclistas;

public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima; // valor unidad de medida km/h

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Contrarrelojista";
    }

    @Override
    public void imprimitDatos() {
        super.imprimitDatos();
        System.out.println("Velocidad Maxima: " + velocidadMaxima);
    }
}
