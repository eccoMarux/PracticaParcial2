public class busquedaRecursivaNum {
    public static void main(String[] args) {
        int[] arr = {30, 26, 23, 22, 20, 18, 14, 11, 10, 7, 5, 2};
        System.out.println(busquedaNum(arr, 14, 0));
    }

    public static boolean busquedaNum(int[] arr, int num, int posicion){
        //Busca recursivamente un numero en un arreglo ordenado
        boolean existe=false;
        if(posicion < arr.length){
            if(arr[posicion] == num){
                existe = true;
            }else{
                if(arr[posicion]> num){
                    existe = busquedaNum(arr, num, posicion+1);
                }
            }
        }
        return existe;
    }
}
