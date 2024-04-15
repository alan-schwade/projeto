package Questao1;
public class Principal {
    public static void main(String[] args) {
        Soldado s1 = new Soldado("Krzysztof Nomak", "Krystztof");
                System.out.println("---------------Soldado 1-----------------");
        s1.imprimir();
        Soldado s2 = new Soldado("Arnold Schwarzenegger", "Schwarzenegger");
         System.out.println("---------------Soldado 2-----------------");
        s2.imprimir();
        Soldado s3 = new Soldado("Mario Silva", "Silva");
                System.out.println("---------------Soldado 3-----------------");
        s3.imprimir();
    }

}
