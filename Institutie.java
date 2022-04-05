package examenFinal;

import java.util.ArrayList;

public class Institutie {
	private ArrayList<Cursuri> cursuri = new ArrayList<>();

	private static Institutie instance;

	private Institutie() {
	}

	public static Institutie getInstance() {
		if (instance == null) {
			instance = new Institutie();
		}
		return instance;
	}

	public void adaugaCurs(Cursuri c) {
		if (cursuri.size() < 30) {
			cursuri.add(c);
		} else
			throw new PreaMulteCursuriException();
	}

	public void afiseazaCursuri() {
		cursuri.forEach(System.out::println);
	}

	public void afiseazaCursuriProgramare() {
		for (Cursuri x : cursuri) {
			if (x.tip.toLowerCase().contains("programare"))
				System.out.println(x);
		}
	}

	public void stergeCurs(int id) {
		cursuri.remove(id);
	}

}
