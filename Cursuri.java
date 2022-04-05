package examenFinal;

public class Cursuri {
	int id;
	String tip;
	String nume;
	double pret;

	static int counter = 0;

	public Cursuri() {
		counter++;
		id = counter;
	}

	@Override
	public String toString() {
		return id + " " + tip + " " + nume + " " + pret;
	}
}