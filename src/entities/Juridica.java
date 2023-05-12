package entities;

public class Juridica extends Pessoa{
	private int numFuncionarios;
	
	public Juridica() {
		
	}
	public Juridica(String nome, Double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	@Override
	public Double calculoImposto() {
		double base = 0.0;
		if(numFuncionarios <= 10) {
				base = getRendaAnual() * 0.16;
		}
		else {
				base = (getRendaAnual() * 0.14);
		}
		return base;
	}
	@Override
	public String toString() {
		return getNome() +":" + "$ " + String.format("%.2f", calculoImposto());
	}
	

}
