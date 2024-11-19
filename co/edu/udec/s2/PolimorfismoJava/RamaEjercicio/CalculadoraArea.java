import Domain.Model.Ejercicio1.Circulo;
import Domain.Model.Ejercicio1.Rectangulo;
import Domain.Model.Ejercicio1.Figura;

public class CalculadoraArea {

    public static void main(String[] args) {
        
        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancias de las figuras usando polimorfismo
        Figura circulo = new Circulo(15);
        Figura rectangulo = new Rectangulo(6, 8);

        // Mostrar el area de las figuras
        System.out.println("- Circulo:");
        circulo.mostrarArea();
        System.out.println("- Rectangulo:");
        rectangulo.mostrarArea();

        System.out.println("*********************************************");
    }
}
