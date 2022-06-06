package pucrs;

public class EstadoCategoriaPremium implements EstadoCategoria {

	public double depositoContaInvestimento(double saldoInvestimnto, double valorDeposito) {
		return valorDeposito + saldoInvestimnto;
	}

	public double retiraDescoberto(double limite, double valorRetirada, double saldoEmConta) {
		
		if(saldoEmConta >= valorRetirada){
			if(valorRetirada <= limite * 0.25){
				return saldoEmConta - valorRetirada; 
			}
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
