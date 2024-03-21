import math  # Importar la biblioteca matemática para operaciones matemáticas
import matplotlib.pyplot as plt  # Importar matplotlib para visualización de datos
from matplotlib.patches import Polygon  # Importar la clase Polygon de matplotlib para dibujar un polígono

class Punto2D:
    def __init__(self, x, y):
        self.x = x  # Coordenada x del punto
        self.y = y  # Coordenada y del punto
    
    def __str__(self):
        return f'Punto({self.x}, {self.y})'  # Representación en forma de cadena del punto

class Triangulo2D:
    def __init__(self):
        # Definir los puntos del triángulo
        self.punto1 = Punto2D(0, 0)
        self.punto2 = Punto2D(3, 0)
        self.punto3 = Punto2D(0, 4)
    
    def __str__(self):
        return f'Triangulo:\n{self.punto1}, {self.punto2}, {self.punto3}'  # Representación en forma de cadena del triángulo
    
    def calcular_longitud(self, p1, p2):
        # Calcular la longitud entre dos puntos utilizando el teorema de Pitágoras
        return math.sqrt((p2.x - p1.x) ** 2 + (p2.y - p1.y) ** 2)
    
    def calcular_angulo(self, lado1, lado2, lado3):
        # Calcular el ángulo entre dos lados del triángulo utilizando la ley de los cosenos
        return math.acos((lado1 ** 2 + lado2 ** 2 - lado3 ** 2) / (2 * lado1 * lado2))
    
    def calcular_area(self):
        # Calcular el área del triángulo utilizando la fórmula de Herón
        lado1 = self.calcular_longitud(self.punto1, self.punto2)
        lado2 = self.calcular_longitud(self.punto2, self.punto3)
        lado3 = self.calcular_longitud(self.punto3, self.punto1)
        semiperimetro = (lado1 + lado2 + lado3) / 2
        return math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3))
    
    def calcular_perimetro(self):
        # Calcular el perímetro del triángulo sumando las longitudes de los tres lados
        lado1 = self.calcular_longitud(self.punto1, self.punto2)
        lado2 = self.calcular_longitud(self.punto2, self.punto3)
        lado3 = self.calcular_longitud(self.punto3, self.punto1)
        return lado1 + lado2 + lado3

# Crear un objeto de Triangulo2D
triangulo = Triangulo2D()

# Visualización del triángulo
fig, ax = plt.subplots()  # Crear una figura y un eje
ax.set_aspect('equal', 'box')  # Establecer la relación de aspecto del eje
ax.set_xlim([-1, 4])  # Establecer los límites del eje x
ax.set_ylim([-1, 5])  # Establecer los límites del eje y

# Dibujar el triángulo
triangulo_vertices = [[triangulo.punto1.x, triangulo.punto1.y], [triangulo.punto2.x, triangulo.punto2.y], [triangulo.punto3.x, triangulo.punto3.y]]
triangulo_poligono = Polygon(triangulo_vertices, closed=True, fill=None, edgecolor='black')  # Crear un polígono con los vértices del triángulo
ax.add_patch(triangulo_poligono)  # Añadir el polígono al eje

# Etiquetas de puntos
ax.text(triangulo.punto1.x, triangulo.punto1.y, 'P1', verticalalignment='bottom', horizontalalignment='right', fontsize=12)
ax.text(triangulo.punto2.x, triangulo.punto2.y, 'P2', verticalalignment='bottom', horizontalalignment='right', fontsize=12)
ax.text(triangulo.punto3.x, triangulo.punto3.y, 'P3', verticalalignment='bottom', horizontalalignment='right', fontsize=12)

# Mostrar la visualización
plt.title("Triángulo 2D")  # Establecer el título del gráfico
plt.xlabel("X")  # Etiqueta del eje x
plt.ylabel("Y")  # Etiqueta del eje y
plt.grid(True)  # Activar las líneas de la cuadrícula
plt.show()  # Mostrar el gráfico

# Calcular e imprimir los ángulos, el área y el perímetro del triángulo
print("Ángulos del triángulo (en radianes):")
lado1 = triangulo.calcular_longitud(triangulo.punto1, triangulo.punto2)
lado2 = triangulo.calcular_longitud(triangulo.punto2, triangulo.punto3)
lado3 = triangulo.calcular_longitud(triangulo.punto3, triangulo.punto1)
print("Ángulo 1:", triangulo.calcular_angulo(lado1, lado2, lado3))
# Calcular más ángulos si es necesario
print("Área del triángulo:", triangulo.calcular_area())
print("Perímetro del triángulo:", triangulo.calcular_perimetro())
