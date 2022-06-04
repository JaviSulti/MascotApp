package mascotapp;

import mascotapp.servicios.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args) {

        ServicioMascota servMasc = new ServicioMascota();
        
        servMasc.fabricaMascota(1);
        
        servMasc.mostrarMascotas();
        
        servMasc.actualizarMascota(0);
        
        servMasc.mostrarMascotas();
        
        servMasc.eliminarMascota(2);
        
        servMasc.mostrarMascotas();
        
    }

}
