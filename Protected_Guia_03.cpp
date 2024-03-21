#include <iostream>
using namespace std;

class MiClaseProtegida {
protected:
    int variableProtegida; // Accesible desde dentro de la clase y clases derivadas

public:
    // Método público para establecer el valor de la variable protegida
    void establecerVariableProtegida(int valor) {
        variableProtegida = valor;
    }

    // Método público para imprimir el valor de la variable protegida
    void imprimirVariableProtegida() {
        cout << "Valor de la variable protegida: " << variableProtegida << endl;
    }
};

// Clase derivada de MiClaseProtegida
class MiClaseDerivada : public MiClaseProtegida {
public:
    // Método público para acceder a la variable protegida de la clase base
    void imprimirVariableProtegidaDesdeDerivada() {
        cout << "Valor de la variable protegida desde la clase derivada: " << variableProtegida << endl;
    }
};

int main() {
    MiClaseDerivada objeto;
    objeto.establecerVariableProtegida(30); // Llamada al método público para establecer el valor
    objeto.imprimirVariableProtegida(); // Llamada al método público para imprimir el valor
    objeto.imprimirVariableProtegidaDesdeDerivada(); // Llamada al método público en la clase derivada
    // No se puede acceder directamente a la variable protegida desde fuera de la clase derivada
    // objeto.variableProtegida = 30; // Esto generaría un error
    return 0;
}

