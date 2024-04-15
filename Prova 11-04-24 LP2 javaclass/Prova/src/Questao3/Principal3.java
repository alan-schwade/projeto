package Questao3;

public class Principal3 {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento("jan");
        Gasto g1 = new Gasto("Roupa", "pix", (int) 5, (float) 47.87);
        Gasto g2 = new Gasto("Remedio", "Cartão", (int) 9, (float) 86.45);
        Gasto g3 = new Gasto("Roupa", "Dinheiro", (int) 25, (float) 75.89);
        orcamento.adicionaGasto(g3);
        orcamento.adicionaGasto(g2);
        orcamento.adicionaGasto(g1);
        orcamento.extratMensal();
                

    }
}
