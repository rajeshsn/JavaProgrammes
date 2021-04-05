class Animal
{
	public void move(){
	System.out.println("Animals can move");
	}
}

class Dog extends Animal{
	
	public void move(){
		
		System.out.println("Dog can walk and run");
	}
}
public class Overriding1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a =new Animal();
		Dog b =new Dog();
		
		a.move();
		}

}
