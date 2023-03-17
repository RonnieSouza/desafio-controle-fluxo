import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o Primeiro Numero: ");
        int parametro1 = scanner.nextInt();

        System.out.print("Insira o Segundo Numero: ");
        int parametro2 = scanner.nextInt();


        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Primeiro numero informado deve ser menor que o Segundo numero.");
        }


    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {

        int cont = numeroDois - numeroUm;
        if (numeroDois < numeroUm) {
            throw new ParametrosInvalidosException();
        } else {
            for (int contador = 0; contador < cont; contador++) {
                System.out.println("Imprimindo numero: " + (contador+1));
            }

        }
    }

}
