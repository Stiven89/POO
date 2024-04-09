import java.lang.Math;

public class Main {
    
    public static class punto2D {
        private double x, y;
        
        public punto2D(double x, double y) {
            this.x = x;
            this.y = y;
        }
        
        public punto2D() {
            // getters y setters
        }
        
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }
    
    public static class vector2D {
        private punto2D inicio, fin;
        
        public vector2D() {
            inicio = new punto2D(0, 0);
            fin = new punto2D(0, 0);
        }
        
        public vector2D(punto2D inicio) {
            this.inicio = inicio;
            fin = new punto2D(0, 0);
        }
        
        public vector2D(punto2D inicio, punto2D fin) {
            this.inicio = inicio;
            this.fin = fin;
        }
    }
    
    public static class triangulo2DExtendido {
        private punto2D v1, v2, v3;
        
        public triangulo2DExtendido(punto2D v1, punto2D v2, punto2D v3) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }
        
        public triangulo2DExtendido(vector2D hipotenusa) {
            // Implementación del constructor para triángulo rectángulo con 1 vector (hipotenusa)
            punto2D inicio = hipotenusa.inicio;
            punto2D fin = hipotenusa.fin;
            
            double dx = fin.x - inicio.x;
            double dy = fin.y - inicio.y;
            
            // Se calculan los otros dos vértices del triángulo rectángulo
            punto2D v2 = new punto2D(fin.x, inicio.y);
            punto2D v3 = new punto2D(inicio.x, fin.y);
            
            this.v1 = inicio;
            this.v2 = v2;
            this.v3 = v3;
        }
        
        public boolean esValido() {
            // Implementación de la lógica para verificar si los puntos forman un triángulo válido
            // Se verifica si los puntos no son colineales, es decir, si el área del triángulo formado por los tres puntos es mayor que cero
            double area = Math.abs((v1.x*(v2.y-v3.y) + v2.x*(v3.y-v1.y) + v3.x*(v1.y-v2.y)) / 2.0);
            return area > 0;
        }
        
        public double area() {
            // Implementación de la fórmula para calcular el área del triángulo
            double lado1 = Math.sqrt(Math.pow((v2.x - v1.x), 2) + Math.pow((v2.y - v1.y), 2));
            double lado2 = Math.sqrt(Math.pow((v3.x - v2.x), 2) + Math.pow((v3.y - v2.y), 2));
            double lado3 = Math.sqrt(Math.pow((v1.x - v3.x), 2) + Math.pow((v1.y - v3.y), 2));
            double s = (lado1 + lado2 + lado3) / 2;
            return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        }
        
        public double perimetro() {
            // Implementación del cálculo del perímetro del triángulo
            double lado1 = Math.sqrt(Math.pow((v2.x - v1.x), 2) + Math.pow((v2.y - v1.y), 2));
            double lado2 = Math.sqrt(Math.pow((v3.x - v2.x), 2) + Math.pow((v3.y - v2.y), 2));
            double lado3 = Math.sqrt(Math.pow((v1.x - v3.x), 2) + Math.pow((v1.y - v3.y), 2));
            return lado1 + lado2 + lado3;
        }
        
        public String toString() {
            // Representación del triángulo como cadena de caracteres
            return "Triángulo: " + v1.toString() + ", " + v2.toString() + ", " + v3.toString();
        }
    }
    
    public static void main(String[] args) {
        // Crear un triángulo con tres puntos dados
        punto2D p1 = new punto2D(0, 0);
        punto2D p2 = new punto2D(1, 0);
        punto2D p3 = new punto2D(0, 1);
        triangulo2DExtendido triangulo1 = new triangulo2DExtendido(p1, p2, p3);
        System.out.println(triangulo1);
        System.out.println("Área: " + triangulo1.area());
        System.out.println("Perímetro: " + triangulo1.perimetro());
        System.out.println("Es válido: " + triangulo1.esValido());
        
        // Crear un triángulo rectángulo con 1 vector (hipotenusa)
        punto2D inicio = new punto2D(0, 0);
        punto2D fin = new punto2D(3, 4);
        vector2D hipotenusa = new vector2D(inicio, fin);
        triangulo2DExtendido triangulo2 = new triangulo2DExtendido(hipotenusa);
        System.out.println(triangulo2);
        System.out.println("Área: " + triangulo2.area());
        System.out.println("Perímetro: " + triangulo2.perimetro());
        System.out.println("Es válido: " + triangulo2.esValido());

        // Prueba de las clases creadas usando una repetición y creando objetos con diferentes configuraciones de triángulos
        punto2D[] puntos = {
            new punto2D(1, 1),
            new punto2D(2, 3),
            new punto2D(4, 1)
        };

        for (int i = 0; i < puntos.length; i++) {
            punto2D v1 = puntos[i];
            punto2D v2 = puntos[(i + 1) % puntos.length];
            punto2D v3 = puntos[(i + 2) % puntos.length];
            triangulo2DExtendido triangulo = new triangulo2DExtendido(v1, v2, v3);
            System.out.println("Creando triángulo con puntos " + v1 + ", " + v2 + ", " + v3 + "...");
            System.out.println(triangulo);
            System.out.println("Área: " + triangulo.area());
            System.out.println("Perímetro: " + triangulo.perimetro());
            System.out.println("Es válido: " + triangulo.esValido());
            System.out.println();
        }
    }
}
