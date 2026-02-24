
package utilitats;

/**
 *
 * @author bypau
 */
public abstract class OrdenacioICerca {

    public static void bimbolla(int[] vector) {
        for (int i = 2; i <= vector.length; i++) {
            for (int j = 0; j <= vector.length - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }

    public static void bimbolla(Comparable[] vector) {
        for (int i = 2; i <= vector.length; i++) {
            for (int j = 0; j <= vector.length - i; j++) {
                if (vector[j].compareTo(vector[j + 1]) > 0) {
                    Comparable aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }

    public static void insertSort(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int index = vector[i];
            int j = i - 1;
            while ((j >= 0) && vector[j] > index) {
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = index;
        }
    }

    public static void rapid(int[] vector, int esquerra, int dreta) {
        int i = esquerra;
        int j = dreta;
        int vPivot = vector[(i + j) / 2];
        do {
            while (vector[i] < vPivot) {
                i++;
            }
            while (vector[j] > vPivot) {
                j--;
            }
            if (i <= j) {
                if (i != j) {
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
                i++;
                j--;
            }

        } while (i < j);
        if (esquerra < j) {
            rapid(vector, esquerra, j);
        }
        if (i < dreta) {
            rapid(vector, i, dreta);
        }

    }

    public static void rapid(Comparable[] vector, int esquerra, int dreta) {
        int i = esquerra;
        int j = dreta;
        Comparable vPivot = vector[(i + j) / 2];
        do {
            while (vector[i].compareTo(vPivot) < 0) {
                i++;
            }
            while (vector[j].compareTo(vPivot) > 0) {
                j--;
            }
            if (i <= j) {
                if (i != j) {
                    Comparable aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
                i++;
                j--;
            }

        } while (i < j);
        if (esquerra < j) {
            rapid(vector, esquerra, j);
        }
        if (i < dreta) {
            rapid(vector, i, dreta);
        }

    }

    public static int cercaBinaria(int[] vector, int cercat) {
        int inici = 0;
        int fi = vector.length - 1;
        boolean trobat = false;
        int mid = -1;
        while (!trobat && inici <= fi) {
            mid = (inici + fi) / 2;
            if (vector[mid] == cercat) {
                trobat = true;
            } else if (vector[mid] > cercat) {
                fi = mid - 1;
            } else {
                inici = mid + 1;
            }
        }
        if (!trobat) {
            return -1;
        } else {
            return mid;
        }
    }

    public static int cercaBinaria2(int[] vector, int cercat) {
        int inici = 0;
        int fi = vector.length - 1;
        boolean trobat = false;
        int mid = -1;
        int comptador = 0;
        while (!trobat && inici <= fi) {
            mid = (inici + fi) / 2;
            if (vector[mid] == cercat) {
                trobat = true;
            } else if (vector[mid] > cercat) {
                fi = mid - 1;
            } else {
                inici = mid + 1;
            }
            comptador++;
        }
        System.out.println("Nombre de comparacions: " + comptador);
        if (!trobat) {
            return -1;
        } else {
            return mid;
        }
    }

}

