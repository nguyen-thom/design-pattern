package org.nguyen.design.pattern.behavior.simple.command;

import org.nguyen.design.pattern.behavior.simple.command.house.DoorCloseCommand;
import org.nguyen.design.pattern.behavior.simple.command.house.DoorOpenCommand;
import org.nguyen.design.pattern.behavior.simple.command.house.LightOffCommand;
import org.nguyen.design.pattern.behavior.simple.command.house.LightOnCommand;
import org.nguyen.design.pattern.behavior.simple.command.receiver.Door;
import org.nguyen.design.pattern.behavior.simple.command.receiver.Light;

public class Client {

    public void test(){
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        lightOnCommand.execute();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        lightOffCommand.execute();

        Door door = new Door();
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door,light);
        doorOpenCommand.execute();

        DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door,light);
        doorCloseCommand.execute();


    }

}
