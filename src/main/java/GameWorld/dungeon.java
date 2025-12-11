package gameworld;
import java.util.Random;
import gameworld.Room;
import gamewordl.Position;

public class Dungeon {
    private static final int WIDTH = 100;
    private static final int HEIGHT = 100;
    private Room[][] dungeonMap;
    private Random random;

public Dungeon(){
    dungeonMap=new Room[WIDTH][HEIGHT];
    random=new Random();
    generateDungeon();
}

public void generateDungeon(){
    int numberOfRooms=10;
    int numberOfRandomRooms=0;
    int attempts=0;
    int maxAttempts=100;
    while(numberOfRandomRooms<numberOfRooms && attemps<maxAttemps){
        Position p;
        int randomRow=random.nextInt(WIDTH);
        int randomCol=random.nextInt(HEIGHT);
        if(dungeonMap[randomRow][randomCol]==null){
        p=new Position(randomRow,randomCol);
        dungeonMap[randomRow][randomCol]=new Room();
        numberOfRandomRooms++;
        }
        attempts++;
    }
    if(numberOfRandomRooms>numberOfRooms){
    throw new IllegalStateException("Ops attenzione!Sembra che il numero massimo di stanze sia stato raggiunto!!");
        }
    

public Room getRoom(int row,int col){
    if(row<0|| row>=WIDTH||col<0||col>=HEIGHT){
        throw new IndexOutOfBoundsException("Ops attenzione!Sembra che le coordinate inserite non siano valide!!");
    }
    return dungeonMap[row][col];
}
}
}