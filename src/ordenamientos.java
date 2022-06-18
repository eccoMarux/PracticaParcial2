public class ordenamientos {
    public static void main(String[] args) {
        int[] arreglo = { 5, 8, 9, 1, 3, 2 };
        insercion(arreglo);
        seleccion(arreglo);
        burbuja(arreglo);
        burbujaMejorada(arreglo);
    }

    public static void insercion(int[] arreglo) {
        int i, j, aux;
        for (i = 1; i < arreglo.length; i++) {
            aux = arreglo[i];
            j = i;
            while (j > 0 && arreglo[j - 1] > aux) {
                arreglo[j] = arreglo[j - 1];
                j = j - 1;
            }
            arreglo[j] = aux;
        }
    }

    public static void seleccion(int[] arreglo) {
        int posicionDelMenor;
        for (int i = 0; i < arreglo.length; i++) {
            posicionDelMenor = buscarMenor(arreglo, i);
            if (arreglo[posicionDelMenor] < arreglo[i]) {
                intercambiar(arreglo, posicionDelMenor, i);
            }
        }
    }

    public static void burbuja(int[] arreglo) {
        int i, j, longitud;
        longitud = arreglo.length;
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < (longitud - i - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    intercambiar(arreglo, j, j + 1);
                }
            }
        }
    }

    public static void burbujaMejorada(int[] arreglo) {
        boolean ordenado = false;
        int i = 0, j, longitudArr;
        longitudArr = arreglo.length;

        while (i < longitudArr - 1 && !ordenado) {
            ordenado = true;
            for (j = 0; j < longitudArr - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    ordenado = false;
                    intercambiar(arreglo, j, j+1);
                }
            }
            i++;
        }
    }

    public static int buscarMenor(int[] arreglo, int i) {
        int menorNum = Integer.MAX_VALUE, posicion = i;
        for (int j = i; j < arreglo.length; j++) {
            if (arreglo[j] < menorNum) {
                menorNum = arreglo[j];
                posicion = j;
            }
        }
        return posicion;
    }

    public static void intercambiar(int[] arreglo, int posicion1, int posicion2) {
        int aux;
        aux = arreglo[posicion2];
        arreglo[posicion2] = arreglo[posicion1];
        arreglo[posicion1] = aux;
    }

}
