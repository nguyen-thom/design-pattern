package org.nguyen.design.pattern.behavior.advance.command.request;

import org.nguyen.design.pattern.behavior.advance.command.Request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RequestData implements Request {
    private String type;
}
