

import static org.junit.Assert.*;

import org.junit.Test;

public class TictactoetestTest {

	@Test
	public void leeresBoard() {
		Tictactoe tictactoe = new Tictactoe();
		assertFalse(tictactoe.hasWinner());
	}

	@Test
	public void gueltigeMarkierungGewinner() throws Exception {
		Tictactoe Tictactoe = new Tictactoe();
		Tictactoe.setMark("x", 0, 0);
		Tictactoe.setMark("x", 1, 1);
		Tictactoe.setMark("x", 2, 2);
		assertTrue(Tictactoe.hasWinner());
	}

	@Test
	public void gueltigeMarkierungKeinGewinner() throws Exception {
		Tictactoe Tictactoe = new Tictactoe();
		Tictactoe.setMark("o", 0, 0);
		Tictactoe.setMark("o", 0, 1);
		Tictactoe.setMark("o", 2, 0);
		assertFalse(Tictactoe.hasWinner());
	}

	@Test (expected = MyException.class)
	public void ungueltigeMarkierung() throws Exception {
		Tictactoe Tictactoe = new Tictactoe();
		Tictactoe.setMark("x", 3, 0);
	}

}
