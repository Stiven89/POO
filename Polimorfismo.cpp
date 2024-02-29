#include <iostream>

using namespace std;

// Clase base
class Animal {
public:
    virtual void hacerSonido() {
        cout << "Sonido gen�rico de un animal." << endl;
    }
};

// Clase derivada
class Perro : public Animal {
public:
    void hacerSonido() override {
        cout << "Guau guau." << endl;
    }
};

// Funci�n que usa polimorfismo
void hazSonar(Animal& animal) {
    animal.hacerSonido();
}

int main() {
    // Crear instancias de las clases
    Animal miAnimal;
    Perro miPerro;

    // Llamar a la funci�n con diferentes tipos de objetos
    hazSonar(miAnimal);
    hazSonar(miPerro);

    return 0;
}

