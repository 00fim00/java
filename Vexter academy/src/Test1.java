
import java.util.Scanner;
class Test1 {
	public static void main (String [] args) {
 
		System.out.print ("������� ����� 1, 2 ��� 3: "); 
		Scanner inputFigure = new Scanner (System.in); 
		int i = inputFigure.nextInt (); 
		if ( i==1) { 
			System.out.println ("�� ����� ����� 1");
		}
		else if (i==2) {
			System.out.println ("�� ����� ����� 2");
		}
		else if (i==3) {
			System.out.println ("�� ����� ����� 3");
		}
		else {
			System.out.println ("�� ����� ����� �� ������ 1, 2 ��� 3");
		}
	}
}