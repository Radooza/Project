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
		
		super.validMoves.addAll(getValidForwardMoves());
		super.validMoves.addAll(getValidDiagonalMoves());
		return super.validMoves;
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
		Position p = new Position(super.currentPosition.getRow()+1,super.currentPosition.getColumn()-1);//left for white
		logicalMoves.add(p);
		Position p1 = new Position(super.currentPosition.getRow()+1,super.currentPosition.getColumn()+1);//right for white
		logicalMoves.add(p1);
		Position p2 = new Position(super.currentPosition.getRow()-1,super.currentPosition.getColumn()-1);//right for black
		logicalMoves.add(p2);
		Position p3 = new Position(super.currentPosition.getRow()-1,super.currentPosition.getColumn()+1);// left for black
		logicalMoves.add(p3);
		return logicalMoves;
	}

	@Override
	public ArrayList<Position> getValidForwardMoves() {
		ArrayList<Position> logicalMoves =new ArrayList<Position>();
		for(int i=super.currentPosition.getRow()+1;i<8;i++)//for whiteplayer 1 step
		{
			Position p=new Position(i,super.currentPosition.getColumn());
			logicalMoves.add(p);
		}
		for(int i=super.currentPosition.getRow()+2;i<7;i++)//for whiteplayer 2 step
		{
			Position p1=new Position(i,super.currentPosition.getColumn());
			logicalMoves.add(p1);
		}
		for(int i=super.currentPosition.getRow()-1;i>=0;i--)//for balckplayer 1 step
		{
			Position p2=new Position(i,super.currentPosition.getColumn());
			logicalMoves.add(p2);
		}
		for(int i=super.currentPosition.getRow()-2;i>=0;i--)//for balckplayer 2 step
		{
			Position p3=new Position(i,super.currentPosition.getColumn());
			logicalMoves.add(p3);
		}
		return logicalMoves;
	}

}
