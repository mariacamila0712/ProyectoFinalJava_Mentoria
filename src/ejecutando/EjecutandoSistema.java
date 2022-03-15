package ejecutando;

import universidad.Carrera;
import universidad.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EjecutandoSistema {
    public static void main(String[] args) {

        Carrera carrera1 = new Carrera(1, "Arquitectura");

        List<String> materias1 =  new ArrayList<String>();
        materias1.add("Matemáticas I");
        materias1.add("Lectura Crítica");
        materias1.add("Diseño");
        materias1.add("Costos");
        carrera1.setAsignaturas(materias1);


        Carrera carrera2 = new Carrera(2, "Ingeniería de sistemas");

        List<String> materias2 =  new ArrayList<String>();
        materias2.add("Cálculo Multivariable");
        materias2.add("Estructura de datos");
        materias2.add("Redes II");
        materias2.add("Electiva de humanidades");
        carrera2.setAsignaturas(materias2);

        Carrera carrera3 = new Carrera(3, "Ingeniería Ambiental");

        List<String> materias3 =  new ArrayList<String>();
        materias3.add("Matemáticas Básicas");
        materias3.add("Suelos");
        materias3.add("Química");
        materias3.add("Prácticas");
        carrera3.setAsignaturas(materias3);

        Estudiante estudiante1 = new Estudiante("Jorge Mario",18, carrera1);
        Estudiante estudiante2 = new Estudiante("Lina Marcela",22, carrera2);
        Estudiante estudiante3 = new Estudiante("José Luis",20, carrera3);

       Estudiante.imprimir(estudiante1);
       System.out.println();
       Estudiante.imprimir(estudiante2);
       System.out.println();
       Estudiante.imprimir(estudiante3);

    }

}
