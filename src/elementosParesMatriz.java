public class elementosParesMatriz{
    public static void main(String[] args) {
      int[][] matriz = {{2,5,6,3}, {1,4,5,2}};
        System.out.println("Suma de elementos pares: " + sumaElementosPares(matriz, 0, 0));
    }

    public static int sumaElementosPares(int[][]matriz, int fila, int columna){
        int suma=0;
        if(fila < matriz.length ){
            if(columna < matriz[0].length){
                if(matriz[fila][columna]%2==0){
                    suma = matriz[fila][columna] + sumaElementosPares(matriz, fila, columna+1);
                }else{
                    suma= sumaElementosPares(matriz, fila, columna+1);
                }
            }else{
                suma= sumaElementosPares(matriz, fila+1, 0);
            }
        }
        return suma;
    }
}