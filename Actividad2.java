public class Actividad2 {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.marca = "Dodge";
        auto.modelo = "Challenger";
        auto.tipoDeCombustible = "Gasolina";
        auto.iniciarVehiculo(auto);
        

        Motocicleta moto = new Motocicleta();
        moto.marca = "Honda";
        moto.modelo = "pcx 160";
        moto.tipoDeCombustible = "Gasolina";
        moto.encender(); 
        auto.iniciarVehiculo(moto);
    
    }
}



