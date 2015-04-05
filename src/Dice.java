
// Imports from library.
import java.util.Random;

/**
 * @author ZoneSix  areazone6@gmail.com
 * @date April 3, 2015
 * @version 1.0
 */

public final class Dice {
    
    Random random = new Random();   // Creates a new Random 'random'.
    
    private int score;              // Creates a private integer 'score'
    private boolean enabled;        // Creates a private boolean 'enabled'
    
    public Dice() {}                // Default Constructor
    
    public Dice( int score, boolean enabled ) {     // Constructor
        
        this.setScore(score);
        this.setEnabled(enabled);
        
    }
    
    // Randomize Method
    public void roll() {
        if ( this.enabled ) {
            score = random.nextInt( 6 ) + 1;
        } else {
            score = 0;
        }
    }
    
    // Getters
    public int getScore() {
        return this.score;
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
    
    // Setters
    public void setScore( int score ) {
        this.score = score;
    }
    
    public void setEnabled( boolean enabled ) {
        this.enabled = enabled;
    }
    
    @Override
    public String toString() {
        
        return "Score: " + this.score + ", Enabled: " + this.enabled;
        
    }
    
}