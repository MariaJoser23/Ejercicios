public class Actividad3 {
    public static void main(String[] args) {
        Vehiculo auto = new Auto();
        Vehiculo motocicleta = new Motocicleta();

        iniciarVehiculo(auto); 
        iniciarVehiculo(motocicleta); 
    }

    public static void iniciarVehiculo(Vehiculo vehiculo) {
        vehiculo.encender();
    }
}



    
    
