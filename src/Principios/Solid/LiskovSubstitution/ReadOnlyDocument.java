package Principios.Solid.LiskovSubstitution;

public class ReadOnlyDocument extends Document
{
    public ReadOnlyDocument(String fileName)
    {
        super(fileName);
    }
    public void save() //throws Exception
    {
        System.out.println("A read-only document cannot be modified and saved.");
    }
}
