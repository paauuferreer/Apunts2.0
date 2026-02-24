package OrdenacioICerca;


public class Ordenacio{
    
    public static void bimbolla(int[] dades){
      for (int i =2; i<= dades.length; i++){
          for (int j = 0; j <= dades.length - i; j++) {
           if (dades [j] >  dades[j + 1]) {
               int aux = dades[j];
               dades [j] = dades[j +1];
               dades[j +1] = aux;
               
           }
          }
      }
    }

              
    public static int CercaBinaria(int[]a, int cercat){
        int inici = 0;
        int fi = a.length - 1;
        int mig = -1;
        
        while (inici <= fi){
            mig = (inici + fi) / 2;
            
            if (cercat == a[mig]){
                return mig;
                
            }else if (a[mig] > cercat){
                fi = mig -1;
                
            }else{
                    inici = mig +1;
                    }
        }
        return -1;
    }
    
    public static void quickSort(int[] vector, int esquerra, int dreta) {
    int i = esquerra;
    int j = dreta;
    int pivot = vector[(esquerra + dreta) / 2];

    while (i <= j) {

        while (vector[i] < pivot) {
            i++;
        }

        while (vector[j] > pivot) {
            j--;
        }

        if (i <= j) {
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
            i++;
            j--;
        }
    }

    if (esquerra < j) {
        quickSort(vector, esquerra, j);
    }
    if (i < dreta) {
        quickSort(vector, i, dreta);
    }
}
    
  public static void insertSort(int[] a) {
    for (int i = 1; i < a.length; i++) {
        int index = a[i];
        int j = i - 1;

        while (j >= 0 && a[j] > index) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = index;
    }
}

  public class Cronometre {

    private long inici;
    private long fi;
    private boolean enMarxa;

    
    public Cronometre() {
        inici = 0;
        fi = 0;
        enMarxa = false;
    }

    public void start() {
        if (!enMarxa) {
            inici = System.nanoTime();
            enMarxa = true;
        }
    }

    public void stop() {
        if (enMarxa) {
            fi = System.nanoTime();
            enMarxa = false;
        }
    }

    public long temps() {
        return fi - inici;
    }
}

            
        
        
}
    
    
    
    
    



