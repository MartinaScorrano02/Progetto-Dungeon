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
public List<Entity> getCharacters(){
    return characters;
}
public List<Item> getItems(){
    return items;
}
public List<RoomEvent> getEvents(){
    return events;
}

public boolean addCharacter(Entity e){
for(Entity entity:characters){
    if(entity.getName().equals(e.getName())){
        return false;
    }
}
characters.add(e);
    return true;
}

public boolean addItem(Item i){
    for(Item item:items){
        if(item.getName().equals(i.getName())){
            return false;
        }
    }
    items.add(i);
    return true;
}

public boolean removeItem(Item i){
    for(Item item:items){
        if(item.getName().equals(i.getName())){
            items.remove(i);
            return true;
        }
    }
    return false;
}
public boolean removeEntity(Entity e){
    for(Entity entity:characters){
        if(entity.getName().euqals(e.getName())){
            characters.remove(e);
            return true;
        }
    }
    return false;
}