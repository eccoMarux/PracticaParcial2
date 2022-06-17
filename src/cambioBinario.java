public class cambioBinario {
    public static void main(String[] args) {
        System.out.println(cambioBaseBinario(50));
    }

    public static String cambioBaseBinario(int decimal) {
        String binario;
        int numero;
        if (decimal < 2) {
            if (decimal == 1) {
                binario = "1";
            } else {
                binario = "0";
            }
        }else{
            numero = (decimal % 2);
            binario = cambioBaseBinario(decimal/2) + Integer.toString(numero);
        }
        return binario;
    }
}