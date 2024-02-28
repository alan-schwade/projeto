/*1)Faça um programa que, a partir de uma string digitada pelo usuário, imprima:
a) O número de caracteres da string.
b) A string com todas suas letras em maiúsculo.
c) O número de vogais da string.
d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).
e) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).
f) O número de dígitos (0 a 9) da string.
g) Se a string é um palíndromo ou não. */

package com.mycompany.ex001;
public class Ex001 {

    public static void main(String[] args) {
        int digitos=0, v=0;
        System.out.println("Digite alguma palavra: ");
        String inputString = new java.util.Scanner(System.in).nextLine();
        System.out.println("Você digitou: " + inputString);
        System.out.println("Número de caracteres: " + inputString.length());
        System.out.println("Toda em maiúsculo: " + inputString.toUpperCase());
        for(int i = 0 ; i < inputString.length(); i++){
            char c = inputString.toLowerCase().charAt(i);
            if (c == 'a' || c== 'e' || c == 'i' || c == 'o' || c == 'u'){
            v++;
            } else if(Character.isDigit(c)){
            digitos++;
            }
        }
        System.out.printf("Vogais: %d\n", v);
        System.out.printf("Possui %d digitos\n", digitos);
        if (inputString.toLowerCase().startsWith("uni")){
            System.out.println("Essa String tem 'UNI' no começo!");
        } else{
            System.out.println("Essa String não possui 'UNI' no começo!");
        }
        if (inputString.toLowerCase().endsWith("rio")){
        System.out.println("Essa String tem 'RIO' no final!");
        } else {
        System.out.println("Essa String não possui 'RIO' no final!");
        }
    boolean palindromo = true;
    for (int i = 0; i < inputString.length()/2; i++){
     if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)){
        palindromo = false;
        break;
     }
    }
    if (palindromo){
        System.out.println("String é um palindromo");
    }else {
        System.out.println("String não é um palindromo");
    }
    }
}
