#include <iostream>

using namespace std;

// Definici�n de la clase Animal (general)
class Animal {
public:
    // M�todo virtual para hacer sonido
    virtual void hacerSonido() {
        cout << "Sonido gen�rico de un animal" << endl;
    }
};

// Clase derivada Perro (especializaci�n)
class Perro : public Animal {
public:
    // Implementaci�n espec�fica del m�todo hacerSonido para Perro
    void hacerSonido() override {
        cout << "Guau guau" << endl;
    }

    // Nuevo m�todo espec�fico para Perro
    void perseguirCola() {
        cout << "Persiguiendo la cola" << endl;
    }
};

// Clase derivada Gato (especializaci�n)
class Gato : public Animal {
public:
    // Implementaci�n espec�fica del m�todo hacerSonido para Gato
    void hacerSonido() override {
        cout << "Miau miau" << endl;
    }
};

int main() {
    // Crear objetos de las clases
    Animal animalGenerico;
    Perro miPerro;
    Gato miGato;

    // Llamar al m�todo hacerSonido de cada objeto
    cout << "Sonido del animal gen�rico: ";
    animalGenerico.hacerSonido();

    cout << "Sonido de mi perro: ";
    miPerro.hacerSonido();
    
    cout << "Sonido de mi gato: ";
    miGato.hacerSonido();

    // Llamar a m�todos espec�ficos de las clases derivadas
    miPerro.perseguirCola();

    return 0;
}

