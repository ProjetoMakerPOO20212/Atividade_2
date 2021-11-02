package projeto_grupo_poo_sabado_b_19_atividade_avaliativa_2_version_1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jotape
 */
public class Projeto_GRUPO_POO_Sabado_B_19_Atividade_Avaliativa_2_Version_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Eletrodomestico[] produto = new Eletrodomestico[30];
        int contador = 0;
        int opcao;
        
        //----------------Início Menu Principal---------------------- 
        
        do{
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "clear");
            System.out.println("\n\n\n\n\n\n\n\nDigite de 0~3"); 
            System.out.println("1\tCADASTRAR\tGELADEIRA");
            System.out.println("2\tCADASTRAR\tMICROONDAS");
            System.out.println("3\tIMPRIMIR\tLISTA");
            System.out.println("0\tSAIR\n\n\n\n\n\n>>");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1: //INÍCIO MENU GELADEIRA
                    System.out.println("--------\tMENU GELADEIRA\t--------");
                    System.out.println("1 - Gerar 5 Exemplos");
                    System.out.println("2 - Cadastrar Geladeira");
                    System.out.println(">>");
                    int escolhaGeladeira;
                    escolhaGeladeira = Integer.parseInt(sc.nextLine());
                    switch(escolhaGeladeira){ //Escolha geladeira
                        case 1:
                            produto[contador] = new Eletrodomestico("Brastemp", "BRE57AK", 443, 4269.00);
                            contador++;
                            produto[contador] = new Eletrodomestico("Samsung", "RF49A5202S9/AZ", 470, 9499.00, 88.6, 77.3, false);
                            contador++;
                            produto[contador] = new Eletrodomestico("Panasonic", "NR-BT50BD3X");
                            contador++;
                            produto[contador] = new Eletrodomestico("Eletrolux", 4799.00);
                            contador++;
                            produto[contador] = new Geladeira("LG", "GC-L247SLU",8899.90);
                            contador++;
                        break;
                        case 2:
                            produto[contador] = new Geladeira();
                            produto[contador].entrada();
                            contador++;
                            break;
                        default:
                            System.out.println("Opção Inválida");
                       //Fim do menu geladeira
                            break;
                    }
                case 2: //INÍCIO MENU MICROONDAS
                    System.out.println("1 - Gerar 5 Exemplos");
                    System.out.println("2 - Cadastrar Microondas");
                    System.out.println(">>");
                    int escolhaMicroOndas;
                    escolhaMicroOndas = Integer.parseInt(sc.nextLine());
                    switch(escolhaMicroOndas){//Escolha MicroOndas
                        case 1:
                            produto[contador] = new Eletrodomestico("LG", "MH7093BRA", 30, 790.00);
                            contador++;
                            produto[contador] = new Eletrodomestico("Consul", "Cms45ar", 32, 899.00, 44.7, 54.5, true);
                            contador++;
                            produto[contador] = new Eletrodomestico("Midea", "MTRS41");
                            contador++;
                            produto[contador] = new Eletrodomestico("Panasonic", 699.00);
                            contador++;
                            produto[contador] = new Eletrodomestico("Philco", "PMO26", 579.90);
                            contador++;
                            break;
                        case 2:
                            produto[contador] = new MicroOndas();
                            produto[contador].entrada();
                            contador++;
                            break;
                        default:
                            System.out.println("Opção Inválida");
                        //Fim do menu microondas
                            break;//BREAK CASE 2
                    }
                case 3: //INÍCIO DA CASE LISTA
                    System.out.println("\n\n\n\nLISTA DOS ELETRODOMÉSTICOS:");
                    for(int i = 0; i < contador; i++){
                        produto[i].imprimir();
                        System.out.println("Press Enter to continue...");
                        sc.nextLine();
                    }
                    break;//BREAK CASE 3
                case 0://INICIO DA OPÇÃO SAIR
                    break;//BREAK CASE 0
                default:
                    System.out.println("\n\n\n\nOPÇÃO INVÁLIDA");
                    
            }
            
        }while (opcao != 0);
                
        
        
        
        sc.close();
    }
    
}
