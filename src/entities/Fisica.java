package entities;

public class Fisica extends Pessoa {
	private Double gastosSaude;
	
	public Fisica() {
		super();
	}
	
	public Fisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calculoImposto() {
		double base = 0.0;
		if(getRendaAnual() < 20000.00) {
			if(gastosSaude != 0) {
				base = (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
			}
			else {
				base = (getRendaAnual() * 0.15);
			}
			
		}	
		if (getRendaAnual() >= 20000.00) {
			if(gastosSaude != 0) {
				base = (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
			}
			else {
				base = (getRendaAnual() * 0.25);
			}
			
		}
		
		return base;
		
		
	}

	@Override
	public String toString() {
		return getNome() +":" + "$ " + String.format("%.2f", calculoImposto());
	}
}
	

