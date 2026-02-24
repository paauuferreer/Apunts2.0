public class habitacions {

  // Atributs

  private String nom;
  private int places;
  private int planta;
  boolean ocupada;

  // Constructor

  public habitacions() {
    nom = "";
    places = 0;
    planta = 0;
    ocupada = false;
  };

  public habitacions(String nom, int places, int planta, boolean ocupada) {
    this.nom = nom;
    this.places = places;
    this.planta = planta;
    this.ocupada = ocupada;
  }

  public static void inicialitzarHotel(String[] noms, int[] plantes, int[] places, boolean[] ocupades) {
    for (int i = 0; i < noms.length; i++) {
      noms[i] = "Hab-" + (char) ('A' + i);
      places[i] = (int) (Math.random() * 4) + 1;
      plantes[i] = (int) (Math.random() * 10) + 1;
      ocupades[i] = Math.random() < 0.5;
    }
  }

  public static void mostrarHotel(String[] noms, int[] plantes, int[] places, boolean[] ocupades) {
    IO.println();
    IO.println("Mostrar hotels");
    for (int i = 0; i < noms.length; i++) {
      String estat;
      if (ocupades[i] == true) {
        estat = "Ocupada";
      } else {
        estat = "Lliure";
      }
      ;
      IO.println("Nom: " + noms[i] + " | Places: " + places[i] + " | Planta: " + plantes[i] + " | Estat: " + estat);
    }
  }

  public static void mostrarHabitacionsPlanta(int plantaCercada, String[] noms, int[] plantes, int[] places,
      boolean[] ocupades) {
    IO.println();
    IO.println("Mostrar habitacions cercades");
    boolean trobat = false;
    for (int i = 0; i < noms.length; i++) {
      if (plantes[i] == plantaCercada) {
        IO.println("- " + noms[i]);
        trobat = true;
      }
    }
    if (!trobat) {
      IO.println("No hi ha habitacions a la planta " + plantaCercada);
    }
    ;
  }

  public static void comptarIIdentificarPerPlaces(int numPlaces, String[] noms, int[] plantes, int[] places,
      boolean[] ocupades) {
    IO.println();
    IO.println("Habitacions per places");
    int contador = 0;
    String llista = "";
    for (int i = 0; i < noms.length; i++) {
      if (places[i] == numPlaces) {
        contador++;
        llista += noms[i] + " ";
      }
    }
    IO.println("Hi ha " + contador + " habitacions de " + numPlaces + " places.");
    IO.println("Son: " + llista);
  }

  public static void mostrarBuidesPerPlaces(int numPlaces, String[] noms, int[] plantes, int[] places,
      boolean[] ocupades) {
    IO.println();
    IO.println("Habitacions buides per places");
    boolean hiHaBuides = false;
    for (int i = 0; i < noms.length; i++) {
      if (places[i] == numPlaces && !ocupades[i]) {
        IO.println("Lliure: " + noms[i] + " (Planta " + plantes[i] + ")");
        hiHaBuides = true;
      }
    }
    if (!hiHaBuides) {
      IO.println("AVÍS: No queda cap habitacio lliure de " + numPlaces + " places.");
    }
  }

  public static void sumaHabitacions(int[] places) {
    int suma = 0;
    for (int i = 0; i < places.length; i++) {
      suma += places[i];
    }
    IO.println();
    IO.println("Suma total de places a l'hotel: " + suma);
  }

  // Metodes

  public String getNom() {
    return nom;
  }

  public int getPlaces() {
    return places;
  }

  public int getPlanta() {
    return planta;
  }

  public boolean isOcupada() {
    return ocupada;
  }

  // Getters. Recupera el valor dels aributs

  @Override
  public String toString() {
    return "Habitacions [nom=" + nom + ", places=" + places + ", planta=" + planta + ", ocupada=" + ocupada + "]";
  }

}
