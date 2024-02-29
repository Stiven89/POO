#include <iostream>

using namespace std;

// Clase abstracta
class InstrumentoMusical {
public:
    // Método virtual puro
    virtual void tocar() = 0;
};

// Clase derivada
class Piano : public InstrumentoMusical {
public:
    // Implementación del método tocar para el piano
    void tocar() override {
        cout << "Tocando el piano." << endl;
    }
};

int main() {
    // No se puede crear una instancia de la clase abstracta
    // InstrumentoMusical miInstrumento;  // Esto dará un error

    // Pero se pueden usar sus clases derivadas
    Piano miPiano;
    miPiano.tocar();

    return 0;
}

