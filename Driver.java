import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of snakes");
        int noOfSnakes = scanner.nextInt();
        List<Snake> snakes = new ArrayList<Snake>();
        for(int i=0;i<noOfSnakes;i++) {
            System.out.print("Enter start and end position");
            snakes.add(new Snake(scanner.nextInt(), scanner.nextInt()));
        }

        System.out.print("Enter number of ladders");
        int noOfLadders = scanner.nextInt();
        List<Ladder> ladders = new ArrayList<Ladder>();

        for(int i=0;i<noOfLadders;i++){
            System.out.print("Enter start and end position");
            ladders.add(new Ladder(scanner.nextInt(), scanner.nextInt()));
        }

        System.out.print("Enter number of players");
        int noOfPlayers = scanner.nextInt();
        List<Player> players = new ArrayList<Player>();

        for(int i=0;i<noOfPlayers;i++){
            System.out.print("Enter " + i + "th player name");
            players.add(new Player(scanner.next()));    
        }

        SnakeAndLadder snakeAndLadder = new SnakeAndLadder(100);
        snakeAndLadder.setPlayers(players);
        snakeAndLadder.setSnakes(snakes);
        snakeAndLadder.setLadders(ladders);

        System.out.print("Game Started");
        snakeAndLadder.startGame();
        scanner.close();
    }
}
