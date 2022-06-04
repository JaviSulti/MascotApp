package mascotapp.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {

    //Creo los atributos.
    private Scanner teclado;
    private List<Mascota> mascotas; //Aca declaro la Lista

    //Con el constructor, la inicializo. Tb al Scanner.
    public ServicioMascota() {
        this.teclado = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public Mascota crearMascota() {

        System.out.print("Por favor, introduzca el nombre de la mascota > ");
        String nombre = teclado.next();

        System.out.print("Introduzca el apodo > ");
        String apodo = teclado.next();

        System.out.print("Introduzca el tipo > ");
        String tipo = teclado.next();

        return new Mascota(nombre, apodo, tipo);

    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {

        System.out.println("Las mascotas actuales de la lista Mascotas son: ");

        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }

        System.out.println("La cantidad de mascotas es: " + mascotas.size());

    }

    /**
     * crea mascotas todos chiquitos.
     *
     * @param cantidad equivale a la cantidad de mascotas a crear y a;adir a la
     * lista.
     */
    public void fabricaChiquitos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Fer", "chiquito", "Beagle"));

        }
    }

    /**
     * crea mascotas pidiendo los datos por teclado.
     */
    public void fabricaMascota(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
           
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);

            System.out.println(mascotaCreada.toString());
        }

    }

    //TO DO a;adir Try y Catch
    // public void actualizarMascota(int index){
    //    Mascota m = mascotas.get(index); //m es una variable local.
    //   m.setApodo("Roberto");
    // }
    public void actualizarMascota(int index) {
        System.out.println("");
        System.out.println("----------Actualizar ----------");
        if (index <= (mascotas.size() - 1)) {
            Mascota m = crearMascota();
            mascotas.set(index, m);
        } else {
            System.out.println("El indice es erroneo.");
        }
    }

    public void eliminarMascota(int index) {
        if (index <= (mascotas.size() - 1)) {
            mascotas.remove(index);
        } else {
            System.out.println("Fallo al eliminar. El indice es erroneo.");
        }
    }

}
