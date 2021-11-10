package Proyecto.Modulo2;

public class MongoDB implements Database
{
    MongoDBConnection connection;

    @Override
    public void connect(String database) {
        connection = new MongoDBConnection(database);
    }

    @Override
    public void insert(Entity entity) {
        System.out.println("Inserting " + entity + " in MongoDB using " + connection.getDatabase());
    }

    @Override
    public void update(Entity entity) {
        System.out.println("Updating " + entity + " in MongoDB using " + connection.getDatabase());
    }

    @Override
    public void delete(Entity entity){
        System.out.println("Deleting " + entity + " in MongoDB using " + connection.getDatabase());
    }
    
    @Override
    public void search(Entity entity){
        System.out.println("Search " + entity + " in MongoDB using " + connection.getDatabase());
    }

    public void disconnect() {
        connection = null;
    }
}