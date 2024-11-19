import Domain.Model.Ejercicio2.Estudiante;
import Domain.Model.Ejercicio2.Persona;
import Domain.Model.Ejercicio2.Profesor;

public class Presentarse {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancias de las personas usando polimorfismo
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        // Mostrar las presentaciones
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

        System.out.println("*********************************************");

    }
    
}
