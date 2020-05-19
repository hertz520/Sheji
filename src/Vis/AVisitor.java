package Vis;

public abstract class AVisitor {
	protected String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public abstract void Visit(Apple apple);
	
	public abstract void Visit(Book book);
}
