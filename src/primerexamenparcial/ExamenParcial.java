package primerexamenparcial;
import java.util.*;
public class ExamenParcial {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int menu, CA, VD, VU, VUU, VUUF;
		double DA, VL, DPA;
		System.out.println("Bienvenido al sistema de depreciacion de la UNI");
		do{System.out.println("Que metodo desea utilizar?  "
				+ "\n1. Metodo de linea"
				+ "\n2. Metodo de las unidades producidas"
				+ "\n3. Metodo de reduccion de saldo"
				+ "\n4. Metodo de la suma de los digitos por año"); 
		menu=lec.nextInt();}while(menu<1 || menu>4);
		switch(menu) {
		case 1:
			do{System.out.println("Por favor, Digite el valor del activo");
			CA=lec.nextInt();}while(CA<1000 || CA>1000000);
			do{System.out.println("Digite el valor de desecho/residual");
			VD=lec.nextInt();}while(VD<1000 || VD>1000000);
			do{System.out.println("Digite la vida util del activo");
			VU=lec.nextInt();}while(VU<1 || VU>20);
			
			DA=((CA-VD)/VU);
			VL=CA-DA;
			DPA=0;
			System.out.println("Costo del activo: C$"+CA
					+ "\nValor de Desecho/Residual: C$"+VD+""
					+ "\nVida Util: C$"+VU+""
					+ "\nDepresiacion Anual: C$"+DA);
			
			 for(int i=1;i<=VU;i++) {
				DPA=DPA+DA;
				System.out.println(i+". Depreciacion Acumulada="+DPA+" | Valor en libros="+VL);
				VL=VL-DA;
			 }
			
			break;

		}
	}
}
