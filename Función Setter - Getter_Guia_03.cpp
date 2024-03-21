#include <iostream>
#include <string>
using namespace std;

class Persona {
private:
    string nombre;
    int edad;

public:
    // Constructor
    Persona(string nombreInicial, int edadInicial) {
        nombre = nombreInicial;
        edad = edadInicial;
    }

    // Setter para el nombre
    void setNombre(string nuevoNombre) {
        nombre = nuevoNombre;
    }

    // Getter para el nombre
    string getNombre() const {
        return nombre;
    }

    // Setter para la edad
    void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    // Getter para la edad
    int getEdad() const {
        return edad;
    }
};

int main() {
    // Crear una instancia de la clase Persona
    Persona persona1("Juan", 30);

    // Mostrar los datos de la persona
    cout << "Nombre: " << persona1.getNombre() << endl;
    cout << "Edad: " << persona1.getEdad() << endl;

    // Actualizar los datos de la persona utilizando los setters
    persona1.setNombre("María");
    persona1.setEdad(25);

    // Mostrar los nuevos datos de la persona
    cout << "\nDespués de la actualización:" << endl;
    cout << "Nombre: " << persona1.getNombre() << endl;
    cout << "Edad: " << persona1.getEdad() << endl;

    return 0;
}

