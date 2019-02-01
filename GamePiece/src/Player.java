
public class Player {
    public static void main(String[] args) {
        
    GamePiece scissors, paper, rock, lizard, spock;

    scissors = new GamePiece(Piece.SCISSORS, "Scissors", "Virginia");
    paper = new GamePiece(Piece.PAPER, "Paper", "John Doe");
    lizard = new GamePiece(Piece.LIZARD, "Lizard", "Jane Doe");
    spock = new GamePiece(Piece.SPOCK, "Spock", "JB");
    
    rock = new GamePiece();

    System.out.println(rock);
    System.out.println(paper);
    System.out.println(scissors);
    System.out.println(lizard);
    System.out.println(spock);
    
    System.out.println("\nDoes paper equal paper?\n" + paper.equals(paper));
    System.out.println("\nDoes scissors equal spock?\n" + scissors.equals(spock));
    System.out.println(rock.compareTo(paper));
    
    System.out.println("\nIn this demo, you are Paper\nPAPER vs. LIZARD");
        switch (paper.compareTo(lizard)) {
            case 1:
                System.out.println("You won!");
                break;
            case -1:
                System.out.println("You lost...");
                break;
            default:
                System.out.println("It's a tie!");
                break;
        }
        
    System.out.println("\nIn this demo, " + paper.getPlayerName() + ", you are Paper\nPAPER vs. PAPER:");
        switch (paper.compareTo(paper)) {
            case 1:
                System.out.println("You won!");
                break;
            case -1:
                System.out.println("You lost...");
                break;
            default:
                System.out.println("It's a tie!");
                break;
        }    
        
    System.out.println("\nIn this demo, you are " + spock.getName() + "\nSPOCK vs. SCISSORS:");
        switch (spock.compareTo(scissors)) {
            case 1:
                System.out.println("You won!");
                break;
            case -1:
                System.out.println("You lost...");
                break;
            default:
                System.out.println("It's a tie!");
                break;
        }
    
    }//end main
}//end Player demo