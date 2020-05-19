package Vis;

public class Apple implements IProduct {

	public void accept(AVisitor visitor) {
		visitor.Visit(this);
	}

}
