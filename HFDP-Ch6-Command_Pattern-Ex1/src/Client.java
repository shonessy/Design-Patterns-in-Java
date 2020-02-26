
public class Client {

	public static void main(String[] args) {
		// jedan zajednicki invoker
		Invoker invoker = new Invoker();
		
		// jedan zajednicki uvek konkretan reciver
		Light reciver = new Light();
		
		// kontretna komanda
		LightOnCommand lightOnCommand = new LightOnCommand(reciver); 
		invoker.setCommand(lightOnCommand);
		invoker.invokeCommand();
		
		System.out.println("\n***********************************\n");
		
		// konkretna komanda
		LightOffCommand lightOffCommand = new LightOffCommand(reciver);
		invoker.setCommand(lightOffCommand);
		invoker.invokeCommand();

	}

}
