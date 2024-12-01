package PontosDeAluguel;

import java.util.Date;

public class PontosDeAluguel {
    private String serviços;
    private double valor;
    private Date data;
    public String getServiços() {
        return serviços;
    }
    public void setServiços(String nome) {
        this.serviços = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
}
