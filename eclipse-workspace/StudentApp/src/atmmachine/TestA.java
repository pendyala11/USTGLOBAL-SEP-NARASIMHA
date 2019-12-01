package atmmachine;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Machine m = new Machine();
            HDFC hdfc = new HDFC();
            m.slot(hdfc);
            
            ICICI icici = new ICICI();
            m.slot(icici);
            
            
            SBI sbi = new SBI();
            m.slot(sbi);
            
	}

}
