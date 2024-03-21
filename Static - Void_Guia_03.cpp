#include <iostream>
using namespace std;

void contarLlamadas() {
    static int contador = 0; // Variable est�tica

    contador++; // Incrementar el contador en cada llamada
    cout << "Esta es la llamada n�mero " << contador << " a la funci�n." << endl;
}

int main() {
    for (int i = 0; i < 5; ++i) {
        contarLlamadas(); // Llamar a la funci�n varias veces
    }

    return 0;
}

