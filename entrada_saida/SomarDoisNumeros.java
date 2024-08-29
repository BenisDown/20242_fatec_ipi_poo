import java.util.Scanner;
public class SomarDoisNumeros{
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int a;
        int b;
        int resultadoDaSoma;
        System.out.println("Digite um valor");
        a = leitor.nextInt();
        System.out.println("Digite outro valor");
        b = leitor.nextInt();
        resultadoDaSoma = a + b;
        System.out.println(resultadoDaSoma);
    }
}