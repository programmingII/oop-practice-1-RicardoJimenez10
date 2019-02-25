 import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio47FormatoFecha {

	public static void main(String args[]) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nHoy: "+cdt.format(System.currentTimeMillis()));
	}
}
