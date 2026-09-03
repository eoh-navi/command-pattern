package commandPattern;

public class ViewerApp {

    public static void main(String[] args) {

        Tv tv = new Tv();
        Speaker speaker = new Speaker();
        Temperature temperature = new Temperature();
        Light light = new Light();

        TurnOn turnOn = new TurnOn(tv);
        TurnOff turnOff = new TurnOff(tv);
        TurnOn increaseVolume = new TurnOn(speaker);
        TurnOff decreaseVolume = new TurnOff(speaker);
        TurnOn tempOn = new TurnOn(temperature);
        TurnOff tempOff = new TurnOff(temperature);
        TurnOn lightOn = new TurnOn(light);
        TurnOff lightOff = new TurnOff(light);

        RemoteControl remote = new RemoteControl();

        //Television
        remote.setCommand(turnOn);
        remote.clickButton();
        remote.setCommand(turnOff);
        remote.clickButton();

        //Temperature
        remote.setCommand(tempOn);
        remote.clickButton();
        remote.setCommand(tempOff);
        remote.clickButton();

        //Volume
        remote.setCommand(increaseVolume);
        remote.clickButton();
        remote.setCommand(decreaseVolume);
        remote.clickButton();

        //Light
        remote.setCommand(lightOn);
        remote.clickButton();
        remote.setCommand(lightOff);
        remote.clickButton();
    }
}