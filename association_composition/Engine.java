package association_composition;

public class Engine {
	int hp ;
	String type;
	int stokes;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	Engine (int hp, String type,int stokes){
		this.hp= hp;
		this.type=type;
		this.stokes=stokes;
	}
	
	public  void displayEngine() {
		System.out.println("Engine horsepower is : " + hp);
		System.out.println("Engine type is : " + type);
		System.out.println("Engine stokes is : " + stokes  );
		
		
	}

}
