import java.util.Random;
public class ExemplosVetores {

    public static void main(String[] args) {
        int notas [] = new int[4];
        var gerador = new Random();

        for(int i = 0; i < notas.length; i++){
            notas[i] = gerador.nextInt(11);
        }
        for (int nota : notas){
            System.out.println(nota);
        }
        int total = 0;
        for (int nota : notas) {
            total += nota;
        }
        System.out.println(notas.length == 0 ? "Sem notas" : total / notas.length);
    }
}