package org.nguyen.design.pattern.behavior.advance.command;

import org.nguyen.design.pattern.behavior.advance.command.impl.Meal1Command;
import org.nguyen.design.pattern.behavior.advance.command.impl.MealCommand;
import org.nguyen.design.pattern.behavior.advance.command.receiver.Meal;
import org.nguyen.design.pattern.behavior.advance.command.request.RequestData;
import org.nguyen.design.pattern.behavior.advance.command.request.RequestData2;

public class Client {


    public void test(){
        Meal meal = new Meal();
        Meal1Command meal1Command = new Meal1Command(meal);
        MealCommand mealCommand = new MealCommand(meal);

        RequestData requestData = new RequestData();
        requestData.setType("Type 1");
        System.out.println(meal1Command.execute(requestData));

        RequestData2 requestData2 = new RequestData2();
        requestData2.setCategory(231l);
        System.out.println(mealCommand.execute(requestData2));

    }
}
