package hw01;
import java.util.ArrayList;
public class Stats5 { 
	public double[] getNnums(Integer n) {
		double[] mylist = new double[n];
		int a=0;
		while(a<n){
			double b=Math.random();
			mylist[a]=b;			
			a=a+1;
		}
		return mylist;
	}
	
	public void printRandomList(double[] alist) {
		int a=0;
		while(a<alist.length) {
			System.out.println(alist[a]);
			a=a+1;
		}
	}
	
	public double findMin(double[] alist) {
		double b=alist[0];
		int a=0;
		while(a<alist.length) {
			double n=alist[a];
			if(n<b) {
				b=n;
			}
			a=a+1;
		}
		return b;
	}
	
	public double findMax(double[] alist) {
		double n=alist[0];
		int a=0;
		while(a<alist.length) {
			if(alist[a]>n) {
				n=alist[a];
			}
			a=a+1;
		}
		return n;
	}
	
	public double findAve(double[] alist) {
		double sum=0;
		int a=0;
		while(a<alist.length) {
			sum=sum+alist[a];
			a=a+1;
		}
		double ave= sum/alist.length;
		return ave;				
	}
			
    public static void main(String[] args) { 
        Stats5 stat=new Stats5() ;
        double[] alist=stat.getNnums(5);
        stat.printRandomList(alist);
        System.out.println("min is"+stat.findMin(alist));
        System.out.println("max is"+stat.findMax(alist));
        System.out.println("average is"+stat.findAve(alist));
        
        
    }
}