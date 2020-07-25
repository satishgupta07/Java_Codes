package HASH_MAP;

import java.util.LinkedList;

public class MapUsingLinkedList {

    LinkedList<Entity> entities = new LinkedList<>();

    class Entity{

        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key, String value) {
        for (Entity entity : entities) {
             if(entity.key.equals(key)){
                 entity.value = value;
                 return;
             }
        }
        entities.add(new Entity(key,value));                 //  Entity e = new Entity(key,value);
                                                             //  entities.add(e);
    }

    public String get(String key) {
        for (Entity entity : entities) {
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public String remove(String key) {
        Entity target = null ;

        for(Entity entity : entities){
            if(entity.key.equals(key)){
                target = entity;
                break;
            }
        }
        String temp = target.value;
        entities.remove(target);
        return temp;
    }

    @Override
    public String toString() {
        String s= "";

        s+= "{";

        for (Entity entity:entities) {

            s+=(entity.key+"->"+entity.value+", ");
        }
        s+="}";

        return s;
    }

}
