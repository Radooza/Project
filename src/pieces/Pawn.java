package pieces;

import java.util.ArrayList;

import extra.Position;
import movements.DiagonalMovement;
import movements.ForwardMovement;

public class Pawn extends ChessPiece implements ForwardMovement , DiagonalMovement{

	public Pawn(Position currentPosition, String color) {
		super(currentPosition, color);
	}

	@Override
	public ArrayList<Position> getValidMoves() {
		
		this.validMoves.addAll(getValidForwardMoves());
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
			if(this.currentPosition.getRow()<7&&this.currentPosition.getColumn()>0)
			{
				Position p = new Position(this.currentPosition.getRow()+1,this.currentPosition.getColumn()-1);//left 
				logicalMoves.add(p);
			}
			if(this.currentPosition.getRow()<7&&this.currentPosition.getColumn()<7)
			{
				Position p1 = new Position(this.currentPosition.getRow()+1,this.currentPosition.getColumn()+1);//right
				logicalMoves.add(p1);
			}
		}
		else
		{
			if(this.currentPosition.getRow()>0&&this.currentPosition.getColumn()>0)
			{
				Position p2 = new Position(this.currentPosition.getRow()-1,this.currentPosition.getColumn()-1);//right 
				logicalMoves.add(p2);
			}
			if(this.currentPosition.getRow()>0&&this.currentPosition.getColumn()<7)
			{
				Position p3 = new Position(this.currentPosition.getRow()-1,this.currentPosition.getColumn()+1);// left 
				logicalMoves.add(p3);
			}
		}
		return logicalMoves;
	}

	@Override
	public ArrayList<Position> getValidForwardMoves() {
		ArrayList<Position> logicalMoves =new ArrayList<Position>();
		if(this.color.equals("White"))
		{
			if(this.currentPosition.getRow()<7)
				{
					Position p=new Position(this.currentPosition.getRow()+1,this.currentPosition.getColumn());
					logicalMoves.add(p);
				}
			if(this.currentPosition.getRow()<6)
				{
					Position p1=new Position(this.currentPosition.getRow()+2,this.currentPosition.getColumn());
					logicalMoves.add(p1);
				}
		}
		else 
		{
			if(this.currentPosition.getRow()>0)
			{
				Position p2=new Position(this.currentPosition.getRow()-1,this.currentPosition.getColumn());
				logicalMoves.add(p2);
			}
			if(this.currentPosition.getRow()>1)
			{
				Position p3=new Position(this.currentPosition.getRow()-2,this.currentPosition.getColumn());
				logicalMoves.add(p3);
			}
		}
		return logicalMoves;
	}

}
