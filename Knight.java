package Chess;

import java.util.ArrayList;

import zen.core.Zen;

public class Knight extends Piece{

	@Override
	public Move[] getMoves() {
		ArrayList <Move> moves = new ArrayList <Move>();
		if (isEmpty(getX() + 1, getY() - 2) || isOpponent(getX() + 1, getY() - 2))
		{
			moves.add(new Move(this, getX() + 1, getY() - 2));
		}
		if (isEmpty(getX() - 1, getY() - 2) || isOpponent(getX() - 1, getY() - 2))
		{
			moves.add(new Move(this, getX() - 1, getY() - 2));
		}
		if (isEmpty(getX() - 2, getY() - 1) || isOpponent(getX() - 2, getY() - 1))
		{
			moves.add(new Move(this, getX() - 2, getY() - 1));
		}
		if (isEmpty(getX() - 2, getY() + 1) || isOpponent(getX() - 2, getY() + 1))
		{
			moves.add(new Move(this, getX() - 2, getY() + 1));
		}
		if (isEmpty(getX() + 2, getY() - 1) || isOpponent(getX() + 2, getY() - 1))
		{
			moves.add(new Move(this, getX() + 2, getY() - 1));
		}
		if (isEmpty(getX() + 2, getY() + 1) || isOpponent(getX() + 2, getY() + 1))
		{
			moves.add(new Move(this, getX() + 2, getY() + 1));
		}
		if (isEmpty(getX() + 1, getY() + 2) || isOpponent(getX() + 1, getY() + 2))
		{
			moves.add(new Move(this, getX() + 1, getY() + 2));
		}
		if (isEmpty(getX() - 1, getY() + 2) || isOpponent(getX() - 1, getY() + 2))
		{
			moves.add(new Move(this, getX() - 1, getY() + 2));
		}
		
		return moves.toArray(new Move[moves.size()]);
		


	}

	@Override
	public void draw() {
        int x = getX() * Board.SCALE, 
            y = getY() * Board.SCALE, 
            s = Board.SCALE;

        Zen.setColor(getColor());
        Zen.fillPolygon(new int[] { 
            x + s / 4, x + s / 2, x + 2 * s / 3, x + s * 2 / 3, x + s * 7 / 12, x + s * 7 / 12, x + s * 2 / 3, 
            x + s * 3 / 4, x + s * 3 / 4, x + s / 4, x + s / 4,
            x + s / 3, x + s / 3, x + s / 2, x + s / 4
        }, new int[] {
            y + s * 3 / 8, y + s / 5, y + s / 3, y + s / 2, y + s * 2 / 3, y + s * 3 / 4, y + s * 4 / 5, 
            y + s * 4 / 5, y + s * 9 / 10, y + s * 9 / 10, y + s * 4 / 5,
            y + s * 4 / 5, y + s * 3 / 5, y + s * 2 / 5, y + s / 2
        });
    }
}
