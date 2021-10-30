package projeto_grupo_poo_sabado_b_19_atividade_avaliativa_2_version_1;

/**
 *
 * @author caios
 */

public class Projeto_GRUPO_POO_Sabado_B_19_Atividade_Avaliativa_2_Version_1 {
    
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
                case 1: //INICIO MENU GELADEIRA
                    System.out.println("--------\tMENU GELADEIRA\t--------");
                    System.out.println("1 - Gerar 4 Exemplos");
                    System.out.println("2 - Cadastrar Geladeira");
                    System.out.println(">>");
                    int escolhaGeladeira;
                    escolhaGeladeira = Integer.parseInt(sc.nextLine());
                    switch(escolhaGeladeira){ //Escolha geladeira
                        case 1:
                            produto[contador] = new Geladeira("Brastemp", "BRE57AK", 443, 4269,00);
                            contador++;
                            produto[contador] = new Geladeira("Samsung", "RF49A5202S9/AZ", 470, 9499,00);
                            contador++;
                            produto[contador] = new Geladeira("Eletrolux", "DB84X", 598, 5399,00);
                            contador++;
                            produto[contador] = new Geladeira("Panasonic", "NR-BT50BD3X", 435, 2999,00);
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
                    }
                case 2: //INICIO MENU MICROONDAS
                    System.out.println("1 - Gerar 4 Exemplos");
                    System.out.println("2 - Cadastrar Microondas");
                    System.out.println(">>");
                    int escolhaMicroOndas;
                    escolhaMicroOndas = Integer.parseInt(sc.nextLine());
                    switch(escolhaMicroOndas){//Escolha MicroOndas
                        case 1:
                            produto[contador] = new MicroOndas("LG", "MH7093BRA", 30, 790.00, 40, 50, true);
                            contador++;
                            produto[contador] = new MicroOndas("Consul", "Cms45ar", 32, 899.00, 44, 54, true);
                            contador++;
                            produto[contador] = new MicroOndas("Midea", "MTRS41", 31, 699.00, 45, 52, true);
                            contador++;
                            produto[contador] = new MicroOndas("Panasonic", "Nn-st66lbr", 32, 822.83, 43, 52, true);
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
                    }
                case 3: 
                    System.out.println("\n\n\n\nLISTA DOS ELETRODOMÉSTICOS:");
                    for(int i = 0; i < contador; i++){
                        produto[i].imprimir();
                        System.out.println("Press Enter to continue...");
                        sc.nextLine();
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\n\n\n\nOPÇÃO INVÁLIDA");
                    
            }
            
        }while (opcao != 0);
                
        
        
        
        sc.close();
    }
    
}
