package oops_abstraction_interface;

public class SUV implements Car{
	@Override
	public void start() {
		System.out.println("Start the SUV!!");
	}
	@Override
	public void	drive() {
		System.out.println("Drive the SUV...........");
	}
	@Override
	public void stop() {
		System.out.println("Stop the SUV!!!!!!!");
	}
	@Override
	public void openGate() {
		System.out.println("Open gate of SUV!");
	}
	@Override
	public void playSong(){
		System.out.println("Play song in SUV|||||||");
	}

}
