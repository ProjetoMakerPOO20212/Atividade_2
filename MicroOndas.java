package projeto_grupo_poo_sabado_b_19_atividade_avaliativa_2_version_1;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class MicroOndas extends Eletrodomestico {
    
    //-------------------------------Variaveis-------------------------------//
    
    private double potenciaMinima, potenciaMaxima;
    
    //-------------------------Metodos Construtores-------------------------//
    
    public MicroOndas() {
    }
    
    public MicroOndas(String marca, String modelo, int volume, 
            double preco, double comprimento, double largura, boolean vidro, 
            double potenciaMinima, double potenciaMaxima) {
        
        super(marca, modelo, volume, preco, comprimento, largura, vidro);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }
    
    public MicroOndas(String marca, String modelo, double preco,
            double potenciaMinima, double potenciaMaxima) {
        super(marca, modelo, preco);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }
    
    public MicroOndas(double preco, double potenciaMinima, 
            double potenciaMaxima) {
        super(preco);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }
    
    public MicroOndas(String marca, String modelo, int volume, 
            double preco, double comprimento, double largura, boolean vidro) {
        super(marca, modelo, volume, preco, comprimento, largura, vidro);
    }
    
    public MicroOndas(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public MicroOndas(String marca, String modelo, double preco, 
            double potenciaMaxima) {
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setPreco(preco);
        this.potenciaMaxima = potenciaMaxima;
    }
    
    public MicroOndas(String marca, double preco, double potenciaMinima) {
        super.setMarca(marca);
        super.setPreco(preco);
        this.potenciaMinima = potenciaMinima;
    }
    
    public MicroOndas(double preco, double comprimento, double largura, 
            boolean vidro, double potenciaMaxima) {
        super(preco);
        super.porta1.setComprimento(comprimento);
        super.porta1.setLargura(largura);
        super.porta1.setVidro(vidro);
        this.potenciaMaxima = potenciaMaxima;
    }
    
    public MicroOndas(String marca, double potenciaMinima, double comprimento, 
            double largura) {
        super.setMarca(marca);
        this.potenciaMinima = potenciaMinima;
        super.porta1.setComprimento(comprimento);
        super.porta1.setLargura(largura);
    }
    
    public MicroOndas(String marca, double preco, boolean vidro) {
        super.setMarca(marca);
        super.setPreco(preco);
        super.porta1.setVidro(vidro);
    }
    
    //---------------------------Setters e Getters---------------------------//
    
    public void setPotenciaMinima (double potenciaMinima) {
        this.potenciaMinima = potenciaMinima;
    }
    public void setPotenciaMaxima (double potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }
    
    public double getPotenciaMinima() {
        return potenciaMinima;
    }
    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }
    
    //------------------------------Aplicacoes------------------------------//
    
    public void imprimir() {
    System.out.println("\n");
    super.imprimir();
    System.out.println("Potencia Minima: " + getPotenciaMinima());
    System.out.println("Potencia Maxima: " + getPotenciaMaxima());
    }
    
    public void entrada() {
    Scanner ent = new Scanner(System.in);
    super.entrada();
    System.out.println("Potencia Minima: ");
    setPotenciaMinima(Double.parseDouble(ent.nextLine()));
    System.out.println("Potencia Maxima: ");
    setPotenciaMaxima(Double.parseDouble(ent.nextLine()));
    }
}