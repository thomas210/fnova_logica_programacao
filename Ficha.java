import java.util.Scanner;

public class Ficha {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variaveis
        String nome;
        int dia;
        int mes;
        int ano;
        float peso;
        float alt;

        // var processadas
        int idade;
        float imc;

        System.out.println("Digite seu nome");
        nome = input.nextLine();

        System.out.println("Digite a dia do nascimento");
        dia = input.nextInt();

        System.out.println("Digite a mes do nascimento");
        mes = input.nextInt();

        System.out.println("Digite o ano do nascimento");
        ano = input.nextInt();

        System.out.println("Digite a sua altura");
        alt = input.nextFloat();

        System.out.println("Digite o seu peso");
        peso = input.nextFloat();

        // processamento
        idade = 2023 - ano;

        // imc = peso / altura ao quadrado
        imc = (peso) / (alt * alt);

        System.out.println("Bem vindo " + nome);
        System.out.println("Sua idade e: " + idade);
        System.out.println("Seu IMC e: " + imc);

        if (imc < 18){
            System.out.println("Voce esta abaixo do peso");
        }else if (imc >= 18 && imc < 30){
            System.out.println("Peso normal");
        }else {
            System.out.println("Sobrepeso");
        }

        input.close();

    }
}
