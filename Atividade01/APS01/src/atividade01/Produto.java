package atividade01;

public class Produto {

	private int codProd;
	private String descProd;
	private double valComp;
	private double custo;
	private double margLucro;
	private int qtEstoque;
	
	
	public Produto(int codProd, String descProd) {
		this.codProd = codProd;
		this.descProd = descProd;
	}
	
	public Produto(int codProd, String descProd, double valComp, double custo, double margLucro) {
		this.codProd = codProd;
		this.descProd = descProd;
		this.valComp = valComp;
		this.custo = custo;
		this.margLucro = margLucro;
	}

	public Produto(int codProd, String descProd, double valComp, double custo, double margLucro, int qtEstoque) {
		this.codProd = codProd;
		this.descProd = descProd;
		this.valComp = valComp;
		this.custo = custo;
		this.margLucro = margLucro;
		this.qtEstoque = qtEstoque;
	}
	
	public void compra(int quant) {
		this.qtEstoque = this.qtEstoque + quant;
		
	}
	
	public void venda(int quant) {
			this.qtEstoque = this.qtEstoque - quant;
	}

	public double calculaPrecoVenda() {
		return this.valComp + this.custo + this.margLucro *(this.valComp + this.custo);
	}

	public double getValComp() {
		return valComp;
	}

	public void setValComp(double valComp) {
		this.valComp = valComp;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getMargLucro() {
		return margLucro;
	}

	public void setMargLucro(double margLucro) {
		this.margLucro = margLucro;
	}
	
	public int getCodProd() {
		return codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	
	public String getDescProd() {
		return descProd;
	}

	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}
	
	int getQtEstoque() {
		return qtEstoque;
	}

	void setQtEstoque(int qtEstoque) {
		this.qtEstoque = qtEstoque;
	}

}
