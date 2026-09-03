package commandPattern;

public class Speaker implements Switch {

    @Override
    public String switchOn()
    {
        return "Volume has Increased";
    }

    @Override
    public String switchOff()
    {
        return "Volume has Decreased\n";
    }
}