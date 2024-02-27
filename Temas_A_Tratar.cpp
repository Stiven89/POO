#include <iostream>

using namespace std;

// Definición de la clase Animal (general)
class Animal {
public:
    // Método virtual para hacer sonido
    virtual void hacerSonido() {
        cout << "Sonido genérico de un animal" << endl;
    }
};

// Clase derivada Perro (especialización)
class Perro : public Animal {
public:
    // Implementación específica del método hacerSonido para Perro
    void hacerSonido() override {
        cout << "Guau guau" << endl;
    }

    // Nuevo método específico para Perro
    void perseguirCola() {
        cout << "Persiguiendo la cola" << endl;
    }
};

// Clase derivada Gato (especialización)
class Gato : public Animal {
public:
    // Implementación específica del método hacerSonido para Gato
    void hacerSonido() override {
        cout << "Miau miau" << endl;
    }
};

int main() {
    // Crear objetos de las clases
    Animal animalGenerico;
    Perro miPerro;
    Gato miGato;

    // Llamar al método hacerSonido de cada objeto
    cout << "Sonido del animal genérico: ";
    animalGenerico.hacerSonido();

    cout << "Sonido de mi perro: ";
    miPerro.hacerSonido();
    
    cout << "Sonido de mi gato: ";
    miGato.hacerSonido();

    // Llamar a métodos específicos de las clases derivadas
    miPerro.perseguirCola();

    return 0;
}

