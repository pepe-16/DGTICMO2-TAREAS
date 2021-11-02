package PrincipiosSOLID.interfaceSegregation;

import java.util.ArrayList;

public class Amazon implements InterfaceServer, InterfaceDrop,InterfaceCDNA
{
    ArrayList<Region> regions;

    public Amazon()
    {
        this.regions = new ArrayList<>();
    }
    public void storeFile(String name)
    {
        System.out.println("Amazon is storing file " + name);
    }
    public String getFile(String name)
    {
        return "Amazon file " + name;
    }
    public void createServer(Region region, String serverName)
    {
        region.addServer(serverName);
    }
    public void listServers(Region region)
    {
        System.out.println("Amazon region " + region.getName() + " contains the following servers: ");

        for (String server: region.getServers()) {
            System.out.println(server);
        }
    }
    public String getCDNAddress()
    {
        return "Amazon CDN Address";
    }
}
