package hw01;

public class WindChill {
	private double t;
	private double v;
	
	public WindChill(double temp,double velocity) {
		this.t=temp;
		this.v=velocity;
	}
	
	public void setT(double temp) {
		this.t=temp;
	}
	
	public void setV(double velocity) {
		this.v=velocity;
	}
	
	public double getT() {
		return this.t;
	}
	
	public double getV() {
		return this.v;
	}
	
	public double getW() {
		double w=35.74 + 0.6215*this.t + (0.4275*this.t - 35.75) * Math.pow(this.v, 0.16);
		return w;
	}
	
    public static void main(String[] args) {
    		WindChill wind= new WindChill(7,8);
   
    		
        //double t = Double.parseDouble(args[0]);
        //double v = Double.parseDouble(args[1]);
        //double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + wind.getT());
        System.out.println("Wind speed  = " + wind.getV());
        System.out.println("Wind chill  = " + wind.getW());
    }

}
