
public class Television {
	private int channel;
	private int volume;
	private boolean powerOn;
	
	public Television(int channel, int volume, boolean powerOn){
		this.channel = channel; //channels range from 1 - 120
		this.volume = volume; // volume range from 0 - 10
		this.powerOn = powerOn; // boolean for if the power is on
	}
	
	public void changeChannel(int channel){
		if ((channel > 0) && (channel <= 120)){
			this.channel = channel;
		}
		else{
			System.out.println("Error: Channel must be from 1 - 120");
		}
	}
	
	public void channelUp(){
		if (channel == 120){
			channel = 1;
		}
		else
			channel += 1;
	}
	
	public void channelDown(){
		if (channel == 1){
			channel = 120;
		}
		else
			channel -= 1;
	}
	
	public void volumeUp(){
		if (volume < 10){
			volume += 1;
		}
	}
	
	public void volumeDown(){
		if (volume > 0){
			volume -= 1;
		}
	}
	
	public void turnOn(){
		if (!powerOn){
			powerOn = true;
		}
	}
	
	public void turnOff(){
		if (powerOn){
			powerOn = false;
		}
	}
	
	public void printState(){
		System.out.println("This television is on: " + powerOn);
		if (powerOn) {
			System.out.println("The channel is set to: " + channel);
			System.out.println("The volume is set to: " + volume);
		}
	}
}
