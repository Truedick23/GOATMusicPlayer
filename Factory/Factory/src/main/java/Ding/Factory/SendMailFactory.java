package Ding.Factory;

public class SendMailFactory implements Provider{

	public Sender produce() {
		return new MailSender();
	}
}
