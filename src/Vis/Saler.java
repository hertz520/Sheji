package Vis;

public class Saler extends AVisitor {

	@Override
	public void Visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("����Ա"+name+"��ƻ������۸�");
	}

	@Override
	public void Visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("����Ա"+name+"������ļ۸�");
	}

}
