public class DesafioB {

    public static void main(String[] args){
      String palavra = "Hello Word";
      for (int i = 0; i < palavra.length(); i++){
          char letra = palavra.charAt(i);
          if (letra != ' ') {
              System.out.print(letra + " ");

          }
      }
    }
}
