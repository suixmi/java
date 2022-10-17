package shape;

import java.util.ArrayList;
import java.util.Scanner;

interface hinh{
	 double dientich();
	 double chuvi();
}
abstract class hinhhoc implements hinh{
	protected String id;
	Scanner sc= new Scanner(System.in);
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public double dientich() {
		return 0;
	}
	@Override
	public double chuvi() {
		return 0;
	}
	void input() {
		System.out.println("enter id hinh hoc: ");
		id=sc.nextLine();
	}
	void output() {
		System.out.println("id: "+id);
	}
	
}
class tron extends hinhhoc{
	private int r;
	final double pi = 3.14;
	Scanner sc= new Scanner(System.in);
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public tron( int r) {
		this.r = r;
	}
	public tron() {
		super();
	}
	void input() {
		super.input();
		System.out.println("enter r: ");
		r= sc.nextInt();
	}
	@Override
	public double dientich() {
		return pi*Math.pow(r, 2);
	}
	@Override
	public double chuvi() {
		return pi*2*r;
	}
	void output() {
		super.output();
		System.out.println("ban kinh: "+r);
		System.out.println("dien tich: "+dientich());
		System.out.println("chu vi: "+chuvi());
		
	}
}
class CN extends hinhhoc{
	private double dai;
	private double rong;
	Scanner sc= new Scanner(System.in);
	public double getDai() {
	
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	public CN() {
		super();
	}
	void input() {
		super.input();
		System.out.println("enter longs :");
		dai=sc.nextDouble();
		System.out.println("enter width :");
		rong=sc.nextDouble();
	}
	@Override
	public double dientich() {
		return dai*rong;
	}
	@Override
	public double chuvi() {
		
		return 2*(dai+rong);
	}
	void output() {
		super.output();
		System.out.println("HINH CHU NHAT");
		System.out.println("chieu dai:"+dai);
		System.out.println("chieu rong:"+rong);
		System.out.println("dien tich: "+dientich());
		System.out.println("chu vi: "+chuvi());
	}
}
class List{
	ArrayList<hinh> h= new ArrayList<>();
	tron t=new tron();
	CN c=new CN();
	Scanner sc= new Scanner(System.in);
	int n;
	void input() {
		int chon;
		System.out.println("nhap so luong hinh: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("hinh tron hay hinh chu nhat(1/0): ");
			chon=sc.nextInt();
			if(chon==1) {
				t.input();
				h.add(t);
			}else if(chon==0) {
				c.input();
				h.add(c);
			}
		}
	}
	void in() {
		for(int i=0;i<h.size();i++) {
			System.out.println("hinh thu "+(i+1));
			h.get(i).output();
		}
	}
	void remove() {
		String tmp;
		System.out.println("----XOA HINH----");
		System.out.println("nhap ma hinh muon xoa: ");
		tmp=sc.nextLine();
		for(int i=0;i<h.size();i++) {
			if(h.get(i).ge)
		}
		
	}
}
public class testhinh {
	public static void main(String[] args) {
		
	}
}
