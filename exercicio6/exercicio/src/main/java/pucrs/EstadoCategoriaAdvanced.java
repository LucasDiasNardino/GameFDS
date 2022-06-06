package pucrs;

public class EstadoCategoriaAdvanced implements EstadoCategoria {

	public double depositoContaInvestimento(double saldoInvestimnto, double valorDeposito) {
		return (valorDeposito * 1.1) + saldoInvestimnto;
	}

	public double retiraDescoberto(double limite, double valorRetirada, double saldoEmConta) {
		if(saldoEmConta >= valorRetirada){
			return saldoEmConta - valorRetirada - (valorRetirada * juros);
		}
		return saldoEmConta;
	}

	public double depositoContaLivre(double saldoEmConta, double valorDeposito) {
		return saldoEmConta + valorDeposito;
	}

	public double retiraContaInvestimento(double valorRetirada, double saldoInvestimnto) {
		if(saldoInvestimnto >= valorRetirada){
			return saldoInvestimnto - valorRetirada - (valorRetirada * juros);
		}
		return saldoInvestimnto;
	}

}
