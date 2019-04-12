package pieces;

import java.util.ArrayList;

import extra.Position;
import movements.DiagonalMovement;

public class Bishop extends ChessPiece implements DiagonalMovement{

	public Bishop(Position currentPosition, String color) {
		super(currentPosition, color);
	}

	@Override
	public ArrayList<Position> getValidMoves() {
		this.validMoves.addAll(getValidDiagonalMoves());
		return this.validMoves;
	}

	@Override
	public boolean canMove(Position possiblePosition) {
		
		return false;
	}

	@Override
	public void backToCurrentPosition() {
		
		
	}

	@Override
	public void makeMove() {
		
		
	}

	@Override
	public void capture() {
		
		
	}

	@Override
	public void captured() {
		
		
	}

	@Override
	public ArrayList<Position> getValidDiagonalMoves() {
		ArrayList<Position> logicalMoves =new ArrayList<Position>();
		
		if(this.color.equals("White"))
		{
			for(int i=1;i<7;i++)
			{
					if(this.currentPosition.getRow()<7&&this.currentPosition.getColumn()>0)
						{
							Position p = new Position(this.currentPosition.getRow()+i,this.currentPosition.getColumn()-i);//left up 
							logicalMoves.add(p);
						}
					if(this.currentPosition.getRow()<7&&this.currentPosition.getColumn()<7)
						{
							Position p1 = new Position(this.currentPosition.getRow()+i,this.currentPosition.getColumn()+i);//right up
							logicalMoves.add(p1);
						}
					if(this.currentPosition.getRow()>0&&this.currentPosition.getColumn()>0)
						{
							Position p2 = new Position(this.currentPosition.getRow()-i,this.currentPosition.getColumn()-i);//left down
							logicalMoves.add(p2);
						}
					if(this.currentPosition.getRow()>0&&this.currentPosition.getColumn()<7)
						{
							Position p3 = new Position(this.currentPosition.getRow()-i,this.currentPosition.getColumn()+i);//right down
							logicalMoves.add(p3);
						}
			}
		}
		else
		{
			for(int i=1;i<7;i++)
			{
					if(this.currentPosition.getRow()>0&&this.currentPosition.getColumn()>0)
						{
							Position p = new Position(this.currentPosition.getRow()+i,this.currentPosition.getColumn()-i);//right up 
							logicalMoves.add(p);
						}
					if(this.currentPosition.getRow()>0&&this.currentPosition.getColumn()<7)
						{
							Position p1 = new Position(this.currentPosition.getRow()-i,this.currentPosition.getColumn()+i);//left up blnsbaloh
							logicalMoves.add(p1);
						}
					if(this.currentPosition.getRow()<7&&this.currentPosition.getColumn()<7)
						{
							Position p2 = new Position(this.currentPosition.getRow()-i,this.currentPosition.getColumn()-i);//left down
							logicalMoves.add(p2);
						}
					if(this.currentPosition.getRow()<7&&this.currentPosition.getColumn()>0)
						{
							Position p3 = new Position(this.currentPosition.getRow()-i,this.currentPosition.getColumn()+i);//right down
							logicalMoves.add(p3);
						}
			}
		}
		return logicalMoves;
	}

}
