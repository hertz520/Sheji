package Meb;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom{
	private Hashtable members=new Hashtable();
	private String image;
	
	public void register(Member menber) {
		if(!members.contains(members)) {
		}
	}
	public void sendText(String from,String to,String message) {
		Member member=(Member)members.get(to);
		String newMessage=message;
		newMessage=message.replaceAll("´ò", "*");
		member.receiveImage(from,newMessage);
	}
	
	public void sendImage(String from,String to,String message) {
		Member member=(Member)members.get(to);
		if(image.length()>5) {
			System.out.println("Í¼Æ¬Ì«´ó£¬·¢ËÍÊ§°Ü");
		}
		else {
			member.receiveImage(from,image);
		}
	}
	@Override
	public void sendTmage(String from, String to, String message) {
		// TODO Auto-generated method stub
		
	}
}
