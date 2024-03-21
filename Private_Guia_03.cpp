#include <iostream>
using namespace std;

class MiClasePrivada {
private:
    int variablePrivada; // Solo accesible desde dentro de la clase

public:
    // Método público para establecer el valor de la variable privada
    void establecerVariablePrivada(int valor) {
        variablePrivada = valor;
    }

    // Método público para imprimir el valor de la variable privada
    void imprimirVariablePrivada() {
        cout << "Valor de la variable privada: " << variablePrivada << endl;
    }
};

int main() {
    MiClasePrivada objeto;
    objeto.establecerVariablePrivada(20); // Llamada al método público para establecer el valor
    objeto.imprimirVariablePrivada(); // Llamada al método público para imprimir el valor
    // No se puede acceder directamente a la variable privada
    // objeto.variablePrivada = 20; // Esto generaría un error
    return 0;
}

