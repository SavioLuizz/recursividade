import java.util.Scanner;

public class Recursividade01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int nTeste;
        int n1;
        int n2;

        System.out.println("Digite o numero de testes");
        nTeste = leitor.nextInt();


        if (nTeste >= 1 && nTeste <= 3000) {

            for (int i = 0; i < nTeste; i++) {


                System.out.println("Qual o primeiro numero de figurinhas");
                n1 = leitor.nextInt();
                System.out.println("Qual o segundo numero de figurinhas");
                n2 = leitor.nextInt();

                if (n1 >= 1 && n1 <= 1000 && n2 >= 1 && n2 <= 1000) {

                    System.out.println(mdc(n1, n2));

                } else {
                    System.out.println("Numero invalido. ( Tente de 1 a 1000 )");
                }
            }


        } else {

            System.out.println("Numero de testes invalido. ( Tente de 1 a 3000 )");
        }

    }

    public static int mdc(int N1, int N2) {

        if (N2 == 0) {

            return N1;

        } else {

            return mdc(N2, (N1 % N2));

        }
    }

}