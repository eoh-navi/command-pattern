package commandPattern;

public class TurnOn implements Command {

    private Switch device;

    public TurnOn(Switch device)
    {
        this.device = device;
    }

    @Override
    public String execute()
    {
        return device.switchOn();
    }
}