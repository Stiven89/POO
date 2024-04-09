# Definición de una función
def calcular_promedio(lista):
    """
    Esta función calcula el promedio de una lista de números.
    """
    # Palabra reservada "def" para definir una función

    # Verificamos si la lista está vacía
    if not lista:
        # Palabra reservada "if" para iniciar una estructura condicional
        # Palabra reservada "not" para negar una expresión
        # Palabra reservada "else" para definir la condición contraria en una estructura condicional
        # Palabra reservada "return" para devolver un valor de la función
        return 0

    # Calculamos la suma de los elementos de la lista
    suma = sum(lista)
    # Palabra reservada "sum" para sumar los elementos de una lista

    # Calculamos el promedio dividiendo la suma entre la cantidad de elementos
    promedio = suma / len(lista)
    # Palabra reservada "len" para obtener la longitud de una lista

    # Devolvemos el promedio calculado
    return promedio

# Lista de números
numeros = [10, 15, 20, 25, 30]

# Llamada a la función para calcular el promedio
promedio_resultado = calcular_promedio(numeros)

# Imprimimos el resultado
print("El promedio de la lista es:", promedio_resultado)
# Palabra reservada "print" para imprimir un mensaje o valor en la consola
