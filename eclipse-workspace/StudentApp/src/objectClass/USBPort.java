package objectClass;

public class USBPort {

	public static void connect(Object  ob) {
		if(ob instanceof Mouse)
		{
			Mouse m =(Mouse) ob;
			m.click();
			m.scroll();
		}
		else if(ob instanceof Pendrive)
		{
			Pendrive p = (Pendrive) ob;
			p.read();
			p.write();
		}
		else
		{
			System.out.println(" disp ");
		}
	}

}
