package lambdas;

@FunctionalInterface
public interface Calculo {
	public abstract double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	default String muitoLegal() {
		return "legal";
	}
}
