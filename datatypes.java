package javatrain;

public class datatypes {
	 int a=10;
     String b="hello";
     char c='w';
     double d=100.000;
     float e = 22.34f;
     long f=100000000L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        datatypes obj = new datatypes();
        obj.printarg();
	}
public void printarg() {
	System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		
	}

}
