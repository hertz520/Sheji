import pro.MyFruit;
import pro.MyFruitStore;
//import proxy.CLocalPicShow;
//import proxy.IShowPic;

import java.util.Random;

import Ada.Adapter;
import Ada.InewJuicer;
import DProxy.CLoacalPicShow;
import DProxy.CRemoPic;
import DProxy.IShowPic;
import Dec.Cake;
import Dec.Cream;
import Dec.IBirthdayCake;
import Fly.APiece;
import Fly.PieceFactory;
import chain.AbstractFruitSort;
import chain.BigFruitSorting;
import chain.MidFruitSorting;
import chain.SmallFruitSorting;
import command.Operator;
import command.Order;
import command.OrderCommand;
import command.WaitorInvoker;
import Dec.Fruit;
import pro.Apple;
import pro.Banana;

public class ClientClass {
    public static void main(String[] args){
//    	MyFruit fru1=new Apple();
//    	MyFruit fru2=new Banana();
//    	MyFruitStore mfs1=MyFruitStore.Getfruitstore();
//    	mfs1.Add(1,fru1);
//    	mfs1.Add(2,fru2);
//    	mfs1.Add(3,new Apple());
//    	mfs1.Add(4,new Banana());
//    	MyFruitStore mfs2=MyFruitStore.Getfruitstore();
//    	InewJuicer newJuicer=new Adapter();
//    	System.out.println(newJuicer.newPort(mfs1.Get(3),mfs1.Get(4)));
    	
//    	IBirthdayCake birthdayCake=new Cake();
//    	birthdayCake.Show();
//    	Cream cream=new Cream(birthdayCake);
//    	cream.PutCream();
//    	//cream.Show();
//    	Fruit fruit=new Fruit(cream);
//    	fruit.PutFruit();
//    	fruit.Show();
    	
//    	Random rm=new Random();
//    	PieceFactory pFactory=new PieceFactory();
//    	for(int i=0;i<19;i++)
//    		for(int j=0;j<19;j++) {
//    			APiece p;
//    			if(rm.nextInt()%2==0)
//    				p=pFactory.GetPiece("白旗");
//    			else
//    				p=pFactory.GetPiece("黑旗");
//    			p.Play(rm.nextInt(19), rm.nextInt(19));
//    		}
//    	System.out.println("总共旗子对象个数是："+pFactory.GetPieceCount());
    	
    	
//    	CLocalPicShow cls=new CLocalPicShow();
//    	cls.ShowPic("我的好图片");
//    	IShowPic ipic=new CRemoPic();
//    	IShowPic proxy=(IShowPic) new CLocalPicShow();
//    	proxy.ShowPic("AAA");
    	
//    	IShowPic isp=new CRemoPic();
//    	CLoacalPicShow cpic=new CLoacalPicShow(isp);
//    	IShowPic localPic=(IShowPic)cpic.getProxyInstance();
//    	localpic.ShowPic("AAA");
    	
    	
//    	Order order1=new Order();
//    	order1.setId(1);
//    	order1.setFruitmap("橙子",1);
//    	order1.setFruitmap("梨子",2);
//    	order1.setFruitmap("苹果",3);
//    	
//    	Order order2=new Order();
//    	order2.setId(2);
//    	order2.setFruitmap("香蕉",1);
//    	order2.setFruitmap("葡萄",2);
//    	order2.setFruitmap("西红柿",3);
//    	
//    	Operator op=new Operator();
//    	OrderCommand cmd1=new OrderCommand(op,order1);
//    	OrderCommand cmd2=new OrderCommand(op,order2);
//    	
//    	WaitorInvoker waitor=new WaitorInvoker();
//    	waitor.SetCommand(cmd1);
//    	waitor.SetCommand(cmd2);
//    	waitor.OrderUp();
    	
    	AbstractFruitSort Bfs,Mfs,Sfs;
    	Bfs=new BigFruitSorting(9);
    	Mfs=new MidFruitSorting(5);
    	Sfs=new SmallFruitSorting(2);
    	
    	Bfs.setNextSort(Mfs);
    	Mfs.setNextSort(Sfs);
    	
    	Random rm=new Random();
    	for(int i=0;i<1000;i++) {
    		int weight=rm.nextInt(10);
    		Bfs.sendFruit(weight, "橙子");
    	}
    	Bfs.getFruitBox();
    	Mfs.getFruitBox();
    	Sfs.getFruitBox();
    	
//    	MyFruit fru=(MyFruit)mfs1.Get(3);
//    	fru.Display();
//    	System.out.println("mfs1:"+mfs1.toString());
//    	System.out.println("mfs2:"+mfs2.toString());
//    	MyFruit fru2=fru1;
//    	fru1=Display();
//    	fru2=Display();
//    	System.out.println("fru1:"+fru1.hashCode());
//    	System.out.println("fru2:"+fru2.hashCode());
//        //Factory factor=new BFactory();
//    	Factory factor=(Factory)XMLUtil.getBean();
//        Fruit fruit=factor.CreateFruit();
//
//       // Fruit fruit=factor.CreateFruit("B");
//       // Fruit fruit=(Fruit)XMLUtil.getBean();
//        fruit.eat();
    }
//	private static MyFruit Display() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public String factory(String fruitname){
//        if(fruitname.equals("Apple"))
//            return "Apple";
//        if(fruitname.equals("Banana"))
//            return "Banana";
//        return null;
//    }
}

