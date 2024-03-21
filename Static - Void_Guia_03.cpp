#include <iostream>
using namespace std;

void contarLlamadas() {
    static int contador = 0; // Variable estática

    contador++; // Incrementar el contador en cada llamada
    cout << "Esta es la llamada número " << contador << " a la función." << endl;
}

int main() {
    for (int i = 0; i < 5; ++i) {
        contarLlamadas(); // Llamar a la función varias veces
    }

    return 0;
}

