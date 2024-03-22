import math

class Punto2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def __str__(self):
        return f"Punto: ({self.x}, {self.y})"

class Triangulo2D:
    def __init__(self, punto1, punto2, punto3):
        self.punto1 = punto1
        self.punto2 = punto2
        self.punto3 = punto3
    
    def __str__(self):
        return f"Triangulo formado por los puntos:\n{self.punto1}\n{self.punto2}\n{self.punto3}"
    
    def calcular_lados(self):
        lado1 = math.sqrt((self.punto2.x - self.punto1.x)**2 + (self.punto2.y - self.punto1.y)**2)
        lado2 = math.sqrt((self.punto3.x - self.punto2.x)**2 + (self.punto3.y - self.punto2.y)**2)
        lado3 = math.sqrt((self.punto1.x - self.punto3.x)**2 + (self.punto1.y - self.punto3.y)**2)
        return lado1, lado2, lado3
    
    def calcular_angulos(self):
        lado1, lado2, lado3 = self.calcular_lados()
        angulo1 = math.degrees(math.acos((lado2**2 + lado3**2 - lado1**2) / (2 * lado2 * lado3)))
        angulo2 = math.degrees(math.acos((lado1**2 + lado3**2 - lado2**2) / (2 * lado1 * lado3)))
        angulo3 = 180 - angulo1 - angulo2
        return angulo1, angulo2, angulo3
    
    def area(self):
        lado1, lado2, lado3 = self.calcular_lados()
        s = (lado1 + lado2 + lado3) / 2
        area = math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))
        return area
    
    def perimetro(self):
        lado1, lado2, lado3 = self.calcular_lados()
        return lado1 + lado2 + lado3

# Solicitar al usuario que ingrese las coordenadas de los puntos
x1 = float(input("Ingrese la coordenada x del primer punto: "))
y1 = float(input("Ingrese la coordenada y del primer punto: "))
x2 = float(input("Ingrese la coordenada x del segundo punto: "))
y2 = float(input("Ingrese la coordenada y del segundo punto: "))
x3 = float(input("Ingrese la coordenada x del tercer punto: "))
y3 = float(input("Ingrese la coordenada y del tercer punto: "))

# Crear objetos Punto2D
punto1 = Punto2D(x1, y1)
punto2 = Punto2D(x2, y2)
punto3 = Punto2D(x3, y3)

# Crear objeto Triangulo2D
triangulo = Triangulo2D(punto1, punto2, punto3)

# Mostrar información del triángulo
print(triangulo)

# Calcular y mostrar los ángulos formados por los lados del triángulo
angulos = triangulo.calcular_angulos()
print(f"Ángulos del triángulo: {angulos[0]}°, {angulos[1]}°, {angulos[2]}°")

# Calcular y mostrar el área del triángulo
print(f"Área del triángulo: {triangulo.area()}")

# Calcular y mostrar el perímetro del triángulo
print(f"Perímetro del triángulo: {triangulo.perimetro()}")
