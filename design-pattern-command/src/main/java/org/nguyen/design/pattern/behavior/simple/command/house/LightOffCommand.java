package org.nguyen.design.pattern.behavior.simple.command.house;

import org.nguyen.design.pattern.behavior.simple.command.Command;
import org.nguyen.design.pattern.behavior.simple.command.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
