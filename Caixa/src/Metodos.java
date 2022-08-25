import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Metodos {

    Scanner scanner = new Scanner(System.in);

    double saldo = 20000;
    double sacar;
    double depositar;
    String nome = "leonardo";

    public void informacoesDaconta (){
      System.out.println("ColocarSeunome");
      String nome = scanner.next();

      System.out.println("nome de usuario" + nome);
      System.out.println("Banco da caixa\nAgencia: 40028922\nSaldo da conta: 20000");
    }
    

    public void saque (){
System.out.println("Quanto deseja sacar");

sacar = scanner.nextDouble();

if (sacar > saldo) {
System.out.println ("\nSaldo insuficiente");
}
else { System.out.println ("\nVoce sacou RS" + sacar)

}
saldo = saldo - sacar;
 }
 public void deposito() {
  System.out.println("\nQuanto deseja depositar");
  depositar = scanner.nextDouble();
 }

    

 


}
