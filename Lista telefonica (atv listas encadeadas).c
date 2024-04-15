#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

typedef struct {
    int dia;
    int mes;
} Data;

typedef struct {
    char nome[40];
    char telefone[15];
    char email[40];
    Data dataAniversario;
} Contato;

typedef struct Lista {
    Contato info;
    struct Lista* prox;
} Lista;

Lista* cria_agenda() {
    return NULL;
}

void insere_contato(Lista** agenda, Contato novo_contato) {
    Lista* novo_elemento = (Lista*)malloc(sizeof(Lista));
    novo_elemento->info = novo_contato;
    novo_elemento->prox = NULL;

    if (*agenda == NULL) {
        *agenda = novo_elemento;
        return;
    }

    Lista* atual = *agenda;
    Lista* anterior = NULL;

    while (atual != NULL && strcmp(novo_contato.nome, atual->info.nome) > 0) {
        anterior = atual;
        atual = atual->prox;
    }

    if (anterior == NULL) {
        novo_elemento->prox = *agenda;
        *agenda = novo_elemento;
    } else {
        anterior->prox = novo_elemento;
        novo_elemento->prox = atual;
    }
}

void lista_contatos(Lista* agenda) {
    Lista* atual = agenda;
    while (atual != NULL) {
        printf("Nome: %s\n", atual->info.nome);
        printf("Telefone/Celular: %s\n", atual->info.telefone);
        printf("Email: %s\n", atual->info.email);
        printf("Data de Aniversario: %d/%d\n", atual->info.dataAniversario.dia, atual->info.dataAniversario.mes);
        printf("\n");
        atual = atual->prox;
    }
}

Lista* busca_contato(Lista* agenda, char* nome) {
    Lista* atual = agenda;
    while (atual != NULL) {
        if (strcmp(nome, atual->info.nome) == 0) {
            return atual;
        }
        atual = atual->prox;
    }
    return NULL;
}

void remove_contato(Lista** agenda, char* nome) {
    Lista* atual = *agenda;
    Lista* anterior = NULL;

    while (atual != NULL && strcmp(nome, atual->info.nome) != 0) {
        anterior = atual;
        atual = atual->prox;
    }

    if (atual == NULL) {
        printf("Contato nao encontrado.\n");
        return;
    }

    if (anterior == NULL) {
        *agenda = atual->prox;
    } else {
        anterior->prox = atual->prox;
    }

    free(atual);
}

void atualiza_contato(Lista* agenda, char* nome) {
    Lista* contato = busca_contato(agenda, nome);

    if (contato == NULL) {
        printf("Contato nao encontrado.\n");
        return;
    }

    printf("Novo Nome: ");
    scanf("%s", contato->info.nome);
    printf("Novo Telefone/Celular: ");
    scanf("%s", contato->info.telefone);
    printf("Novo Email: ");
    scanf("%s", contato->info.email);
    printf("Nova Data de Aniversario (dia mes): ");
    scanf("%d %d", &contato->info.dataAniversario.dia, &contato->info.dataAniversario.mes);
}

void remove_duplicados(Lista** agenda) {
    Lista* atual = *agenda;
    Lista* anterior = NULL;
    Lista* temp = NULL;

    while (atual != NULL) {
        temp = atual->prox;
        anterior = atual;
        while (temp != NULL) {
            if (strcmp(atual->info.nome, temp->info.nome) == 0) {
                anterior->prox = temp->prox;
                free(temp);
                temp = anterior->prox;
            } else {
                anterior = temp;
                temp = temp->prox;
            }
        }
        atual = atual->prox;
    }
}

void libera_agenda(Lista** agenda) {
    Lista* atual = *agenda;
    Lista* temp = NULL;
    while (atual != NULL) {
        temp = atual->prox;
        free(atual);
        atual = temp;
    }
    *agenda = NULL;
}

int main() {
    setlocale(LC_ALL, "Portuguese");iu
    Lista* agenda = cria_agenda();
    int opcao;
    char nome[40];

    do {
        printf("\nMenu:\n");
        printf("1 - Inserir Contato\n");
        printf("2 - Listar Contatos\n");
        printf("3 - Buscar Contato\n");
        printf("4 - Editar Contato\n");
        printf("5 - Remover Contato\n");
        printf("6 - Remover Contatos Duplicados\n");
        printf("7 - Sair\n");
        printf("Escolha uma opcao: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1: {
                Contato novo_contato;
                printf("Nome: ");
                scanf("%40[^/n]s", novo_contato.nome);
                fflush(stdin);
                printf("Telefone/Celular: ");
                scanf("%40[^/n]s", novo_contato.telefone);
                fflush(stdin);
                printf("Email: ");
                scanf("%40[^/n]s", novo_contato.email);
                fflush(stdin);
                printf("Data de Aniversario (dia mes): ");
                scanf("%d %d", &novo_contato.dataAniversario.dia, &novo_contato.dataAniversario.mes);
                insere_contato(&agenda, novo_contato);
                break;
            }
            case 2:
                lista_contatos(agenda);
                break;
            case 3:
                printf("Nome do Contato: ");
                scanf("%40[^/n]s", nome);
                fflush(stdin);
                if (busca_contato(agenda, nome) != NULL) {
                    printf("Contato encontrado!\n");
                } else {
                    printf("Contato nao encontrado.\n");
                }
                break;
            case 4:
                printf("Nome do Contato: ");
                scanf("%40[^/n]s", nome);
                fflush(stdin);
                atualiza_contato(agenda, nome);
                break;
            case 5:
                printf("Nome do Contato: ");
                scanf("%40[^/n]s", nome);
                fflush(stdin);
                remove_contato(&agenda, nome);
                break;
            case 6:
                remove_duplicados(&agenda);
                printf("Contatos duplicados removidos.\n");
                break;
            case 7:
                libera_agenda(&agenda);
                break;
            default:
                printf("Opcao invalida.\n");
        }
    } while (opcao != 7);

    return 0;
}
