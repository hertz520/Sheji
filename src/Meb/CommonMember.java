package Meb;

public class CommonMember extends Member {
	public CommonMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("普通会员发送信息");
		chatroom.sendText(name, to, message);
	}

	public void sendImage(String to, String image) {
		System.out.println("普通会员不能发送图片!");
	}

}
