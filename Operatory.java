public class Operatory{
	public static void main(String[] args) {
	
	double a, b, c;
	a=1.0;
	b=2.0;
	c=3.0;
	double wyn1 = (a+b)*c;
	double wyn2 = (a-b)/c;
	
	System.out.println("(a+b)*c= "+wyn1);
	System.out.println("(a-b)/c= "+wyn2);
	a++;
	b++;
	c++;
	System.out.println("a= "+a+" b= "+b+" c+ "+c);
	boolean por1 = (a+b)>c;
	boolean por2 = a==b;
	System.out.println("(Czy (a+b)>c)? "+por1);
	System.out.println("(Czy (a==b)? "+por2);
	}
}