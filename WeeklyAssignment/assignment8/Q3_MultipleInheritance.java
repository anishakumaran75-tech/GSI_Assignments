package assignment8;

interface Camera
{
	void takePhoto();
}
interface MusicPlayer
{
	void playMusic();
}
interface SmartFeatures 
{
    void connectToWifi();
}

class SmartPhone implements Camera,MusicPlayer,SmartFeatures 
{
	
	public void takePhoto()
	{
		System.out.println("Photo captured successfully");
	}

	
	public void connectToWifi()
	{
		System.out.println("Connected to WiFi");
	}

	
	public void playMusic() {
		System.out.println("Playing music...");
		
	}
}

public class Q3_MultipleInheritance {
	public static void main(String[] args) {
		SmartPhone phone=new SmartPhone();
		phone.takePhoto();
		phone.playMusic();
		phone.connectToWifi();
	}
	
}
