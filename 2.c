/*mplemente um programa que leia o nome, a idade e o enderec�o de uma pessoa e
armazene os dados em uma estrutura.*/
struct p{
char nome[50];
int idade;
char end[70];
};
int main (void){
    struct p pe;
printf("Digite o seu nome: ");
scanf(" %s", pe.nome);
printf("Digite a sua idade: ");
scanf("%d", &pe.idade);
printf("Digite o seu endere�o: ");
scanf(" %s", pe.end);
printf("Seu nome: %s\nSua idade: %d\nSeu endere�o: %s", pe.nome, pe.idade, pe.end);
}
