
enum Piece
{ 
    ROCK, PAPER, SCISSORS, LIZARD, SPOCK;
}

public class GamePiece implements Comparable<GamePiece> {

    private String playerName;
    private String name;
    
    private Piece classification;

    GamePiece() {
       this.classification = Piece.ROCK;
       this.name = "Rock";
       this.playerName = "John Doe";
    }//end default ctr
    
    GamePiece(Piece classification, String name, String playerName) {
        this.classification = classification;
        this.name = name;
        this.playerName = playerName;
    }//end ctr
    
    public void setName(String name) {
        this.name = name;
    }//end setName
        
    public String getName() {
        return name;
    }//end getName
    
    public void setClassification(Piece classification) {
        this.classification = classification;
    }
    
    public Piece getClassification() {
        return classification;
    }
    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
 
    public String getPlayerName() {
        return playerName;
    }
    
    @Override
    public String toString() {
        String result = "";
        
        if(null != classification) //if I'm a rock, return the rock's statement
        switch (classification) {
            case ROCK:
                result = "I’m hard and have sharp edges.";
                break;
            case PAPER:
                result = "I’m made of trees and can cover a rock easily.. and disprove Spock!";
                break;
            case SCISSORS:
                result = "I’m extra sharp to cut right through paper... and lizards!";
                break;
            case LIZARD:
                result = "Hsssss.";
                break;
            case SPOCK:
                result = "It is only logical that you do your CIS 2353 homework.";
                break;
            default:
                break;
        }
        return result;
    }//end toString
    
    @Override
    public boolean equals(Object other) {
        boolean result = false;
        
        if(!(other instanceof GamePiece)) {
            return false;
        }
        
        GamePiece otherGP = (GamePiece)other;
        
        result = (classification == otherGP.classification);
        
        
        return result;
    }//end equals method
    
    @Override
    public int compareTo(GamePiece other) {
        int result = 0;
        
        if(classification == other.classification) {
            return 0;
        }//end TIE comparisons
        
        if(classification == Piece.ROCK) {
            if(other.classification == Piece.PAPER) {
                return -1;
            }
            else if(other.classification == Piece.LIZARD) {
               return 1;
            }
            else if(other.classification == Piece.SCISSORS) {
                return 1;
            }
            else if(other.classification == Piece.SPOCK) {
                return -1;
            }
        }//end ROCK comparisons
        else if(classification == Piece.PAPER) {
            if(other.classification == Piece.ROCK) {
                return 1;
            }
            else if(other.classification == Piece.SCISSORS) {
                return -1;
            }
            else if(other.classification == Piece.LIZARD) {
                return -1;
            }
            else if(other.classification == Piece.SPOCK) {
                return 1;
            }
        }//end PAPER comparisons
        else if(classification == Piece.SCISSORS) {
            if(other.classification == Piece.ROCK) {
                return -1;
            }
            else if(other.classification == Piece.PAPER) {
                return 1;
            }
            else if(other.classification == Piece.LIZARD) {
                return 1;
            }
            else if(other.classification == Piece.SPOCK) {
                return -1;
            }
        }//end SCISSORS comparisons
        else if(classification == Piece.LIZARD) {
            if(other.classification == Piece.ROCK) {
                return -1;
            }
            else if(other.classification == Piece.PAPER) {
                return 1;
            }
            else if(other.classification == Piece.SCISSORS) {
                return -1;
            }
            else if(other.classification == Piece.SPOCK) {
                return 1;
            }
        }//end LIZARD comparisons
        else if(classification == Piece.SPOCK) {
            if(other.classification == Piece.ROCK) {
                return 1;
            }
            else if(other.classification == Piece.PAPER) {
                return -1;
            }
            else if(other.classification == Piece.SCISSORS) {
                return 1;
            }
            else if(other.classification == Piece.LIZARD) {
                return -1;
            }       
        }//end SPOCK comparisons
    return result;
    }//end compareTo
    
}//end GamePiece class