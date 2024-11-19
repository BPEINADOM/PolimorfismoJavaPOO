package Domain.Model;

public class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("El estudiante se esta presentando.");
    }
}
