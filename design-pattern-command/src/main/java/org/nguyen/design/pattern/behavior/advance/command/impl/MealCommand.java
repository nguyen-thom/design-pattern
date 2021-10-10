package org.nguyen.design.pattern.behavior.advance.command.impl;

import org.nguyen.design.pattern.behavior.advance.command.AdvanceCommand;
import org.nguyen.design.pattern.behavior.advance.command.Request;
import org.nguyen.design.pattern.behavior.advance.command.Result;
import org.nguyen.design.pattern.behavior.advance.command.receiver.Meal;
import org.nguyen.design.pattern.behavior.advance.command.request.RequestData;
import org.nguyen.design.pattern.behavior.advance.command.request.RequestData2;
import org.nguyen.design.pattern.behavior.advance.command.result.CookResult;
import org.nguyen.design.pattern.behavior.simple.command.Command;

public class MealCommand implements AdvanceCommand {
    private Meal meal;

    public MealCommand(Meal meal){
        this.meal = meal;

    }

    @Override
    public Result execute(Request request) {
        RequestData2 requestData2 = (RequestData2) request;
        meal.cook(null,requestData2.getCategory());
        return new CookResult("Cook with type " + requestData2.getCategory());
    }
}
