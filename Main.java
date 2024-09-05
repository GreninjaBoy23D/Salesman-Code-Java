/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    Random rand = new Random();
	    int r1 = rand.nextInt(1000);
	    int r2 = rand.nextInt(1000);
	    int r3 = rand.nextInt(1000);
	    int r4 = rand.nextInt(1000);
	    int r5 = rand.nextInt(1000);
	    int r6 = rand.nextInt(1000);
	    int r7 = rand.nextInt(1000);
	    int r8 = rand.nextInt(1000);
	    int r9 = rand.nextInt(1000);
	    int r0 = rand.nextInt(1000);
		Salesman blade = new Salesman("Blade", r1);
		Salesman jenny = new Salesman("Jenny", r2);
		Salesman alfred = new Salesman("Alfred", r3);
		Salesman mary = new Salesman("Mary", r4);
		Salesman jerry = new Salesman("Jerry", r5);
		Salesman wade = new Salesman("Wade", r6);
		Salesman jason = new Salesman("Jason", r7);
		Salesman conner = new Salesman("Conner", r8);
		Salesman hilda = new Salesman("Hilda", r9);
		Salesman celia = new Salesman("Celia", r0);
		Salesman[] top = new Salesman[]{blade, jenny, alfred, mary, jerry, wade, jason, conner, hilda, celia};
		Salesman[] five = Salesman.topFive(top);
		for (int i = 0; i < 5; i++)
		{
		    System.out.println( (i + 1) + " " + five[i].display());
		}
		
	}
}
