public class MyJoinThread extends Thread {
	@Override
	public void run() {
	// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println(" child thread ");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			e.printStackTrace();
			}
		}

}
}
