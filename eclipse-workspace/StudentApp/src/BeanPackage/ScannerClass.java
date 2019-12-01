package BeanPackage;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(" Scanner class ");
  Scanner sc = new Scanner(System.in);
  System.out.println(" enter age ");
  int age= sc.nextInt();
  System.out.println(" Age is "+age);
  System.out.println(" enter name of the person ");
  Scanner s = new Scanner(System.in);
  String name = s.nextLine();
  System.out.println(" name is "+name);
	}

}
