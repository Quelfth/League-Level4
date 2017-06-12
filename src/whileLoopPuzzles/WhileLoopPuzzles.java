package whileLoopPuzzles;

public class WhileLoopPuzzles {
	public static final double τ = 6.2831853071795864769252867665590057683943387;
	public static final double e = 2.71828182846;
	public static void main(String[] args){
		int $ex = 0;
		while(Math.pow(2, $ex) < 1000000)
			$ex++;
		System.out.println($ex);
		
		
		
	}
}
