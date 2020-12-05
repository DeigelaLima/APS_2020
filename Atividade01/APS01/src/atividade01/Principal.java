package atividade01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a quantidade de produtos para criar uma revenda: ");
            int qtProd = scanner.nextInt();

            RevendaComArray revenda = new RevendaComArray(qtProd);

            int option = -1;
            while (option != 0) {

                System.out.println("====================MENU=======================");
    			System.out.println("1: Cria uma lista de produtos");
    			System.out.println("2: Comprar produto");
    			System.out.println("3: Vender produto"); 
    			System.out.println("4: Consultar preço do produto"); 
    			System.out.println("5: Listar produtos");
    			System.out.println("6: Alterar informações de um produto");
    			System.out.println("7: Sair"); 
    			System.out.println("==============================================");
    			

                System.out.print("Escolha uma opção: ");
                option = scanner.nextInt();

                int codProd;
                String descProd;
                double valComp;
                double custo;
                double margLucro;
                int qtEstoque;

                if (option == 1){
                	System.out.println("----------------------------------------------");
                    System.out.println("  Digite as informações para criar o produto  ");
                	System.out.println("----------------------------------------------");

                    System.out.print("Digite o código do Produto: ");
                    codProd = scanner.nextInt();
                    System.out.print("Digite a descrição do Produto: ");
                    descProd = scanner.next();
                    System.out.print("Digite o valor da compra: ");
                    valComp = scanner.nextDouble();
                    System.out.print("Digite o custo do produto: ");
                    custo = scanner.nextDouble();
                    System.out.print("Digite a margem de lucro do produto: ");
                    margLucro = scanner.nextDouble();
                    System.out.print("Digite a quantidade inicial em estoque: ");
                    qtEstoque = scanner.nextInt();
                    Produto produto = new Produto(codProd, descProd, valComp, custo, margLucro, qtProd);
                    revenda.inserirProduto(produto);
                    System.out.println("    |Produto criado!|    ");
                }else if (option == 2){
                	System.out.println("------------------------------------------------");
                    System.out.println(" Digite as informações para comprar um produto  ");
                    System.out.println("------------------------------------------------");
                    System.out.print("Código do Produto: ");
                    codProd = scanner.nextInt();
                    System.out.print("Quantidade do produto que desejada comprar: ");
                    qtEstoque = scanner.nextInt();
                    revenda.comprar(codProd, qtProd);
                    System.out.println("   |Produto comprado!|   ");
                }else if (option == 3) {
                	System.out.println("------------------------------------------------");
                    System.out.println(" Digite as informações para vender um produto   ");
                    System.out.println("------------------------------------------------");
                    System.out.print("Código do Produto: ");
                    codProd = scanner.nextInt();
                    System.out.print("Quantidade do produto que desejada vender: ");
                    qtEstoque = scanner.nextInt();
                    revenda.vender(codProd, qtProd);
                    System.out.println("   |Produto vendido!|   ");
                }else if (option == 4) {
                	System.out.println("----------------------------------------------------------");
                    System.out.println(" Digite as informações para consultar o preço do produto  ");
                    System.out.println("----------------------------------------------------------");
                    System.out.print("Código do Produto: ");
                    codProd = scanner.nextInt();
                    revenda.consultaPrecoVenda(codProd);
                }else if (option == 5){
                    revenda.listaPrecos();
                }else if (option == 6){
                    System.out.print("Digite o código do produto escolhido: ");
                    codProd = scanner.nextInt();
                    System.out.println("\n");
                    Produto produto1 = revenda.encProdCod(codProd);
                    System.out.println("Qual informação você deseja alterar do produto?");
                    System.out.println("[1] - Valor de compra");
                    System.out.println("[2] - Custo do produto");
                    System.out.println("[3] - Margem de lucro do produto");
              
                    int option1 = scanner.nextInt();

                    switch (option1) {
                        case 1:
                            System.out.print("Digite o novo valor de compra: ");
                            double valComp1 = scanner.nextDouble();
                            produto1.setValComp(valComp1);
                            System.out.print("Valor de compra alterado para: " + valComp1 + "\n\n");
                            break;
                        case 2:
                            System.out.print("Digite o novo custo do produto: ");
                            double custo1 = scanner.nextDouble();
                            produto1.setCusto(custo1);
                            System.out.print("Custo alterado para: " + custo1 + "\n\n");
                            break;
                        case 3:
                            System.out.print("Digite a nova margem de lucro: ");
                            double margLucro1 = scanner.nextDouble();
                            produto1.setMargLucro(margLucro1);
                            System.out.print("Margem de lucro alterada para: " + margLucro1 + "\n\n");
                            break;
                    }
                }
            }
            scanner.close();
            System.out.println("## Loja fechada ## \n");
        } catch (Exception e) {
            System.out.println("Erro interno!");
        }
    }
}