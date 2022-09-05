package swing;
import javax.swing.JOptionPane;
import java.util.*;
public class DialogTimer {

	public static void main(String[] args) {
		int time1, time2, milli1, milli2, sec1, sec2, timeDifference;
		final int MILLISECS_IN_SECOND = 1000;
		GregorianCalendar before = new GregorianCalendar();
		milli1 = before.get(GregorianCalendar.MILLISECOND);
		sec1 = before.get(GregorianCalendar.SECOND);
		time1 = MILLISECS_IN_SECOND * sec1 + milli1;
		JOptionPane.showConfirmDialog (null, "Is stealing ever justified? ");
		GregorianCalendar after = new GregorianCalendar();
		milli2 = after.get(GregorianCalendar.MILLISECOND);
		sec2 = after.get(GregorianCalendar.SECOND);
		time2 = MILLISECS_IN_SECOND * sec2 + milli2;
		timeDifference = time2 - time1;
		JOptionPane.showMessageDialog(null, "It took " + timeDifference + " milliseconds for you to answer");
	}

}
