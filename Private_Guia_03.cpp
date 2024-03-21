#include <iostream>
using namespace std;

class MiClasePrivada {
private:
    int variablePrivada; // Solo accesible desde dentro de la clase

public:
    // M�todo p�blico para establecer el valor de la variable privada
    void establecerVariablePrivada(int valor) {
        variablePrivada = valor;
    }

    // M�todo p�blico para imprimir el valor de la variable privada
    void imprimirVariablePrivada() {
        cout << "Valor de la variable privada: " << variablePrivada << endl;
    }
};

int main() {
    MiClasePrivada objeto;
    objeto.establecerVariablePrivada(20); // Llamada al m�todo p�blico para establecer el valor
    objeto.imprimirVariablePrivada(); // Llamada al m�todo p�blico para imprimir el valor
    // No se puede acceder directamente a la variable privada
    // objeto.variablePrivada = 20; // Esto generar�a un error
    return 0;
}

