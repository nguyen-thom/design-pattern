package org.nguyen.design.pattern.behavior.advance.command.result;

import org.nguyen.design.pattern.behavior.advance.command.Result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter
public class CookResult implements Result {
    private String message;

}
