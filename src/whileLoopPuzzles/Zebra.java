package whileLoopPuzzles;

public class Zebra {
	static int $ = 0;
	public static void main(String[] args){
		while(inc$())
			if($%2==0)
				System.out.println("Black");
			else
				System.out.println("White");
	}
	
	public static boolean inc$(){
		$++;
		return true;
	}
	
}
