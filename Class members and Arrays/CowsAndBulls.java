
public class CowsAndBulls {
	// Constants
	public final static int NUM_DIGITS = 4;
	public final static int MAX_VALUE = 9876;
	public final static int MIN_VALUE = 1234;
	public final static int MAX_GUESSES = 10; 
	private int guessesMade = 0; 
	private NumberPicker obj; 
	private int SecretNumber;
	
	// Constructors
	public CowsAndBulls(int seed){
	// Create a CowsAndBulls game using the given randomisation seed value to generate
	// a mystery number of NUM_DIGITS length, and that gives the player MAX_GUESSES guesses.
	obj = new NumberPicker(seed, MIN_VALUE, MAX_VALUE);
	SecretNumber = obj.nextInt();
	}
	
	public int guessesRemaining(){
	// Obtain the number of guesses remaining.
		return MAX_GUESSES - guessesMade;
	}
	
	public Result guess(int guessNumber){
	// Evaluates a guess that the mystery number is guessNumber, returning the outcome in the form
	// of a Result object. Decrements guesses remaining.
	// Assumes that game is not over.
		int Cows = NumberUtils.countIntersect(guessNumber, SecretNumber);
		int Bulls = NumberUtils.countMatch(guessNumber, SecretNumber);
		Result resultObj = new Result(Cows, Bulls);
		guessesMade ++;
		return resultObj;
	}
	
	public int giveUp(){
	// End the game, returning the secretNumber.
		return SecretNumber; 
	}
	
	public boolean gameOver(){
	// Returns true if (i) the secret number has been guessed, or (ii) there are no more guesses.
	if (guessesMade == MAX_GUESSES)
		return true;
	return false; 
	}
} 
