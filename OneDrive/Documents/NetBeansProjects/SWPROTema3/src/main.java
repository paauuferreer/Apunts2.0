public class main {
  public static void main() {
        String[] noms = new String[20];
        int[] places = new int[20];
        int[] plantes = new int[20];
        boolean[] ocupades = new boolean[20];
        habitacions.inicialitzarHotel(noms, plantes, places, ocupades);
        habitacions.mostrarHotel(noms, plantes, places, ocupades);
        habitacions.mostrarHabitacionsPlanta(2, noms, plantes, places, ocupades);
        habitacions.comptarIIdentificarPerPlaces(3, noms, plantes, places, ocupades);
        habitacions.mostrarBuidesPerPlaces(2, noms, plantes, places, ocupades);
      habitacions.sumaHabitacions(places);
  }
}
