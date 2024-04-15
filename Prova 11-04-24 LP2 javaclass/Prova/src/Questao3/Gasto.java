package Questao3;

public class Gasto {

    private String tipoGasto;
    private String formaPagamento;
    private int data;
    private float valorGasto;

    public Gasto(String tipoGasto, String formaPagamento, int data, float valorGasto) {
        this.tipoGasto = tipoGasto;
        this.formaPagamento = formaPagamento;
        this.data = data;
        this.valorGasto = valorGasto;
    }

    public String getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public float getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(int valorGasto) {
        this.valorGasto = valorGasto;
    }

    void imprimir() {
        System.out.println("Tipo: " + tipoGasto);
        System.out.println("Forma: " + formaPagamento);
        System.out.println("Data: " + data);
        System.out.println("Valor Gasto: " + valorGasto);
    }
}
