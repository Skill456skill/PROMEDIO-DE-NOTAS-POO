import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        // Datos iniciales
        LocalDate FechaNac = LocalDate.of(2005, 7, 28);
        Estudiante javier = new Estudiante("Javier", FechaNac, 5.0, 3.0, 1.0);
        System.out.println("\nEstudiante: " + javier.getNombre());

        // Edad
        System.out.println("Fecha de Nacimiento: " + javier.getFechaNac());
        System.out.println("Edad: " + javier.getEdad() + " Años");

        // Notas
        System.out.println("\n**** Notas ****\n");
        System.out.println("Nota 1: " + javier.getNota1());
        System.out.println("Nota 2: " + javier.getNota2());
        System.out.println("Nota 3: " + javier.getNota3());
        System.out.println("\n***************");

        // Promedio
        System.out.println("\nPROMEDIO: " + javier.getPromedio() + "\n");

    }
}