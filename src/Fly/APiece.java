package Fly;

public abstract class APiece {
	protected String inKind;
	public APiece(String inkind) {
		this.inKind=inKind;
	}
	
	public abstract void Play(int x,int y);
}
