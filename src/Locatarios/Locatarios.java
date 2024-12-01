package Locatarios;

public class Locatarios {
   private String nome;
   private String ponto;
   
@Override
public String toString() {
    return "Locatarios [nome=" + nome + ", ponto=" + ponto + "]";
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getPonto() {
    return ponto;
}
public void setPonto(String ponto) {
    this.ponto = ponto;
}
   
}
