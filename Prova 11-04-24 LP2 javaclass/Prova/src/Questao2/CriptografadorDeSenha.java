package Questao2;
public class CriptografadorDeSenha {
    private String senhaOriginal;
    private String senhaCriptografada;

    public CriptografadorDeSenha(String senhaOriginal) {
        this.senhaOriginal = senhaOriginal;
    }

    public String getSenhaOriginal() {
        return senhaOriginal;
    }

    public String getSenhaCriptografada() {
        return senhaCriptografada;
    }

    public void setSenhaOriginal(String senhaOriginal) {
        this.senhaOriginal = senhaOriginal;
    }

    public void setSenhaCriptografada(String senhaCriptografada) {
        this.senhaCriptografada = senhaCriptografada;
    }
    StringBuilder Criptografar(){
        StringBuilder criptografado = new StringBuilder();
        for(int i=0; i < senhaOriginal.length(); i++){
            char c =this.senhaOriginal.toLowerCase().charAt(i);
            if (Character.isDigit(c)){
                 criptografado.append("#");
            }else{
             criptografado.append("$");
              }
    }
return criptografado;
        }
    void imprimir(){
        System.out.println("Senha Original: "+senhaOriginal);
        System.out.println("Senha Criptografada"+Criptografar());
    }
    }
