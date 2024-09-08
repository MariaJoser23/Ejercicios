class Animal {
    String foto;
    String comida;
    String localizacion;
    String tamaño;

    void comer() {
        System.out.println("El animal está comiendo.");
    }

    void hacerRuido() {
        System.out.println("El animal está haciendo ruido.");
    }

    void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    void rugir() {
        System.out.println("El animal está rugiendo.");
    }
}

class Felino extends Animal {
    @Override
    void rugir() {
        System.out.println("El felino está haciendo ruido.");
    }
}

class Canino extends Animal {
    @Override
    void rugir() {
        System.out.println("El canino esta haciendo ruido.");
    }
}

class Leon extends Felino {
    @Override
    void hacerRuido() {
        System.out.println("El león ruge.");
    }

    @Override
    void comer() {
        System.out.println("El león está comiendo carne.");
    }
}

class Tigre extends Felino {
    @Override
    void hacerRuido() {
        System.out.println("El tigre ruge.");
    }

    @Override
    void comer() {
        System.out.println("El tigre está comiendo.");
    }
}

class Gato extends Felino {
    @Override
    void hacerRuido() {
        System.out.println("El gato está maullando.");
    }

    @Override
    void comer() {
        System.out.println("El gato está comiendo.");
    }

    void vacunar() {
        System.out.println("El gato siendo vacunado.");
    }
}

class Lobo extends Canino {
    @Override
    void hacerRuido() {
        System.out.println("El lobo está aullando.");
    }

    @Override
    void comer() {
        System.out.println("El lobo está comiendo.");
    }
}

class Perro extends Canino {
    @Override
    void hacerRuido() {
        System.out.println("El perro está ladrando.");
    }

    @Override
    void comer() {
        System.out.println("El perro está comiendo.");
    }

    void vacunar() {
        System.out.println("El perro esta siendo vacunado.");
    }

    void sacarPaseo() {
        System.out.println("El perro esta saliendo a pasear.");
    }
}

public class animales {
    public static void main(String[] args) {
        Leon leon = new Leon();
        Tigre tigre = new Tigre();
        Gato gato = new Gato();
        Lobo lobo = new Lobo();
        Perro perro = new Perro();

        leon.hacerRuido();
        tigre.hacerRuido();
        gato.hacerRuido();
        lobo.hacerRuido();
        perro.hacerRuido();

        gato.vacunar();
        perro.vacunar();
        perro.sacarPaseo();
    }
}




