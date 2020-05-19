package Vis;

public class Client {
	public static void main(String a[]) {
		IProduct b1=new Book();
		IProduct b2=new Book();
		IProduct a1=new Apple();
		AVisitor visitor;
		
		BuyBaseket basket=new BuyBaseket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		
		visitor=(AVisitor)XMLUtil.getBean();
		
		visitor.setName("уехЩ");
		basket.accept(visitor);
	}
}
