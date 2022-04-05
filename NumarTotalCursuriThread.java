package examenFinal;

public class NumarTotalCursuriThread extends Thread {
	@Override
	public void run() {
		try {
			Institutie.getInstance().afiseazaCursuri();
			Thread.sleep(120 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
