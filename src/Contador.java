import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try (terminal) {
            System.out.println("Informe um numero:");
            int parametroUm = terminal.nextInt();
            System.out.println("Informe outro numero:");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException p) {
            System.err.println(p.getMessage());
        }

    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException{

        if(p1>p2){
            throw new ParametrosInvalidosException("O PRIMEIRO VALOR NÃO PODE SER MAIOR QUE O SEGUNDO");
        }

        for(; p1<=p2;p1++){
            System.out.println("Imprimindo o número " + p1);
        }

    }
}

