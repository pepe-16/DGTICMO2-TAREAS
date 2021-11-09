package Proyecto.Modulo2;

import Principios.Solid.Clase.DependencyInversion.*;

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
}