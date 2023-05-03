import java.util.ArrayList;
import java.util.Scanner;

public class CRUD_funcao {

    public static ArrayList<String> cpfs = new ArrayList<>();
    public static ArrayList<String> nomes = new ArrayList<>();
    public static ArrayList<Integer> idades = new ArrayList<>();

    /**
     * codigos
     * 1 - OK
     * 2 - Erro
     * -1 - aluno n encontrado
     * -2 - aluno ja cadastrado
     */

    public static int create (String cpf, String nome, int idade){

        // checagem
        int aluno_existe = read(cpf);

        if (aluno_existe >= 0){
            return -2;
        }

        // add no banco
        cpfs.add(cpf);
        nomes.add(nome);
        idades.add(idade);

        return 1;

    }

    public static int read (String cpf){

        int indice;
        String cpf_busca;


        for (indice = 0; indice < cpfs.size(); indice++){
            cpf_busca = cpfs.get(indice);

            if (cpf_busca.equals(cpf)){
                break;
            }

        }

        if (indice == cpfs.size()){
            return -1;
        }

        return 1;

    }

    public static int update (String cpf, String nome, int idade){

        // busca o indice do aluno
        int indice = read(cpf);

        // checo se o aluno existe
        if (indice < 0){
            return -1;
        }

        // atualizo o aluno
        nomes.set(indice, nome);
        idades.set(indice, idade);

        return 1;
    }

    public static int delete (String cpf){

        int indice = read(cpf);

        if (indice < 0){
            return -1;
        }

        cpfs.remove(indice);
        nomes.remove(indice);
        idades.remove(indice);

        return 1;        
    }
    
    public static void main(String[] args) {

        String cpf, nome;
        int idade, indice;
        
        int escolha, status;
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

                status = create(cpf, nome, idade);

                if (status == 1){
                    System.out.println("Aluno add com sucesso");
                } else {
                    System.out.println("Erro ao add aluno");
                }


            } else if (escolha == 2){
                
                System.out.println("Digite o cpf do aluno");
                cpf = scan.next();

                indice = read(cpf);

                if (indice < 0){
                    System.out.println("Aluno n encontrado");
                } else {

                    nome = nomes.get(indice);
                    idade = idades.get(indice);

                    System.out.println(nome);
                    System.out.println(idade);
                }



            } else if (escolha == 3){
                
                System.out.println("Digite o cpf do aluno");
                cpf = scan.next();

                System.out.println("Digite o novo nome do aluno");
                nome = scan.next();
                System.out.println("Digite a nova idade do aluno");
                idade = scan.nextInt();

                status = update(cpf, nome, idade);

                if (status == 1){
                    System.out.println("Aluno autalizado com sucesso");
                } else {
                    System.out.println("Erro ao atualizar aluno");
                }

                
            } else if (escolha == 4){
                
                System.out.println("Digite o cpf do aluno");
                cpf = scan.next();

                status = delete(cpf);

                if (status == 1){
                    System.out.println("Aluno removido com sucesso");
                } else {
                    System.out.println("Erro ao remover aluno");
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