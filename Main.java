package examenFinal;

import java.util.Scanner;

public class Main {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		NumarTotalCursuriThread t = new NumarTotalCursuriThread();
		t.start();

		while (true) {
			System.out.println("MENIU:\n exit\n adauga_curs \n afisare \n afisare_curs_programare \n sterge_curs");
			System.out.print("Introduceti comanda: ");
			String cmd = s.nextLine();

			String[] cuv = cmd.split("\\s+");

			switch (cuv[0].toLowerCase()) {
			case "exit":
				System.out.println("Se inchide aplicatia...");
				return;
			case "adauga_curs":
				Cursuri c = new Cursuri();
				c.tip = cuv[1];
				c.nume = cuv[2];
				c.pret = Double.parseDouble(cuv[3]);
				Institutie.getInstance().adaugaCurs(c);
				System.out.println("A fost adaugat un nou curs!");
				break;
			case "afisare":
				Institutie.getInstance().afiseazaCursuri();
				break;
			case "afisare_curs_programare":
				Institutie.getInstance().afiseazaCursuriProgramare();
				break;
			case "sterge_curs":
				int id = Integer.parseInt(cuv[1]);
				Institutie.getInstance().stergeCurs(id - 1);
				break;
			}
		}
	}
}
