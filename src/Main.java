import Ciclistas.Contrarrelojista;
import Ciclistas.Escalador;
import Ciclistas.Velocista;
import Equipos.Equipo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio practico sobre polimorfismo!");

        Equipo equipo1 = new Equipo("Equipo A", "Colombia");

        Velocista velocista1 = new Velocista(1, "Pepito", 250.5, 60.0);
        Escalador escalador1 = new Escalador(2, "Andres", 5.5f, 15.0f);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(3, "Carlos", 70.0);

        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);

        equipo1.imprimirDatosEquipo();

        System.out.println();

        equipo1.listarNombresCiclistas();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del ciclista a buscar: ");
        int id = scanner.nextInt();

        equipo1.imprimirDatosCiclistaPorId(id);

    }
}