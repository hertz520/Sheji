package Vis;

public class Saler extends AVisitor {

	@Override
	public void Visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("收银员"+name+"给苹果计算价格");
	}

	@Override
	public void Visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("收银员"+name+"计算书的价格");
	}

}
