import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// synchronized
		SynchronizedSingleton ss1 = SynchronizedSingleton.getInstance();
		System.out.println("SynchronizedSingleton ss1: ");
		ss1.printTimeCreated();
		
		System.out.println();
		System.out.println("Unesite Broj za nastavak: ");
		input.nextInt();
		System.out.println();
		
		SynchronizedSingleton ss2 = SynchronizedSingleton.getInstance();
		System.out.println("SynchronizedSingleton ss2: ");
		ss2.printTimeCreated();
		
		System.out.println("\n********************************\n");
		
		// eagerly loaded
		EagerlyLoadedSingleton els1 = EagerlyLoadedSingleton.getInstance();
		System.out.println("EagerlyLoadedSingleton els1: ");
		els1.printTimeCreated();
		
		System.out.println();
		System.out.println("Unesite Broj za nastavak: ");
		input.nextInt();
		System.out.println();
		
		EagerlyLoadedSingleton els2 = EagerlyLoadedSingleton.getInstance();
		System.out.println("EagerlyLoadedSingleton els2: ");
		els2.printTimeCreated();
		
		System.out.println("\n********************************\n");
		
		// double checked locking
		DoubleCheckedLockingSingleton dcls1 = DoubleCheckedLockingSingleton.getInstance();
		System.out.println("DoubleCheckedLockingSingleton dcls1: ");
		dcls1.printTimeCreated();
		
		System.out.println();
		System.out.println("Unesite Broj za nastavak: ");
		input.nextInt();
		System.out.println();
		
		DoubleCheckedLockingSingleton dcls2 = DoubleCheckedLockingSingleton.getInstance();
		System.out.println("DoubleCheckedLockingSingleton dcls2: ");
		dcls2.printTimeCreated();
		

	}

}
