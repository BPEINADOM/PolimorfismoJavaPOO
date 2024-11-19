import Domain.Model.Estudiante;
import Domain.Model.Persona;
import Domain.Model.Profesor;

public class Presentarse {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancias de las personas usando polimorfismo
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        // Mostrar las presentaciones
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

        System.out.println("*********************************************");

    }
    
}
