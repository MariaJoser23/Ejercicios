class Vehiculo {
    String marca;
    String modelo;

    void encender() {
        System.out.println("El vehículo está encendido.");
    }

    void iniciarVehiculo(Vehiculo vehiculo){
        vehiculo.encender();
    }
}

class Auto extends Vehiculo {
    String tipoDeCombustible;

    @Override
    void encender() {
        System.out.println("El auto está encendido.");
    }
}

class Motocicleta extends Vehiculo {
    String tipoDeCombustible;

 @Override
 void encender() {
        System.out.println("La motocicleta está encendida.");
    }
}

class Camioneta extends Vehiculo {
    private boolean sistema4x4; 

    public Camioneta(boolean sistema4x4) {
        this.sistema4x4 = sistema4x4;
    }

    public boolean isSistema4x4() {
        return sistema4x4;
    }

    public void setSistema4x4(boolean sistema4x4) {
        this.sistema4x4 = sistema4x4;
    }

    @Override
    void encender() {
        System.out.println("La camioneta está encendida.");
    }
}

public class Actividad1{
    public static void main(String[] args) {
       
        Auto auto = new Auto();
        auto.marca = "Dodge";
        auto.modelo = "Challenger";
        auto.tipoDeCombustible = "Gasolina";
        auto.encender(); 

        Motocicleta moto = new Motocicleta();
        moto.marca = "Honda";
        moto.modelo = "pcx 160";
        moto.tipoDeCombustible = "Gasolina";
        moto.encender();  
    }
}



