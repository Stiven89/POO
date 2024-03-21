#include <iostream>
using namespace std;

class MiClasePublica {
public:
    int variablePublica; // Accesible desde cualquier lugar

    // M�todo p�blico para imprimir el valor de la variable p�blica
    void imprimirVariablePublica() {
        cout << "Valor de la variable p�blica: " << variablePublica << endl;
    }
};

int main() {
    MiClasePublica objeto;
    objeto.variablePublica = 10; // Acceso directo a la variable p�blica
    objeto.imprimirVariablePublica(); // Llamada al m�todo p�blico para imprimir el valor
    return 0;
}

