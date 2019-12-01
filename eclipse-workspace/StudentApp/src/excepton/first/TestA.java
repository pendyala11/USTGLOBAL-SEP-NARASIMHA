package excepton.first;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" Main Started ");
int[] a = {10,20,30,40};


System.out.println(" main ended ");
try
{
	System.out.println(a[2]);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(" index is not present ");
}

	}

}
