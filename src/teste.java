import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class teste {
 public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nome = new ArrayList<>();

        ArrayList<Integer> idade = new ArrayList<>();

        ArrayList<Double> nota = new ArrayList<>();


        String[] materias = {

                "Matematica",
                "Geografia",
                "ciencia",
                "Historia"
        };

        boolean executando = true;

        while (executando){

        System.out.println("1 - cadastrar aluno");
        System.out.println("2 - listar alunos");
        System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            
        switch  (opcao) {

            case 1:
                System.out.println("cadastrar aluno");

                System.out.println("digite o nome do aluno:");
                
                String nomealuno = scanner.nextLine();
                nome.add(nomealuno);

                System.out.println("digite a idade:");
                
                int idadealuno = scanner.nextInt();
                idade.add(idadealuno);

                System.out.println("digite a nota:");
                
                double notaaluno = scanner.nextDouble();
                nota.add(notaaluno);

                System.out.println("aluno cadrastado com sucesso!");

                break;

            case 2:
                System.out.println("listar alunos");
               for (int i = 0; i < nome.size(); i++ ) {
                   System.out.println("nome:" + nome.get(i));
                   System.out.println("idade:" +idade.get(i));
                   System.out.println("nota:" + nota.get(i));
                   System.out.println("----------------------");
               }
                break;

            case 3:
                executando = false;
                break;

            default:
                System.out.println("opçâo invalida");
            }
        }







    }
}

