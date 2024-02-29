#include <iostream>

using namespace std;

// Clase abstracta
class InstrumentoMusical {
public:
    // M�todo virtual puro
    virtual void tocar() = 0;
};

// Clase derivada
class Piano : public InstrumentoMusical {
public:
    // Implementaci�n del m�todo tocar para el piano
    void tocar() override {
        cout << "Tocando el piano." << endl;
    }
};

int main() {
    // No se puede crear una instancia de la clase abstracta
    // InstrumentoMusical miInstrumento;  // Esto dar� un error

    // Pero se pueden usar sus clases derivadas
    Piano miPiano;
    miPiano.tocar();

    return 0;
}

