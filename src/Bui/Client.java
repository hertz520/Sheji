package Bui;

public class Client {

	public static void main(String args[]) {
		MealBuilder mb=(MealBuilder)XMLUtil.Bean();
		KFCWaiter waiter=new KFCWaiter();
		waiter.setMealBuilder(mb);
		Meal meal=waiter.construct();
		
		System.out.println("Ì×²Í×éºÏ£º");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}
}
