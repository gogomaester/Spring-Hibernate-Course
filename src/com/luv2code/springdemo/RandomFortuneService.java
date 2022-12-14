package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = new String[3];
		fillFortunes(fortunes);
		int randomNumber = (int) Math.floor((Math.random() * 3));
		return fortunes[randomNumber];
		}
	
	private void fillFortunes(String[] fortunes) {
		fortunes[0] = "Fortune 1 - You will have a great day!.";
		fortunes[1] = "Fortune 2 - You will earn a lot of money!";
		fortunes[2] = "Fortune 3 - You will meet someone new!";				
	}

}
