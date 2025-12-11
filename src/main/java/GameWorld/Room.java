package gameworld;
import gameworld.Position;
import gameworld.Dungeon;

public class Room {
    private int row,col;
    private String description;
    private Passage north,south,east,west;
    private boolean isBossRoom,secretPassage,secretRoom;
    private List<Entity> characters;
    private List<Item> items;
    private List<RoomEvent> events;

public Room(int row,int col,String description,Passage north,Passage south,Passage east,Passage west,boolean isBossRoom,boolean secretPassage,boolean secretRoom){
    this.row=row;
    this.col=col;
    this.description=description;
    this.north=north;
    this.south=south;
    this.east=east;
    this.west=west;
    this.isBossRoom=false;
    this.secretPassage=false;
    this.secretRoom=false;
    characters=new ArrayList<>();
    items=new ArrayList<>();
    events=new ArrayList<>();
}
public boolean addEnemy(Enemy enemy){
for(Character character:characters){
    if(character.getName().equals(enemy.getName())){
        return false;
    }
    characters.add(enemy);
    return true;
}
}

public boolean addKey(Key key){
    for(Item item:items){
        if(item.getName().equals(key.getName())){
            return false;
        }
        items.add(key);
    }
}



