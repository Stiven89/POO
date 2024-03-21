#include <iostream>
using namespace std;

class MiClasePublica {
public:
    int variablePublica; // Accesible desde cualquier lugar

    // Método público para imprimir el valor de la variable pública
    void imprimirVariablePublica() {
        cout << "Valor de la variable pública: " << variablePublica << endl;
    }
};

int main() {
    MiClasePublica objeto;
    objeto.variablePublica = 10; // Acceso directo a la variable pública
    objeto.imprimirVariablePublica(); // Llamada al método público para imprimir el valor
    return 0;
}

