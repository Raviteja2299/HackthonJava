import java.util.Scanner;

public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Radius of the Sphere :- ");
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.printf("%.2f " , explorer.calculateSurfaceArea(input.nextDouble()));
		
		input.close();
	}
}
