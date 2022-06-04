package mascotapp;

import mascotapp.servicios.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args) {

        ServicioMascota servMasc = new ServicioMascota();
        
        servMasc.crearMascota();
        servMasc.crearMascota();
        
        servMasc.mostrarMascotas();
        
    }

}
