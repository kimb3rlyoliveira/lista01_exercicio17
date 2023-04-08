import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int tamanhometros;
    int quantidadelatas;
    int mistura;
    int quantidadelatasmenor;
    double preco;
    double precomenor;
    double misturapreco;
    int resto;
    int restomenor;

     Scanner teclado = new Scanner(System.in);
    System.out.println("Me informe o tamanho em metros quadrados da área a ser pintada");
    tamanhometros= teclado.nextInt();

    quantidadelatas = tamanhometros / (6 * 18);
    resto = tamanhometros - (6 * 18 * quantidadelatas);
    
    if (resto > 0) {
      quantidadelatas += 1;
                   }
    preco = quantidadelatas * 80;

    quantidadelatasmenor = (int) (tamanhometros / (6 * 3.6));
    restomenor = (int) (tamanhometros - (6 * 3.6 * quantidadelatasmenor));
    
    if (restomenor > 0) {
      quantidadelatasmenor += 1;
                   }
    precomenor = quantidadelatas * 25;

    mistura= quantidadelatas+quantidadelatasmenor;
    misturapreco =((preco + precomenor) * 0.10) + preco + precomenor;


    System.out.println("com latas de 18L é qtd de "+quantidadelatas);
    System.out.println("R$"+preco);
    System.out.println("com latas de 3,6L é qtd de "+quantidadelatasmenor);
    System.out.println("R$"+precomenor);
    System.out.println("mistura de latas "+ mistura);
    System.out.println("R$" + misturapreco);
  }
}