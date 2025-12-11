package gameworld;
import java.util.Random;

public class Dungeon {
    private int width,height;
    private Room[][]dungeon;
    private Random random;

public Dungeon (){
    this.width=100;
    this.height=100;
    dungeon=new Room[width][height];
    this.random=new Random();
    generateDungeon();
}
public void generateDungeon(){

}   
}