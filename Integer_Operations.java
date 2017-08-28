package hw01;

public class Integer_Operations {
private Integer a;
private Integer b;
//constructor
	public Integer_Operations(Integer num1, Integer num2) {
		a=num1;
		b=num2;
	}
	public void seta(Integer num) {
		this.a=num;
	}
	public void setb(Integer num) {
		this.b=num;
	}
	public Integer geta() {
		return a;
	}
	public Integer getb() {
		return b;
	}
	public int addition() {
		int sum = geta()+getb();
		return sum;
	}

	public int mult() {
		int product = geta() * getb();
		return product;
	}

	public int division() {
		int quotient = geta() / getb();
		return quotient;
	}
	public int remainder() {
		int remainder = geta() % getb();
		return remainder;
	}
	public static void main(String[] args) {
			Integer_Operations h = new Integer_Operations(1,2);
	        Integer sum=h.addition();
	        Integer product=h.mult();
	        Integer quotient=h.division();
	        Integer remainder=h.remainder();
	        		

	        System.out.println("sum is"+ sum);
	        System.out.println("product is" + product);
	        System.out.println("quotient is"+ quotient);
	        System.out.println("remainder is" + remainder);
	    }
	}
