#include <iostream>

using namespace std;

class CajaFuerte {
private:
    int codigo;

public:
    // Constructor que inicializa el código
    CajaFuerte(int codigoInicial) {
        codigo = codigoInicial;
    }

    // Método para abrir la caja fuerte
    void abrir(int codigoIngresado) {
        if (codigoIngresado == codigo) {
            cout << "Caja fuerte abierta. Bien hecho." << endl;
        } else {
            cout << "Código incorrecto. Caja fuerte cerrada." << endl;
        }
    }
};

int main() {
    // Crear una instancia de la caja fuerte
    CajaFuerte miCajaFuerte(1234);

    // Intentar abrir la caja fuerte con un código incorrecto
    miCajaFuerte.abrir(4321);

    // Intentar abrir la caja fuerte con el código correcto
    miCajaFuerte.abrir(1234);

    return 0;
}

