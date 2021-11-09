package Proyecto.Modulo1;
public class MongoDBDatabase {
	MongoDBConnection connection;

    public void connect(String database) {
        connection = new MongoDBConnection(database);
    }

    public void insert(String comando) {
        System.out.println("Inserting " + comando);
    }

    public void update(String comando) {
        System.out.println("Updating " + comando);
    }

    public void delete(String comando) {
        System.out.println("Deleting " + comando);
    }
    public void consulta (String comando)
    {
    	 System.out.println("Select " + comando);
    }
    
    public void disconnect() {
        connection = null;
    }

}
