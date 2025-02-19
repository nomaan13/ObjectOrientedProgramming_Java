package has_a_composition;

public class Engine {

	int hp;
	int stoke;
	String type;
	
	Engine(){
		
	}
	
	Engine (int hp, int stoke, String type){
		this.hp= hp;
		this.stoke= stoke;
		this.type= type;
		
	}
	
	public void start() {
		System.out.println("This is start method: ");
		
	}
	
	public void displayEngine() {
		System.out.println("The hp is : " + hp);
		System.out.println("The stoke is : " + stoke);
		System.out.println("The engine type is : " + type);
	}

}
