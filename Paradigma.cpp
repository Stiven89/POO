#include <iostream>

using namespace std;

// Programación imperativa
void programacionImperativa() {
    int suma = 0;
    for (int i = 1; i <= 5; ++i) {
        suma += i;
    }
    cout << "Suma (Programación Imperativa): " << suma << endl;
}

// Programación funcional
int sumaFuncional(int a, int b) {
    return a + b;
}

void programacionFuncional() {
    int resultado = sumaFuncional(1, sumaFuncional(2, sumaFuncional(3, sumaFuncional(4, 5))));
    cout << "Suma (Programación Funcional): " << resultado << endl;
}

int main() {
    // Llamar a funciones que representan diferentes paradigmas
    programacionImperativa();
    programacionFuncional();

    return 0;
}

