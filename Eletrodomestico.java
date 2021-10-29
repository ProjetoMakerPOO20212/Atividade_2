package projeto_grupo_poo_sabado_b_19_atividade_avaliativa_2_version_1;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class Eletrodomestico {
    
    //-------------------------------Variaveis-------------------------------//
    
    private String marca, modelo;
    private int volume;
    private double preco;
    Porta porta1 = new Porta();
    
    //-------------------------Metodos Construtores-------------------------//
    
    public Eletrodomestico() {
    }
    
    public Eletrodomestico(String marca, String modelo, int volume, 
            double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
    }
    
    public Eletrodomestico(String marca, String modelo, int volume, 
            double preco, double comprimento, double largura, boolean vidro) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
        porta1.setComprimento(comprimento);
        porta1.setLargura(largura);
        porta1.setVidro(vidro);
    }
    
    public Eletrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Eletrodomestico(int volume) {
        this.volume = volume;
    }
    
    public Eletrodomestico(double preco) {
        this.preco = preco;
    }
    
    public Eletrodomestico(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }
    
    public Eletrodomestico(int volume, String modelo) {
        this.volume = volume;
        this.modelo = modelo;
    }
    
    public Eletrodomestico(double preco, int volume) {
        this.preco = preco;
        this.volume = volume;
    }
    
    public Eletrodomestico(String marca, double preco, String modelo) {
        this.marca = marca;
        this.preco = preco;
        this.modelo = modelo;
    }
    
    public Eletrodomestico(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public Eletrodomestico(int volume, String modelo, String marca) {
        this.volume = volume;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    //---------------------------Setters e Getters---------------------------//
    
    public void setMarca (String marca) {
        this.marca = marca;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    public void setVolume (int volume) {
        this.volume = volume;
    }
    public void setPreco (double preco) {
        this.preco = preco;
    }
    
    public String getMarca () {
        return marca;
    }
    public String getModelo () {
        return modelo;
    }
    public int getVolume () {
        return volume;
    }
    public double getPreco () {
        return preco;
    }
    
    //------------------------------Aplicacoes------------------------------//
    
    public void imprimir() {
    System.out.println("\n");
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Volume: " + getVolume());
    System.out.println("Preco: " + getPreco());
    porta1.imprimir();
    }
    
    public void entrada() {
    Scanner ent = new Scanner(System.in);
    System.out.println("Marca: ");
    setMarca(ent.nextLine());
    System.out.println("Modelo: ");
    setModelo(ent.nextLine());
    System.out.println("Volume: ");
    setVolume(Integer.parseInt(ent.nextLine()));
    System.out.println("Preço: ");
    setPreco(Double.parseDouble(ent.nextLine()));
    porta1.entrada();
    }
}