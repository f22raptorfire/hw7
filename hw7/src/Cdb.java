import wci.frontend.CdbParser;

public class Cdb
{
    public static void main(String[] args)
    {
        try {
            CdbParser.main(args);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
