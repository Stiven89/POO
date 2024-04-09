#include <iostream>
using namespace std;

class Ejemplo {
public:
    // Constructor
    Ejemplo() {
        cout << "Se ha creado un objeto Ejemplo." << endl;
    }

    // Destructor
    ~Ejemplo() {
        cout << "Se ha destruido un objeto Ejemplo." << endl;
    }
};

int main() {
    // Creación de objeto Ejemplo
    Ejemplo objeto;

    return 0;
}

