package org.nguyen.design.pattern.behavior.advance.command.receiver;

public class Meal {


    public void cook(String type,Long category){
        if(type != null){
            System.out.println("-------- Cook with type " + type);
        }else{
            System.out.println("-------- Cook with category " + category);
        }

    }
}
