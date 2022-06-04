package mascotapp.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioMascota {

    //Creo los atributos.
    private Scanner teclado;
    private List<String> mascotas; //Aca declaro la Lista

    //Con el constructor, la inicializo. Tb al Scanner.
    public ServicioMascota() {
        this.teclado = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public void crearMascota() {

        System.out.print("Por favor, introduzca el nombre de la mascota > ");
        String nombre = teclado.next();

        System.out.print("Introduzca el apodo > ");
        String apodo = teclado.next();

        System.out.print("Introduzca el tipo > ");
        String tipo = teclado.next();

        String mascota = nombre + " " + apodo + " " + tipo;

        mascotas.add(mascota);

    }

    public void mostrarMascotas() {

        System.out.println("Las mascotas actuales de la lista Mascotas son: ");
        for (String aux : mascotas) {
            System.out.println(aux);
        }

        System.out.println("La cantidad de mascotas es: " + mascotas.size());

    }

}
