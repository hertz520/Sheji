package Meb;

public abstract class AbstractChatroom {
	public abstract void register(Member member);
	public abstract void sendText(String from,String to,String message);
	public abstract void sendTmage(String from,String to,String message);
}
