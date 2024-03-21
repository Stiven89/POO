#include <iostream>
using namespace std;

class MiClase {
private:
    static int contador; // Variable estática para contar instancias de la clase

public:
    MiClase() {
        contador++; // Incrementa el contador cada vez que se crea una instancia de la clase
    }

    // Método estático que devuelve el número de instancias creadas
    static int obtenerContador() {
        return contador;
    }
};

// Inicializar la variable estática
int MiClase::contador = 0;

int main() {
    MiClase obj1;
    MiClase obj2;

    cout << "Número de instancias de la clase: " << MiClase::obtenerContador() << endl;

    return 0;
}

