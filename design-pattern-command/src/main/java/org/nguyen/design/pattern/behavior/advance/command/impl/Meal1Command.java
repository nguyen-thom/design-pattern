package org.nguyen.design.pattern.behavior.advance.command.impl;

import org.nguyen.design.pattern.behavior.advance.command.AdvanceCommand;
import org.nguyen.design.pattern.behavior.advance.command.Request;
import org.nguyen.design.pattern.behavior.advance.command.Result;
import org.nguyen.design.pattern.behavior.advance.command.receiver.Meal;
import org.nguyen.design.pattern.behavior.advance.command.request.RequestData;
import org.nguyen.design.pattern.behavior.advance.command.result.CookResult;

public class Meal1Command implements AdvanceCommand {
    private Meal meal;

    public Meal1Command(Meal meal){
        this.meal = meal;
    }

    @Override
    public Result execute(Request request) {
        RequestData requestData = (RequestData) request;
        meal.cook(requestData.getType(),null);
        return new CookResult("Cook with Type");
    }
}
