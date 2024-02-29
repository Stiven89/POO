#include <iostream>

using namespace std;

// Clase base
class Animal {
public:
    virtual void hacerSonido() {
        cout << "Sonido genérico de un animal." << endl;
    }
};

// Clase derivada
class Perro : public Animal {
public:
    void hacerSonido() override {
        cout << "Guau guau." << endl;
    }
};

// Función que usa polimorfismo
void hazSonar(Animal& animal) {
    animal.hacerSonido();
}

int main() {
    // Crear instancias de las clases
    Animal miAnimal;
    Perro miPerro;

    // Llamar a la función con diferentes tipos de objetos
    hazSonar(miAnimal);
    hazSonar(miPerro);

    return 0;
}

