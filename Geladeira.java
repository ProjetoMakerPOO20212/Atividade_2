package projeto_grupo_poo_sabado_b_19_atividade_avaliativa_2_version_1;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class Geladeira extends Eletrodomestico {
    
    //-------------------------------Variaveis-------------------------------//
    
    private double temperaturaMinima, temperaturaMaxima;
    private Porta porta2 = new Porta();
    
    //-------------------------Metodos Construtores-------------------------//
    
    public Geladeira() {
    }
    
    public Geladeira(String marca, String modelo, int volume, 
            double preco, double comprimento, double largura, boolean vidro,
            double comprimento2, double largura2, boolean vidro2,
            double temperaturaMinima, double temperaturaMaxima) {
        
        super(marca, modelo, volume, preco, comprimento, largura, vidro);
        porta2.setComprimento(comprimento2);
        porta2.setLargura(largura2);
        porta2.setVidro(vidro2);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
    public Geladeira(String marca, String modelo, double temperaturaMinima, 
            double temperaturaMaxima) {
        super(marca, modelo);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
    public Geladeira(double preco, double temperaturaMinima, 
            double temperaturaMaxima) {
        super(preco);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
    public Geladeira(String marca, double preco, String modelo, 
            double temperaturaMinima, double temperaturaMaxima) {
        super(marca, preco, modelo);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
    public Geladeira(int volume, String modelo, String marca, 
            double temperaturaMaxima) {
        super(volume, modelo, marca);
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
    public Geladeira(String marca, String modelo, double preco, 
            double comprimento, double largura, double temperaturaMinima, 
            double temperaturaMaxima) {
        
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setPreco(preco);
        super.porta1.setComprimento(comprimento);
        super.porta1.setLargura(largura);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
    public Geladeira(String marca, String modelo, double preco,
            double comprimento, double largura, boolean vidro,
            double comprimento2, double largura2, boolean vidro2) {
        
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setPreco(preco);
        super.porta1.setComprimento(comprimento);
        super.porta1.setLargura(largura);
        super.porta1.setVidro(vidro);
        porta2.setComprimento(comprimento2);
        porta2.setLargura(largura2);
        porta2.setVidro(vidro2);
    }
    
    public Geladeira(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }
    
    public Geladeira(String marca, double preco) {
        super(marca, preco);
    }
    
    public Geladeira(String marca, String modelo, int volume, 
            double preco) {
        super(marca, modelo, volume, preco);
    }
    
    public Geladeira(String marca, String modelo, double preco, 
            double temperaturaMinima, double temperaturaMaxima) {
        super(marca, modelo, preco);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
    //---------------------------Setters e Getters---------------------------//
    
    public void setTemperaturaMinima (double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
    public void setTemperaturaMaxima (double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }
    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }
    
    //------------------------------Aplicacoes------------------------------//
    
    public void imprimir() {
    System.out.println("\n");
    super.imprimir();
    porta2.imprimir();
    System.out.println("Temperatura Minima: " + getTemperaturaMinima());
    System.out.println("Temperatura Maxima: " + getTemperaturaMaxima());
    }
    
    public void entrada() {
    Scanner ent = new Scanner(System.in);
    super.entrada();
    porta2.entrada();
    System.out.println("Temperatura Minima: ");
    setTemperaturaMinima(Double.parseDouble(ent.nextLine()));
    System.out.println("Temperatura Maxima: ");
    setTemperaturaMaxima(Double.parseDouble(ent.nextLine()));
    }
}