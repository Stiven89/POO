#include <iostream>

using namespace std;

// Definici�n de la clase
class Saludo {
public:
    // M�todo para mostrar un saludo
    void saludar() {
        cout << "�Hola, soy un objeto de la clase Saludo!" << endl;
    }
};

int main() {
    // Crear un objeto de la clase Saludo
    Saludo miSaludo;

    // Llamar al m�todo del objeto
    miSaludo.saludar();

    return 0;
}

