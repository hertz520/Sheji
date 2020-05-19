package Mem;

public class ClientClass {
	public static void main(String[] args) {
		OriginatorChess chess=
				new OriginatorChess
				(new MementoChess("ºÚ",2,2));
		play(chess);
		chess.SetX(3);
		play(chess);
		chess.SetY(6);
		play(chess);
		Object index = null;
		undo(chess,index);
		undo(chess,index);
		undo(chess,index);
		undo(chess,index);
	}

	private static void play(OriginatorChess chess) {
		// TODO Auto-generated method stub
		
	}

	private static void undo(OriginatorChess chess, Object index) {
		// TODO Auto-generated method stub
		
	}
}
