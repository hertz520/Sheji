package Ite;

public class Client {
	public static void display(Television tv) {
		TVIterator i=tv.createIterator();
		System.out.println("���ӻ�Ƶ����");
		while(!i.isLast()) {
			System.out.println(i.currentChannel());
			i.next();
		}
	}
}
