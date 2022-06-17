public class busquedaBinariaRecursiva {
    public static void main(String[] args) {
        int v[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int inicio = 0, fin = 9, retorno;
        retorno= busquedaBinaria(v, inicio, fin, 18);
        if(retorno != -1){
            System.out.println("Posicion: " + retorno);
        }else{
            System.out.println("No se encuentró el elemento en el arreglo.");
        }
    }

    public static int busquedaBinaria(int[] ar, int inicio, int fin, int num) {
        int posicion;
        if (fin < inicio) {
            posicion = -1;
        } else {
            posicion = (inicio + fin) / 2;
            if (ar[posicion] > num) {
                posicion = busquedaBinaria(ar, inicio, posicion - 1, num);
            } else if (ar[posicion] < num) {
                posicion = busquedaBinaria(ar, posicion + 1, fin, num);
            }
        }
        return posicion;
    }
}