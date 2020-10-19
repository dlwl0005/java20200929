package chap08.textbook.s080303;

import chap08.textbook.s080201.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{

	private int Volume;

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
		}else{
			this.Volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.Volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

}
