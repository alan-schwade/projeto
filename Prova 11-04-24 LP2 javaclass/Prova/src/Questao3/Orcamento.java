package Questao3;

import java.util.ArrayList;

public class Orcamento {

    String nomeMes;
    ArrayList<Gasto> allGastos;
    float valorTotal;

    void adicionaGasto(Gasto g) {
        allGastos.add(g);
    }

    public Orcamento(String nomeMes) {
        this.nomeMes = nomeMes;
        this.allGastos=new ArrayList();
    }
   

    float calculaTotal() {
        float soma = 0;
        for (Gasto n : allGastos) {
            soma = soma + n.getValorGasto();
        }
        return soma;
    }

    void extratMensal() {
        System.out.println("Orçamento do mês de " + this.nomeMes);
        System.out.println("Lista de gastos:");
        for (Gasto n : allGastos) {
           n.imprimir();
        }
        System.out.println("-----------------");
        System.out.println("Valor total: " + calculaTotal());
    }
}
