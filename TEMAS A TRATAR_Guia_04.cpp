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

    // Método para mostrar información del alumno
    void mostrarInfo() {
        cout << "Nombre: " << nombre << endl;
        cout << "Edad: " << edad << endl;
    }
};

int main() {
    // Creación de objetos Alumno y secuenciación
    cout << "Creación de objetos Alumno y secuenciación:" << endl;
    cout << "-------------------------------------------" << endl;
    Alumno alumno1("Julian", 20);
    Alumno alumno2("Lina", 21);

    // Ejemplo de repetición
    cout << "\nEjemplo de repetición:" << endl;
    cout << "-----------------------" << endl;
    cout << "Mostrando información de los alumnos:" << endl;
    alumno1.mostrarInfo();
    alumno2.mostrarInfo();

    return 0;
}

