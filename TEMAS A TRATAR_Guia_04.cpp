#include <iostream>
using namespace std;

class Alumno {
private:
    string nombre;
    int edad;

public:
    // Constructor
    Alumno(string n, int e) {
        nombre = n;
        edad = e;
        cout << "Se ha creado un objeto Alumno." << endl;
    }

    // Destructor
    ~Alumno() {
        cout << "Se ha destruido un objeto Alumno." << endl;
    }

    // M�todo para mostrar informaci�n del alumno
    void mostrarInfo() {
        cout << "Nombre: " << nombre << endl;
        cout << "Edad: " << edad << endl;
    }
};

int main() {
    // Creaci�n de objetos Alumno y secuenciaci�n
    cout << "Creaci�n de objetos Alumno y secuenciaci�n:" << endl;
    cout << "-------------------------------------------" << endl;
    Alumno alumno1("Julian", 20);
    Alumno alumno2("Lina", 21);

    // Ejemplo de repetici�n
    cout << "\nEjemplo de repetici�n:" << endl;
    cout << "-----------------------" << endl;
    cout << "Mostrando informaci�n de los alumnos:" << endl;
    alumno1.mostrarInfo();
    alumno2.mostrarInfo();

    return 0;
}

