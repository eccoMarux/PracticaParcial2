public class repiteLetraPalabra {
  public static void main(String[] args) {
    String palabra = "hola";
    System.out.println(repiteLetraPosicion(palabra, palabra.length()-1));
  }
  public static String repiteLetraPosicion(String palabra, int posicion){
    String cadena="";
    char caracter;
    if(posicion == 0){
      cadena += palabra.charAt(0);
    }else{
      caracter = palabra.charAt(posicion);
      cadena = repiteLetraPosicion(palabra, posicion-1) + repetirCaracter(caracter, posicion+1);
    }
    return cadena;
  }

  public static String repetirCaracter(char caracter, int repeticiones){
    String repetir="";
    if(repeticiones >0){
      repetir = caracter + repetirCaracter(caracter, repeticiones-1);
    }
    return repetir;
  }
}
