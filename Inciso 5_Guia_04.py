import math

class Punto2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"

class Vector2D:
    def __init__(self, inicio=None, fin=None):
        if inicio is None:
            inicio = Punto2D(0, 0)
        self.inicio = inicio
        if fin is None:
            fin = Punto2D(0, 0)
        self.fin = fin

    def __str__(self):
        return f"Vector: {self.inicio} -> {self.fin}"

class Triangulo2D:
    def __init__(self, v1=None, v2=None, v3=None, hipotenusa=None):
        if v1 is None:
            v1 = Punto2D(0, 0)
        if v2 is None:
            v2 = Punto2D(1, 0)
        if v3 is None:
            v3 = Punto2D(0, 1)
        self.v1 = v1
        self.v2 = v2
        self.v3 = v3
        if hipotenusa:
            self.v2 = hipotenusa.fin

    def es_valido(self):
        # Verifica si los puntos no son colineales, es decir, si el área del triángulo es mayor que cero
        area = abs((self.v1.x*(self.v2.y-self.v3.y) + self.v2.x*(self.v3.y-self.v1.y) + self.v3.x*(self.v1.y-self.v2.y)) / 2.0)
        return area > 0

    def area(self):
        # Calcula el área del triángulo usando la fórmula de Herón
        lado1 = math.sqrt((self.v2.x - self.v1.x)**2 + (self.v2.y - self.v1.y)**2)
        lado2 = math.sqrt((self.v3.x - self.v2.x)**2 + (self.v3.y - self.v2.y)**2)
        lado3 = math.sqrt((self.v1.x - self.v3.x)**2 + (self.v1.y - self.v3.y)**2)
        s = (lado1 + lado2 + lado3) / 2
        return math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))

    def perimetro(self):
        # Calcula el perímetro del triángulo
        lado1 = math.sqrt((self.v2.x - self.v1.x)**2 + (self.v2.y - self.v1.y)**2)
        lado2 = math.sqrt((self.v3.x - self.v2.x)**2 + (self.v3.y - self.v2.y)**2)
        lado3 = math.sqrt((self.v1.x - self.v3.x)**2 + (self.v1.y - self.v3.y)**2)
        return lado1 + lado2 + lado3

    def angulos(self):
        # Calcula los ángulos del triángulo
        angulo1 = math.degrees(math.acos(((self.v2.x - self.v1.x) * (self.v3.x - self.v1.x) + (self.v2.y - self.v1.y) * (self.v3.y - self.v1.y)) / ((math.sqrt((self.v2.x - self.v1.x)**2 + (self.v2.y - self.v1.y)**2)) * (math.sqrt((self.v3.x - self.v1.x)**2 + (self.v3.y - self.v1.y)**2)))))
        angulo2 = math.degrees(math.acos(((self.v1.x - self.v2.x) * (self.v3.x - self.v2.x) + (self.v1.y - self.v2.y) * (self.v3.y - self.v2.y)) / ((math.sqrt((self.v1.x - self.v2.x)**2 + (self.v1.y - self.v2.y)**2)) * (math.sqrt((self.v3.x - self.v2.x)**2 + (self.v3.y - self.v2.y)**2)))))
        angulo3 = 180 - angulo1 - angulo2
        return angulo1, angulo2, angulo3

    def __str__(self):
        return f"Triángulo: {self.v1}, {self.v2}, {self.v3}"

# Crear un triángulo con tres puntos dados
p1 = Punto2D(0, 0)
p2 = Punto2D(1, 0)
p3 = Punto2D(0, 1)
triangulo1 = Triangulo2D(v1=p1, v2=p2, v3=p3)

# Crear un triángulo rectángulo con un vector (hipotenusa)
v = Vector2D(fin=Punto2D(3, 4))
triangulo2 = Triangulo2D(hipotenusa=v)

# Imprimir resultados
print(triangulo1)
print("Área:", triangulo1.area())
print("Perímetro:", triangulo1.perimetro())
print("Ángulos:", triangulo1.angulos())
print("Es válido:", triangulo1.es_valido())

print("\n" + "-"*50 + "\n")

print(triangulo2)
print("Área:", triangulo2.area())
print("Perímetro:", triangulo2.perimetro())
print("Ángulos:", triangulo2.angulos())
print("Es válido:", triangulo2.es_valido())

# Pruebe las clases creadas usando una repetición y creando objetos con diferentes
# secuencias de variables
configuraciones_triangulos = [
    {"tipo": "tres_puntos", "v1": Punto2D(1, 1), "v2": Punto2D(2, 3), "v3": Punto2D(4, 1)},
    {"tipo": "rectangulo_hipotenusa", "hipotenusa": Vector2D(inicio=Punto2D(1, 1), fin=Punto2D(5, 1))},
    {"tipo": "tres_puntos", "v1": Punto2D(0, 0), "v2": Punto2D(3, 0), "v3": Punto2D(0, 4)},
    {"tipo": "rectangulo_hipotenusa", "hipotenusa": Vector2D(inicio=Punto2D(0, 0), fin=Punto2D(3, 4))}
]

for config in configuraciones_triangulos:
    print(f"Creando triángulo ({config['tipo']})...")
    if config['tipo'] == "tres_puntos":
        triangulo = Triangulo2D(v1=config['v1'], v2=config['v2'], v3=config['v3'])
    elif config['tipo'] == "rectangulo_hipotenusa":
        triangulo = Triangulo2D(hipotenusa=config['hipotenusa'])

    # Imprimir resultados
    print(triangulo)
    print("Área:", triangulo.area())
    print("Perímetro:", triangulo.perimetro())
    print("Ángulos:", triangulo.angulos())
    print("Es válido:", triangulo.es_valido())
    print("\n" + "-"*50 + "\n")
