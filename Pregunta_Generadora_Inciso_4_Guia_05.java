class Animal {
    void hacerSonido() {
        System.out.println("Animal hace sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau guau!");
    }

    void jugar() {
        System.out.println("El perro está jugando.");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau miau!");
    }

    void arañarMuebles() {
        System.out.println("El gato está arañando los muebles.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        animal1.hacerSonido();  
        animal2.hacerSonido();  

    
        if (animal1 instanceof Perro) {
            Perro miPerro = (Perro) animal1;
            miPerro.jugar();  
        }

        if (animal2 instanceof Gato) {
            Gato miGato = (Gato) animal2;
            miGato.arañarMuebles();  
        }
    }
}
