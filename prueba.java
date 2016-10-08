import java.util.Scanner;
public class prueba{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=0,b=1,c=0,pos;
		System.out.println("ingrese la posición del numero que desea conocer");
		pos=sc.nextLong();
		for(int i=0;i<pos;i++){
			if(c==0){
				System.out.println(a + "\n" + b);
			}
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}