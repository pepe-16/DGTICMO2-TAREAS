package Proyecto.Modulo2;

public class BudgetReport implements Entity
{
    private Database database;

    public BudgetReport()
    {
        this.database = (Database) new MySQLDatabase();
//        this.database = new MongoDB();
        database.connect("projects");
    }

    public void save() {
        database.insert(this);
    }
    public void drop(){
        database.delete(this);
    }
    public void update(){
        database.update(this);
    }
    public void search(){
        database.search(this);
    }
}