
public abstract class Game {
	
	//template method
	public final void play(){
		this.initalizeGame();
		this.startGame();
		this.endGame();
	}
	
	public abstract void initalizeGame();
	
	public abstract void startGame();
	
	public abstract void endGame();
}
