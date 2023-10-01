import java.time.LocalDate;

public class Estudiante {

    /* Atributos */
    private String nombre;
    private LocalDate FechaNac;
    private double promedio;
    private double nota1;
    private double nota2;
    private double nota3;

    /* Metodo Constructor */
    public Estudiante(String nombre, LocalDate FechaNac, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.FechaNac = FechaNac;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo para calcular la edad del estudiante
    public LocalDate getFechaNac() {
        return FechaNac;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - FechaNac.getYear();
    }
    //

    // Metodo para calcular el promedio del estudiante
    public double getPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    //

    // Getters and Setters Notas
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

}
