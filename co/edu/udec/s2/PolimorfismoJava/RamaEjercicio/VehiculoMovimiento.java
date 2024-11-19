import Domain.Model.Ejercicio4.Bicicleta;
import Domain.Model.Ejercicio4.Coche;
import Domain.Model.Ejercicio4.Vehiculo;

public class VehiculoMovimiento {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");
        
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new Coche();
        Vehiculo bicicleta = new Bicicleta();

        vehiculo.mover();
        coche.mover();
        bicicleta.mover();

        System.out.println("*********************************************");

    }
}
