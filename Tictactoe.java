

public class Tictactoe {

	public String[][] feld;

	public Tictactoe() {
		feld = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				feld[i][j] = "";
			}
		}
	}

	public void setMark(String mark, int x, int y) throws MyException {
		if (x < 0 || x > 2 || y < 0 || y > 2) {
			throw new MyException("Koordinaten ungueltig");
		}

		if (feld[x][y].equalsIgnoreCase("")) {
			feld[x][y] = mark;
		}

	}

	public boolean hasWinner() {
		if (feld[0][0].contentEquals("x") && feld[0][1].contentEquals("x") && feld[0][2].contentEquals("x")
				|| feld[0][0].contentEquals("o") && feld[0][1].contentEquals("o") && feld[0][2].contentEquals("o")) {
			return true;
		} else if (feld[0][0].contentEquals("x") && feld[1][1].contentEquals("x") && feld[2][2].contentEquals("x")
				|| feld[0][0].contentEquals("o") && feld[1][1].contentEquals("o") && feld[2][2].contentEquals("o")) {
			return true;
		} else if (feld[0][0].contentEquals("x") && feld[1][0].contentEquals("x") && feld[2][0].contentEquals("x")
				|| feld[0][0].contentEquals("o") && feld[1][0].contentEquals("o") && feld[2][0].contentEquals("o")) {
			return true;
		} else if (feld[2][0].contentEquals("x") && feld[2][1].contentEquals("x") && feld[2][2].contentEquals("x")
				|| feld[2][0].contentEquals("o") && feld[2][1].contentEquals("o") && feld[2][2].contentEquals("o")) {
			return true;
		} else if (feld[1][0].contentEquals("x") && feld[1][1].contentEquals("x") && feld[1][2].contentEquals("x")
				|| feld[1][0].contentEquals("o") && feld[1][1].contentEquals("o") && feld[1][2].contentEquals("o")) {
			return true;
		} else if (feld[0][2].contentEquals("x") && feld[1][1].contentEquals("x") && feld[2][0].contentEquals("x")
				|| feld[0][2].contentEquals("o") && feld[1][1].contentEquals("o") && feld[2][0].contentEquals("o")) {
			return true;
		} else if (feld[1][0].contentEquals("x") && feld[1][1].contentEquals("x") && feld[1][2].contentEquals("x")
				|| feld[1][0].contentEquals("o") && feld[1][1].contentEquals("o") && feld[1][2].contentEquals("o")) {
			return true;
		} else if (feld[2][0].contentEquals("x") && feld[2][1].contentEquals("x") && feld[2][2].contentEquals("x")
				|| feld[2][0].contentEquals("o") && feld[2][1].contentEquals("o") && feld[2][2].contentEquals("o")) {
			return true;
		} else {
			return false;
		}

	}

}

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}