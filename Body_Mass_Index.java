package hw01;

public class Body_Mass_Index {
	private double h;
	private double w;
	public Body_Mass_Index(double height,double weight) {
		this.h=height;
		this.w=weight;
	}
	
	public double geth() {
		return this.h;
	}
	
	public double getw() {
		return this.w;
	}
	
	public void seth(double height) {
		this.h=height;
	}
	
	public void setw(double weight) {
		this.w=weight;
	}
	
	public double BodyMassIndex() {
		double b=this.w/(this.h*this.h);
		return b;
	}
	
	public static void main(String[] args) {
		Body_Mass_Index a = new Body_Mass_Index(1.78,75);
		System.out.println(a.BodyMassIndex());
		
	}
	
}
