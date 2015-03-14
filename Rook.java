package Chess;

import java.util.ArrayList;

import zen.core.Zen;

public class Rook extends Piece{

	@Override
	public Move[] getMoves() {
		ArrayList <Move> moves = new ArrayList <Move>();
		
		// To the right
		int x = getX() + 1;
		int y = getY();
		
		while (isValid(x, y))
		{	if (isEmpty(x, y) || isOpponent(x, y))
			{
				moves.add(new Move(this, x, y));
			}
			if (! isEmpty(x , y) || isOpponent(x, y))
			{
				break;
			}
			x = x + 1;
		}
		
		// To the left to the left
		x = getX() - 1;
		y = getY();
		
		while (isValid(x, y))
		{	if (isEmpty(x, y) || isOpponent(x, y))
			{
				moves.add(new Move(this, x, y));
			}
			if (! isEmpty(x , y) || isOpponent(x, y))
			{
				break;
			}
			x = x - 1;
		}
		
		// Moving up
		x = getX();
		y = getY() - 1;
		
		while (isValid(x, y))
		{	if (isEmpty(x, y) || isOpponent(x, y))
			{
				moves.add(new Move(this, x, y));
			}
			if (! isEmpty(x , y) || isOpponent(x, y))
			{
				break;
			}
			y = y - 1;
		}
		
		// Moving down
		
		x = getX();
		y = getY() + 1;
		while (isValid(x, y))
		{	if (isEmpty(x, y) || isOpponent(x, y))
			{
				moves.add(new Move(this, x, y));
			}
			if (! isEmpty(x , y) || isOpponent(x, y))
			{
				break;
			}
			y = y + 1;
		}
		
		return moves.toArray(new Move[moves.size()]);
		
	}

	@Override
	public void draw() {
        int x = getX() * Board.SCALE, 
            y = getY() * Board.SCALE, 
            s = Board.SCALE,
            w = s / 10;

        Zen.setColor(getColor());
        Zen.fillRect(x + s / 5, y + s / 6, w, s / 5);
        Zen.fillRect(x + s / 2 - w / 2, y + s / 6, w, s / 5);
        Zen.fillRect(x + s * 4 / 5 - w, y + s / 6, s / 10, s / 5);
        Zen.fillRect(x + s / 5, y + s / 4, s * 3 / 5, s / 5);
        Zen.fillRect(x + s / 4 + 2, y + s / 4, s / 2 - 4, s * 3 / 5);
        Zen.fillRect(x + s / 5, y + s * 4 / 5, s * 3 / 5, s / 6);
    }

}
