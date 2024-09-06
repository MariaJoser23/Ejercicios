public class Actividad4 {
    public static void main(String[] args) {
        Vehiculo auto = new Auto();
        Vehiculo motocicleta = new Motocicleta();
        Vehiculo camioneta = new Camioneta(true); 

        iniciarVehiculo(auto); 
        iniciarVehiculo(motocicleta); 
        iniciarVehiculo(camioneta); 

    }

    public static void iniciarVehiculo(Vehiculo vehiculo) {
        vehiculo.encender();
    }
}




