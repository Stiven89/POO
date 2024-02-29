#include <iostream>

using namespace std;

// Clase abstracta
class Figura {
public:
    virtual void dibujar() = 0;  // Método virtual puro
};

// Clase derivada
class Circulo : public Figura {
public:
    void dibujar() override {
        cout << "Dibujando un círculo." << endl;
    }
};

int main() {
    // No se puede crear una instancia de la clase abstracta
    // Figura miFigura;  // Esto dará un error

    // Pero se pueden usar sus clases derivadas
    Circulo miCirculo;
    miCirculo.dibujar();

    return 0;
}

