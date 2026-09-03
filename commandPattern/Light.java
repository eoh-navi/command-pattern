package commandPattern;

public class Light implements Switch {

    @Override
    public String switchOn()
    {
        return "Light is On";
    }

    @Override
    public String switchOff()
    {
        return "Light is Off";
    }
}