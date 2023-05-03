import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {
    
    public static void main(String[] args) {

        ArrayList<String> cpfs = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();

        String cpf, cpf_busca, nome;
        int idade, indice;
        
        int escolha;
        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Escolha a operacao");
            System.out.println("1 - Add aluno");
            System.out.println("2 - Buscar aluno");
            System.out.println("3 - atualizar aluno");
            System.out.println("4 - remover aluno");
            System.out.println("5 - Exibir todos");
            System.out.println("0 - Sair");

            escolha = scan.nextInt();

            if (escolha == 1){
                System.out.println("Digite o cpf do aluno");
                cpf = scan.next();
                System.out.println("Digite o nome do aluno");
                nome = scan.next();
                System.out.println("Digite a idade do aluno");
                idade = scan.nextInt();

                // add no banco
                cpfs.add(cpf);
                nomes.add(nome);
                idades.add(idade);

                System.out.println("Aluno add com sucesso");

            } else if (escolha == 2){
                
                System.out.println("Digite o cpf do aluno");
                cpf = scan.next();

                for (indice = 0; indice < cpfs.size(); indice++){
                    cpf_busca = cpfs.get(indice);

                    if (cpf_busca.equals(cpf)){
                        break;
                    }

                }

                if (indice == cpfs.size()){
                    System.out.println("Aluno n encontrado");
                } else {

                    nome = nomes.get(indice);
                    idade = idades.get(indice);

                    System.out.println("Nome do aluno: "+nome);
                    System.out.println("idade do aluno: "+idade);

                }

            } else if (escolha == 3){
                
                System.out.println("Digite o cpf do aluno");
                cpf = scan.next();

                for (indice = 0; indice < cpfs.size(); indice++){
                    cpf_busca = cpfs.get(indice);

                    if (cpf_busca.equals(cpf)){
                        break;
                    }

                }

                if (indice == cpfs.size()){
                    System.out.println("Aluno n encontrado");
                }else {

                    System.out.println("Digite o novo nome do aluno");
                    nome = scan.next();
                    System.out.println("Digite a nova idade do aluno");
                    idade = scan.nextInt();

                    nomes.set(indice, nome);
                    idades.set(indice, idade);

                    System.out.println("Aluno autalizado com sucesso");
                }
            } else if (escolha == 4){
                
                System.out.println("Digite o cpf do aluno");
                cpf = scan.next();

                for (indice = 0; indice < cpfs.size(); indice++){
                    cpf_busca = cpfs.get(indice);

                    if (cpf_busca.equals(cpf)){
                        break;
                    }

                }

                if (indice == cpfs.size()){
                    System.out.println("Aluno n encontrado");
                }else {

                    cpfs.remove(indice);
                    nomes.remove(indice);
                    idades.remove(indice);

                    System.out.println("Alnuno removido com sucesso");
                }
            } else if (escolha == 5){

                for (indice = 0; indice < cpfs.size(); indice++){

                    System.out.println(cpfs.get(indice));
                    System.out.println(nomes.get(indice));
                    System.out.println(idades.get(indice));
                    System.out.println("------------------------");
                }

            } else if (escolha == 0){
                break;
            } else {
                System.out.println("Escolha incorreta");
            }
        }
        
        scan.close();
    }

}
