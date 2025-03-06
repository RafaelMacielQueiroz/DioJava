package application;

import model.Ipod;
import model.Smartphone;

public abstract class Main implements Ipod {

	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone();
		
		System.out.println("iPod function");
		smartphone.playMusic();
		smartphone.selectMusic();
		smartphone.stopMusic();
		
		System.out.println();
		System.out.println("Phone function");
		smartphone.displayPage();
		smartphone.newPage();
		smartphone.updatePage();
		
		System.out.println();
		System.out.println("Web browser");
		smartphone.call();
		smartphone.answerThePhone();
		smartphone.voiceMail();

	}

}
