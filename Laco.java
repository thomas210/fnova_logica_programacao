import java.util.Scanner;

public class Laco {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int atual = 0;

        System.out.println("Digite a quantidade de repeticoes");
        int repeticoes = input.nextInt();

        for (int i = 0; i < repeticoes; i++){
            System.out.println("Digite o numero");
            atual = input.nextInt();
            total = total + atual;
        }

        System.out.println(total);
        System.out.println(total / repeticoes);

        input.close();
    }
}
