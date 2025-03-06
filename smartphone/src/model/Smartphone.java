package model;

public class Smartphone implements Ipod, Phone, Browser {

	@Override
	public void playMusic() {
		
		System.out.println("Playing music");
	}

	@Override
	public void selectMusic() {
		System.out.println("Selecting music");
		
	}

	@Override
	public void stopMusic() {
		System.out.println("Stop music");
		
	}

	@Override
	public void displayPage() {
		System.out.println("Show page");
	}

	@Override
	public void newPage() {
		System.out.println("New page");
	}

	@Override
	public void updatePage() {
		System.out.println("Update page");
		
	}

	@Override
	public void call() {
		System.out.println("Calling");
		
	}

	@Override
	public void answerThePhone() {
		System.out.println("answer the call");
	}

	@Override
	public void voiceMail() {
		System.out.println("recording voicemail");	
	} 
}
