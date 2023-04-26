import java.util.Scanner;

public class Banco {
    
    public static void main(String[] args) {
        
        String[] nomes = new String[3];
        int[] idades = new int[3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            
            System.out.println("Digite o nome do ususario "+i);
            nomes[i] = scan.next();

            System.out.println("Digite a idade do usuario "+i);
            idades[i] = scan.nextInt();

        }

        // for (int i = 0; i < nomes.length; i++){
        //     System.out.println(nomes[i]);
        //     System.out.println(idades[i]);
        // }

        int indice;
        while(true){
            System.out.println("Digite o indice que quer analisar");
            indice = scan.nextInt();
            if (indice == 9){
                break;
            }
            System.out.println(nomes[indice]);
            System.out.println(idades[indice]);

        }

        scan.close();


    }
}
