#include <iostream>
using namespace std;

int main(int argc, char* argv[]) {
    // Imprimir el número de argumentos pasados al programa
    cout << "Número de argumentos: " << argc << endl;

    // Imprimir los argumentos uno por uno
    cout << "Argumentos pasados al programa:" << endl;
    for (int i = 0; i < argc; ++i) {
        cout << "Argumento " << i << ": " << argv[i] << endl;
    }

    return 0;
}

