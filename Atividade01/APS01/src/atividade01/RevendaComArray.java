package atividade01;

public class RevendaComArray{
	
	
	private int index = 0;
	private Produto[] produtos;
	
	public RevendaComArray(int qtProd) {
		this.produtos = new Produto[qtProd];
		
	}
	
	public void inserirProduto(Produto prod) {
		if(this.index > produtos.length) {
			System.out.println("Não cabe na lista de produtos!");
			return;
		}
		this.produtos[this.index] = prod; // insere produto
		this.index++;
	}

	public void comprar(int cod, int qtUnd) {
		for(int i = 0; i < this.index; i++) {
			if(produtos[i].getCodProd() == cod) {
				int quant = produtos[i].getQtEstoque();
				produtos[i].setQtEstoque(quant + qtUnd);
				return;
			}
		}
		System.out.println("Produto não encontrado.");
	}
	
	public void vender(int cod, int qtUnd) {
		for(int i = 0; i < this.index; i++) {
			if(produtos[i].getCodProd() == cod) {
				int quant = produtos[i].getQtEstoque();
				if(qtUnd > quant) {
					System.out.println("Estoque insuficiente.");
					return;
				}
				produtos[i].setQtEstoque(quant - qtUnd);
				return;
			}
		}
		System.out.println("Produto não encontrado.");
	}
	
	public void consultaPrecoVenda(int cod) {
		for(int i = 0; i < this.index; i++) {
			if(produtos[i].getCodProd() == cod) {
				double valorVenda = produtos[i].calculaPrecoVenda();
				System.out.println("Valor de venda do produto: R$ " + valorVenda);				
				return;
			}
		}
		System.out.println("Produto não encontrado."); 
	}
	
	public void listaPrecos() {
		for(int i = 0; i < this.index; i++) {
			Produto produtoAtual = produtos[i];
			System.out.println("Código:" + produtoAtual.getCodProd());	
			System.out.println("Decrição:" + produtoAtual.getDescProd());	
			System.out.println("Valor:" + produtoAtual.calculaPrecoVenda());
			System.out.println("-----------------------------------------");	
		}
	}
	
	public Produto encProdCod(int cod) { // encontrar o produto pelo codigo
		for(int i = 0; i <= this.index; i++) {
			if(produtos[i].getCodProd() == cod) {
				return produtos[i];
			}
		}
		System.out.println("Produto não encontrado.");
		return null;
	}
}
