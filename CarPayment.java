public class CarPayment {
	
	private double CarCost;
	private double InterestRate; 
	private int loanLength; // in months
	private double downPayment;
	private double Principal = CarCost - downPayment;
	private double APR = InterestRate /12;
	
	public CarPayment(double CarCost,double InterestRate, double DownPayment, int loanLength) {
		this.downPayment = DownPayment;
		this.CarCost = CarCost;
		this.loanLength  = loanLength;
		this.InterestRate = InterestRate;
	}
	
	public double MonthlyPayment() {
		return ((this.APR*this.Principal)/ (1- Math.pow((1 + this.APR), this.loanLength)));
	}
	public double interestPaid() {
		return (CarCost - (MonthlyPayment())); 
	}
}
