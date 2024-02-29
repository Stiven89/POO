#include <iostream>

using namespace std;

// Definición de la clase
class Saludo {
public:
    // Método para mostrar un saludo
    void saludar() {
        cout << "¡Hola, soy un objeto de la clase Saludo!" << endl;
    }
};

int main() {
    // Crear un objeto de la clase Saludo
    Saludo miSaludo;

    // Llamar al método del objeto
    miSaludo.saludar();

    return 0;
}

