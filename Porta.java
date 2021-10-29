package projeto_grupo_poo_sabado_b_19_atividade_avaliativa_2_version_1;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class Porta {
    
    //-------------------------------Variaveis-------------------------------//
    
    private double comprimento, largura;
    private boolean vidro;
    
    //-------------------------Metodos Construtores-------------------------//
    
    public Porta() {
    }
    
    public Porta(double comprimento, double largura, boolean vidro) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.vidro = vidro;
    }
    
    public Porta(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public Porta(double comprimento) {
        this.comprimento = comprimento;
    }
    
    public Porta(boolean vidro) {
        this.vidro = vidro;
    }
    
    public Porta(double comprimento, boolean vidro) {
        this.comprimento = comprimento;
        this.vidro = vidro;
    }
    
    public Porta(boolean vidro, double largura) {
        this.vidro = vidro;
        this.largura = largura;
    }
    
    public Porta(double comprimento, boolean vidro, double largura) {
        this.comprimento = comprimento;
        this.vidro = vidro;
        this.largura = largura;
    }
    
    public Porta(boolean vidro, double comprimento, double largura) {
        this.vidro = vidro;
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    //---------------------------Setters e Getters---------------------------//
    
    public void setComprimento (double comprimento) {
        this.comprimento = comprimento;
    }
    public void setLargura (double largura) {
        this.largura = largura;
    }
    public void setVidro (boolean vidro) {
        this.vidro = vidro;
    }
    
    public double getComprimento () {
        return comprimento;
    }
    public double getLargura () {
        return largura;
    }
    public boolean getVidro () {
        return vidro;
    }
    
    //------------------------------Aplicacoes------------------------------//
    
    public void imprimir() {
    System.out.println("\n");
    System.out.println("Comprimento: " + getComprimento());
    System.out.println("Largura: " + getLargura());
    System.out.println("Vidro: " + getVidro());
    }
    
    public void entrada() {
    Scanner ent = new Scanner(System.in);
    System.out.println("Comprimento: ");
    setComprimento(Double.parseDouble(ent.nextLine()));
    System.out.println("Largura: ");
    setLargura(Double.parseDouble(ent.nextLine()));
    System.out.println("Vidro: ");
    setVidro(Boolean.parseBoolean(ent.nextLine()));
    }
}