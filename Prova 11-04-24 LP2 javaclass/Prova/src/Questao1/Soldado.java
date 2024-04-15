package Questao1;
public class Soldado {
        private String nomeCompleto;
    private String nomeDeGuerra;

    public Soldado(String nomeCompleto, String nomeDeGuerra) {
        this.nomeCompleto = nomeCompleto;
        this.nomeDeGuerra = nomeDeGuerra;
    }

    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setNomeDeGuerra(String nomeDeGuerra) {
        this.nomeDeGuerra = nomeDeGuerra;
    }
        int getTamanho() {
        int n = nomeDeGuerra.length();
        return n;
    }
    
   int getQtdConsoantes(){
                    int cons=0;
                    int max=0;
        for (int i = 0; i<this.nomeDeGuerra.length(); i++){
        char c =this.nomeDeGuerra.toLowerCase().charAt(i);
            if (c != 'a' || c!= 'e' || c != 'i' || c != 'o' || c != 'u'){
                   cons++;
              }if(cons>max){
                  cons =max;
              }else{
                  cons=0;
              }
    }
        return cons;
    }
  boolean valido (){
if(this.nomeDeGuerra.length() > 10){
    if (getQtdConsoantes()>3){
        return true;
    }else
 return true;
 }else{
    return false;
} 
    }
 void imprimir(){
     System.out.println("Nome Completo: "+this.nomeDeGuerra);
     System.out.println("Nome de Guerra: "+this.nomeDeGuerra);
     if(valido()){
        System.out.println("Nome de Guerra é valido");
     }else{
        System.out.println("Nome de Guerra não é valido");
}
}
}
