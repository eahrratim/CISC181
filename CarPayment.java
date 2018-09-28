
import java.lang.Math;

public class CarPayment {
	
	private double CarCost;
	private double InterestRate; 
	private double loanLength; // in months
	private double downPayment;
	
	
	public CarPayment(double Carcost,double interestRate, double DownPayment, double loanlength) {
		downPayment = DownPayment;
		CarCost = Carcost;
		loanLength  = loanlength;
		InterestRate = interestRate/100;
		
	}
	
	public double MonthlyPayment() {
		double r = Math.pow((1 + (InterestRate/12)), loanLength);
		return ((CarCost - downPayment)*(r * (InterestRate/12))/(r-1));
	}
	public double interestPaid() {
		return ((MonthlyPayment()*loanLength - CarCost - downPayment)); 
	}
}
