package Ada;

import pro.MyFruit;

public class Adapter implements InewJuicer {
	private OldJuicer oldJuicer;
    public String newPort(MyFruit fruit1, MyFruit fruit2){
    	oldJuicer=new OldJuicer();
    	String str="»ìºÏ¹ûÖ­"+oldJuicer.onePort(fruit1);
    	str+=oldJuicer.onePort(fruit2);
        return str;
    }

}
