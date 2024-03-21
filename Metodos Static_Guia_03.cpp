#include <iostream>
using namespace std;

class MiClase {
private:
    static int contador; // Variable est�tica para contar instancias de la clase

public:
    MiClase() {
        contador++; // Incrementa el contador cada vez que se crea una instancia de la clase
    }

    // M�todo est�tico que devuelve el n�mero de instancias creadas
    static int obtenerContador() {
        return contador;
    }
};

// Inicializar la variable est�tica
int MiClase::contador = 0;

int main() {
    MiClase obj1;
    MiClase obj2;

    cout << "N�mero de instancias de la clase: " << MiClase::obtenerContador() << endl;

    return 0;
}

