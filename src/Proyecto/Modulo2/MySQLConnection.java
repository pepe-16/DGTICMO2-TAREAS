package Proyecto.Modulo2;

import Principios.Solid.Clase.DependencyInversion.*;

public class MySQLConnection
{
    private String database;

    public MySQLConnection(String database)
    {
        this.database = database;
    }

    public String getDatabase()
    {
        return database;
    }

    public void setDatabase(String database)
    {
        this.database = database;
    }
}