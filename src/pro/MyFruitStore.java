package pro;

import java.util.Hashtable;

public class MyFruitStore {
	private static Hashtable fruittable=null;
	private static MyFruitStore fruitstore=null;
	private MyFruitStore() {
		fruittable=new Hashtable<Integer,MyFruit>();
	}
	public static MyFruitStore Getfruitstore() {
		if(fruitstore==null) {
			fruitstore=new MyFruitStore();
		}
		return fruitstore;
	}
	public void Add(Integer key,MyFruit fruit) {
		fruittable.put(key, fruit);
	}
	public MyFruit Get(Integer key) {
		MyFruit fruit=(MyFruit)fruittable.get(key);
		return (MyFruit)fruit.clone();
	}
}
