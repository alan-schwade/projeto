/*
Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em
uma variável inteira), imprima cada um dos seus dígitos por extenso.
Exemplo:
Entre o número: 4571
Resultado: quatro, cinco, sete, um
 */
package ex002;
import java.util.Scanner;
public class Ex002 {
    public static void main(String[] args) {
        
     System.out.println("Digite um número inteiro (de 0 a 10): ");
     Scanner scanner = new Scanner(System.in);
     int numero = scanner.nextInt();
     scanner.close();
     
        switch (numero){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
                break;
            case 8:
                System.out.println("Oito");
                break;
            case 9:
                System.out.println("Nove");
                break;
            default:
                System.out.println("Numero invalido");
                break;
     }
    }
    
}
