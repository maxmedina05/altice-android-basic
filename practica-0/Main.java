class Main {
  public static void main(String[] args) {
    Estudiante[] estudiantes = {
      new Estudiante("Juan", 24),
      new Estudiante("Erika", 20),
      new Estudiante("Emilio", 23),
      new Estudiante("Karina", 21),
      new Estudiante("Eduardo", 24),
      new Estudiante("Tomas", 25)
    };

    System.out.println(String.format("1. Total de estudiantes: %d", estudiantes.length));

    System.out.println(String.format("2. Edad minima: %d", buscarEdadMinima(estudiantes)));

    System.out.println(String.format("3. Edad maxima: %d", buscarEdadMaxima(estudiantes)));

    System.out.println(String.format("4. Edad promedio: %f", buscarEdadPromedio(estudiantes)));

    System.out.println("\n5. Listado de estudiantes: \n");
    ImprimirTodoLosEstudiantes(estudiantes);
  }

  public static int buscarEdadMinima(Estudiante[] estudiantes) {
    int L = estudiantes.length;
    if(L == 0) return -1;

    Estudiante elMenor = estudiantes[0];

    for(int i=0; i < L; i++) {
      Estudiante actual = estudiantes[i];
      if(actual.getEdad() < elMenor.getEdad())
        elMenor = actual;
    }
    return elMenor.getEdad();
  }

  public static int buscarEdadMaxima(Estudiante[] estudiantes) {
    int L = estudiantes.length;
    if(L == 0) return -1;

    Estudiante elMayor = estudiantes[0];

    for(int i=0; i < L; i++) {
      Estudiante actual = estudiantes[i];
      if(actual.getEdad() > elMayor.getEdad())
        elMayor = actual;
    }
    return elMayor.getEdad();
  }

    public static double buscarEdadPromedio(Estudiante[] estudiantes) {
      int L = estudiantes.length;
      double total = 0;

      for(int i=0; i < L; i++) {
        total += estudiantes[i].getEdad();
      }

      double promedio = total / L;
      return promedio;
    }

    public static void ImprimirTodoLosEstudiantes(Estudiante[] estudiantes) {

      for(int i=0; i < estudiantes.length; i++) {
        System.out.println(String.format("%d | %s", i + 1, estudiantes[i]));
      }
    }
}