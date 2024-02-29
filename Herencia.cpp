#include <iostream>

using namespace std;

// Clase base
class Vehiculo {
public:
    void arrancar() {
        cout << "Veh�culo arrancado." << endl;
    }
};

// Clase derivada
class Coche : public Vehiculo {
public:
    void conducir() {
        cout << "Coche en movimiento." << endl;
    }
};

int main() {
    // Crear un coche
    Coche miCoche;

    // Utilizar m�todos de la clase base y derivada
    miCoche.arrancar();
    miCoche.conducir();

    return 0;
}

