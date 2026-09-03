package commandPattern;

public class TurnOff implements Command {

    private Switch device;

    public TurnOff(Switch device)
    {
        this.device = device;
    }

    @Override
    public String execute()
    {
        return device.switchOff();
    }
}