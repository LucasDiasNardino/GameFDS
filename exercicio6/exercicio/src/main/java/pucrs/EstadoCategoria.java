package pucrs;

public interface EstadoCategoria {

	static double juros = 0.05;

	public double depositoContaInvestimento(double saldoInvestimnto, double valorDeposito);

	public double depositoContaLivre(double saldoEmConta, double valorDeposito);

	public double retiraContaInvestimento(double valorRetirada, double saldoInvestimnto);

	public double retiraDescoberto(double limite, double valorRetirada, double saldoEmConta);

}
