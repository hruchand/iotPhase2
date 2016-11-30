package iot;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InsertLockSimulation implements Runnable{
	Thread thread = new Thread(this);
	public InsertLockSimulation(){
		thread.start();
	}
	public void run(){
		while(true)
		{
			
		try{
			
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String time = dateFormat.format(cal.getTime());
		Server.insertLockData(4004, time);
		Thread.sleep(120000); 
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
	}
}
