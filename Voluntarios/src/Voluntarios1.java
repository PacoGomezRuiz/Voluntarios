import java.util.Scanner;
import java.util.Arrays;
public class Voluntarios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double billetes[] = {50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
		int cantBilletes[] = new int[billetes.length];
		double valor=0;
		for(int i=0;i<billetes.length;i++) {
			if(billetes[i]>2) {
				System.out.println("Billetes de "+ (int)billetes[i]+" Euros:");
				cantBilletes[i]=sc.nextInt();
				valor= valor+ cantBilletes[i]*billetes[i];
			}
			if(billetes[i]<5&&billetes[i]>0.5) {
				System.out.println("Monedas de "+ (int)billetes[i]+" Euro/s:");
				cantBilletes[i]=sc.nextInt();
				valor= valor+ cantBilletes[i]*billetes[i];
			}
			if(billetes[i]<1) {
				System.out.println("Monedas de "+ (int)(billetes[i]*100)+" Centimo/s:");
				cantBilletes[i]=sc.nextInt();
				valor= valor+ cantBilletes[i]*billetes[i];
			}
		}
		System.out.println("Tu dinero total es: "+valor+".");
	}

}
