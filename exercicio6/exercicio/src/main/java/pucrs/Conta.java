package pucrs;

enum Categoria {
	NORMAL, ADVANCED, PREMIUM
};

public class Conta {

	private Long numero;
	private String nomeCorrentista;
	private int saldoLivreInicial;
	private int salAplicacaoInicial;
	private double taxaRemuneracao;
	private double taxaSaldoNegativo;
	private Categoria categoriaInicial;
	private EstadoCategoria estado;

	public static class Builder {
		private Long numero;
		private String nomeCorrentista;
		private int saldoLivreInicial = 0;
		private int salAplicacaoInicial = 0;
		private double taxaRemuneracao = 0;
		private double taxaSaldoNegativo = 0;
		private Categoria categoriaInicial = Categoria.NORMAL;
		private EstadoCategoria estado = new EstadoCategoriaNormal();

		public Builder() {
		}

		public Builder numero(Long numero) {
			this.numero = numero;
			return this;
		}

		public Builder nomeCorrentista(String nome) {
			this.nomeCorrentista = nome;
			return this;
		}

		public Builder saldoLivreIni(int saldo) {
			this.saldoLivreInicial = saldo;
			return this;
		}

		public Builder saldoAplicacaoIni(int saldo) {
			this.salAplicacaoInicial = saldo;
			return this;
		}

		public Builder taxaRemuneracao(Double taxa) {
			this.taxaRemuneracao = taxa;
			return this;
		}

		public Builder taxaSaldoNeg(Double taxa) {
			this.taxaSaldoNegativo = taxa;
			return this;
		}

		public Builder categoriaInicial(Categoria categoria) {
			this.categoriaInicial = categoria;
			return this;
		}

		public Builder estadoConta(EstadoCategoria estado){
			this.estado = estado;
			return this;
		}

		

		public Conta build() {
			return new Conta(this);
		}
	}

	private Conta(Builder builder) {
		this.numero = builder.numero;
		this.nomeCorrentista = builder.nomeCorrentista;
		this.saldoLivreInicial = builder.saldoLivreInicial;
		this.salAplicacaoInicial = builder.salAplicacaoInicial;
		this.taxaRemuneracao = builder.taxaRemuneracao;
		this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
		this.categoriaInicial = builder.categoriaInicial;
		this.estado = builder.estado;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public int getSaldoLivreInicial() {
		return saldoLivreInicial;
	}

	public void setSaldoLivreInicial(int saldoLivreInicial) {
		this.saldoLivreInicial = saldoLivreInicial;
	}

	public int getSalAplicacaoInicial() {
		return salAplicacaoInicial;
	}

	public void setSalAplicacaoInicial(int salAplicacaoInicial) {
		this.salAplicacaoInicial = salAplicacaoInicial;
	}

	public double getTaxaRemuneracao() {
		return taxaRemuneracao;
	}

	public void setTaxaRemuneracao(double taxaRemuneracao) {
		this.taxaRemuneracao = taxaRemuneracao;
	}

	public double getTaxaSaldoNegativo() {
		return taxaSaldoNegativo;
	}

	public void setTaxaSaldoNegativo(double taxaSaldoNegativo) {
		this.taxaSaldoNegativo = taxaSaldoNegativo;
	}

	public Categoria getCategoriaInicial() {
		return categoriaInicial;
	}

	public void setCategoriaInicial(Categoria categoriaInicial) {
		this.categoriaInicial = categoriaInicial;
	}

	public EstadoCategoria getEstadoConta(){
		return estado;
	}
	
	public void setEstadoConta(EstadoCategoria estado){
		this.estado = estado;
	}
}