package commandPattern;

public class Temperature implements Switch {

    @Override
    public String switchOn()
    {
        return "Temperature has Increased";
    }

    @Override
    public String switchOff()
    {
        return "Temperature has Decreased\n";
    }
}