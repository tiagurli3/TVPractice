
public class TelevisionTest {
	// creating a program to test the Television class
	public static void main(String[] args){
		Television tv = new Television(1, 5, true);
		tv.printState();
		tv.channelUp();
		tv.channelUp();
		tv.turnOff();
		tv.printState();
		tv.turnOn();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.printState();
	}
}
