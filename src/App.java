import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número : ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("O número informado foi: "+num);
    }
}