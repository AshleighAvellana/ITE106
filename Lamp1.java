public class Lamp1 {
	public String name;
	boolean isOn;
	void turnOn() {
		isOn = true;
		System.out.println(name + "light On? " + isOn);
	}
void turnOff() {
			isOn =false;
			System.out.println(name + "light OFF" + isOn);
		
	}
}