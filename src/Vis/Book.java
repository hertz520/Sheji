package Vis;

public class Book implements IProduct {

	public void accept(AVisitor visitor) {
		visitor.Visit(this);
	}

}
