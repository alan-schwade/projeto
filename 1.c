/*Escreva um trecho de codigo para fazer a criac¸ ´ ao dos novos tipos de dados conforme ˜
solicitado abaixo:
• Horario: composto de hora, minutos e segundos. ´
• Data: composto de dia, mes e ano. ˆ
• Compromisso: composto de uma data, horario e texto que descreve o compromisso.*/
#include <stdio.h>
#include <locale.h>
#include <string.h>
struct horario{
int hora;
int min;
int seg;
};
struct data{
int dia;
char mes[20];
int ano;
};
int main (void){
setlocale(LC_ALL, "Portuguese");
char txt[100];
struct horario horarioc;
struct data datac;
    printf("Insira um breve texto sobre o seu compromisso: \n");
    scanf(" %s", txt);
    printf("Digite o dia do seu compromisso: ");
    scanf("%d", &datac.dia);
    printf("Digite o mes do seu compromisso: ");
    scanf("%d", &datac.mes);
    printf("Digite o ano do seu compromisso: ");
    scanf("%d", &datac.ano);
    printf("Digite a hora do seu compromisso: ");
    scanf("%d", &horarioc.hora);
printf("Digite o minuto do seu compromisso: ");
    scanf("%d", &horarioc.min);
    printf("Digite o Segundo do seu compromisso: ");
    scanf("%d", &horarioc.seg);
}
