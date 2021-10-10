package org.nguyen.design.pattern.behavior.simple.command.house;

import org.nguyen.design.pattern.behavior.simple.command.Command;
import org.nguyen.design.pattern.behavior.simple.command.receiver.Door;
import org.nguyen.design.pattern.behavior.simple.command.receiver.Light;

public class DoorCloseCommand implements Command {
    private Door door;
    private Light light;

    public DoorCloseCommand(Door door, Light light){
        this.door = door;
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
        door.close();
    }
}
