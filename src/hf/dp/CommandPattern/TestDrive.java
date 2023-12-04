package hf.dp.CommandPattern;

import hf.dp.CommandPattern.MyHWInfo;

public class TestDrive {
    public static void main(String[] args) {
        MyHWInfo myHWInfo = new MyHWInfo();
        myHWInfo.printInfo();
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Alarm alarm =new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);

        Button button2 = new Button(alarmOnCommand);
        button2.pressed();

        button2.setTheCommand(lampOnCommand);
        button2.pressed();

    }
}
