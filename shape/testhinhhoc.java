package shape;
import java.util.*;
interface hinhhoc{
	double dientich();
	double chuvi();
}
abstract class hinh implements hinhhoc{
	private String code ;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double dientich() {
        return 0;
    }

    @Override
    public double chuvi() {
        return 0;
    }

     public void input(){
         System.out.print("- Enter Code : ");
         Scanner sc = new Scanner(System.in);
         code = sc.nextLine();
     }

    public void display(){
        System.out.println("\t - Code : "+ this.code);
    }
}
class circle extends hinh{
	 Scanner scanner = new Scanner(System.in);
	    public final double pi = 3.14f;
	    private String code;
	    private double r;
		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public double getRadius() {
	        return r;
	    }

	    public void setRadius(double radius) {
	        this.r = radius;
	    }

	    @Override
	    public double dientich() {
	        return pi * Math.pow(r, 2);
	    }

	    @Override
	    public double chuvi() {
	        return 2 * pi * r;
	    }

	    public void input() {
	        super.input();
	        System.out.print("- Enter Radius : ");
	        this.r = scanner.nextDouble();
	        scanner.nextLine();
	    }

	    public void display() {
	        super.display();
	        System.out.println("\t - Radius : " + this.r);
	    }
}
class Rectangle extends hinh {

    Scanner scanner = new Scanner(System.in);

    private double longs;
    private double width;


    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double dientich() {
        return this.longs * this.width;
    }

    @Override
    public double chuvi() {
        return (this.longs + this.width) / 2;
    }

    public void input() {
        super.input();
        System.out.print("- Enter Longs : ");
        this.longs = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("- Enter Width : ");
        this.width = scanner.nextDouble();
        scanner.nextLine();
    }

    public void display(){
        super.display();
        System.out.println("\t - Longs : " + this.longs);
        System.out.println("\t - Width : " + this.width);
    }
}
class Listhinh {
	 Scanner sc = new Scanner(System.in);
	    ArrayList<hinh> h = new ArrayList<>();
	    int n;
	    boolean check = true;
	    void input() {
	        System.out.print("- Enter Number Figure : ");
	        n = sc.nextInt();
	        sc.nextLine();
	        for (int i = 0; i < n; i++) {
	            System.out.print("\t Rectangle(R) or circle(C) : ");
	            String choose = sc.nextLine();
	            if (choose.equals("R") || choose.equals("r")) {
	                Rectangle rec = new Rectangle();
	                rec.input();
	                h.add(rec);
	            } else if (choose.equals("C") || choose.equals("t")) {
	                circle c = new circle();
	                c.input();
	                h.add(c);
	            }
	        }
	    }
	    void display() {
	    	System.out.println("\nList of Figure");
	    	 for (int i = 0; i < n; i++) {
	    		 h.get(i).display();
	    	 }
	    }
	    void remove() {
	        display();
	        System.out.println("\nRemove Figure");
	        System.out.print("- Enter CodeFigure Remove : ");
	        String chooseCode = sc.nextLine();
	        for (int i = 0; i < h.size(); i++) {
	            if (chooseCode.equals(h.get(i).getCode())) {
	                h.remove(i);
	                display();
	                break;
	            } else {
	                check = false;
	            }
	        }
	        if (check == false) {
	            System.out.println("Not Found");
	        }
	    }

	    void find() {
	        System.out.println("\nFind Figure");
	        System.out.print("- Enter CodeFigure Find : ");
	        String chooseCode = sc.nextLine();
	        for (int i = 0; i < h.size(); i++) {
	            if (chooseCode.equals(h.get(i).getCode())) {
	                hinh tam = h.get(i);
	                tam.display();
	            } else {
	                check = false;
	            }
	        }
	        if (check == false) {
	            System.out.println("Not Found");
	        }
	    }

	    void sortByArea() {
	        System.out.println("\nSort Figure By Area");
	        for (int i = 0; i < h.size() + 1; i++) {
	            for(int j = i+1 ;j <h.size();j++){
	                if(h.get(i).dientich()<h.get(j).dientich()){
	                    hinh tmp = h.get(i);
	                    h.set(i,h.get(j));
	                    h.set(j,tmp);
	              
	                }
	            }
	        }
	        display();
	    }

	    void sortByPerimeter() {
	        System.out.println("\nSort Figure By Perimeter");
	        for (int i = 0; i < h.size() + 1; i++) {
	            for(int j = i+1 ;j <h.size();j++){
	                if(h.get(i).dientich()<h.get(j).chuvi()){
	                    hinh tmp = h.get(i);
	                    h.set(i,h.get(j));
	                    h.set(j,tmp);
	                }
	            }
	        }
	        display();
	    }
}
public class list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Listhinh l = new Listhinh();
	    l.input();
	    l.display();
	    l.remove();
	    l.find();
	    l.sortByArea();
	    l.sortByPerimeter();
	}
	
    
}
