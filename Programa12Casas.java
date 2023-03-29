import java.util.Scanner;

public class Programa12Casas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variaveis
        String nome;
        int dia, mes, ano;
        String sexo;
        float alt, peso;

        // var processar
        float imc;
        int idade;
        String titulo;
        String signo = "";
        Boolean apto;

        System.out.println("Digite o nome");
        nome = input.next();
        System.out.println("Digite o dia de nascimento");
        dia = input.nextInt();
        System.out.println("Digite o mes de nascimento");
        mes = input.nextInt();
        System.out.println("Digite o ano de nascimento");
        ano = input.nextInt();
        System.out.println("Digite o sexo");
        sexo = input.next();
        System.out.println("Digite a altura");
        alt = input.nextFloat();
        System.out.println("Digite o peso");
        peso = input.nextFloat();

        // processo
        if (sexo.equals("M")){
            titulo = "cavaleiro";
        }else {
            titulo = "amazona";
        }

        idade = 2023 - ano;

        // imc = peso / altura ao quadrado
        imc = (peso) / (alt * alt);

        if (mes == 1){
            if (dia < 21){
                signo = "capricornio";
            }else {
                signo = "aquario";
            }
        } else if (mes == 2){
            if (dia < 19){
                signo = "aquario";
            } else {
                signo = "peixes";
            }
        } else if (mes == 3){
            if (dia < 20){
                signo = "peixes";
            } else {
                signo = "aires";
            }
        } else if (mes == 4){
            if (dia < 20){
                signo = "aires";
            } else {
                signo = "touro";
            }
        } else if (mes == 5){
            if (dia < 20){
                signo = "touro";
            } else {
                signo = "gemeos";
            }
        } else if (mes == 6){
            if (dia < 20){
                signo = "gemeos";
            } else {
                signo = "cancer";
            }
        } else if (mes == 7){
            if (dia < 22){
                signo = "cancer";
            } else {
                signo = "leao";
            }
        } else if (mes == 8){
            if (dia < 22){
                signo = "leao";
            } else {
                signo = "virgem";
            }
        } else if (mes == 9){
            if (dia < 22){
                signo = "virgem";
            } else {
                signo = "libra";
            }
        } else if (mes == 10){
            if (dia < 22){
                signo = "libra";
            } else {
                signo = "escorpiao";
            }
        } else if (mes == 11){
            if (dia < 22){
                signo = "escorpiao";
            } else {
                signo = "sagitario";
            }
        } else if (mes == 12){
            if (dia < 22){
                signo = "sagitario";
            } else {
                signo = "capricornio";
            }
        }

        if (imc >= 18 && imc < 30){
            apto = true;
        }else {
            apto = false;
        }

        System.out.println("Bem vindo " + nome);
        if (apto){
            System.out.println("Parabens, voce passou");
            System.out.println(titulo + " de ouro de " + signo);
        } else {
            System.out.println("Voce nao passou");
        }


    }
}
