import java.util.ArrayList;
import java.util.Scanner;

public class Driver{
    public static void main(String[] arg){
        System.out.println("Digite o valor que deseja tirar a porcentagem");
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        double soma = 0;
        int i = 0;
        ArrayList<Double> porcentagem = new ArrayList<Double>();
        System.out.println("Digite a porcentagem que deseja tirar ");
        System.out.println("O sistema pare se o valor acumulado for maior a 100% ");
        do {
            System.out.println("Digite a porcentagem que queres obter do gasto " + 
                (i + 1) + ":");
            double valor = scan.nextDouble();
            porcentagem.add(valor);
            soma += porcentagem.get(i);
            i++; 
        }while (soma <= 100);
        scan.close();
        if (soma > 100) {
            double somaCumulativo = 0.0;
            for (int j = 0; j < porcentagem.size() - 1; j++) {
            somaCumulativo += porcentagem.get(j);
        }
        porcentagem.set(porcentagem.size() - 1,
        100.0 - somaCumulativo);
    }
    for (double valor : porcentagem){
            double gasto = valor * total / 100.0;
            System.out.println(+ valor + "% igual a " + gasto);
    }

    }

    }