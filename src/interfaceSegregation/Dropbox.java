package interfaceSegregation;

public class Dropbox implements InterfaceDrop
{
   
    public void storeFile(String name)
    {
        System.out.println("Dropbox is storing file " + name);
    }
    public String getFile(String name)
    {
        return "Dropbox file " + name;
    }
}
