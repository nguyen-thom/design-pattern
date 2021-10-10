package org.nguyen.design.pattern.behavior.advance.command.request;

import org.nguyen.design.pattern.behavior.advance.command.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RequestData2 implements Request {
    private Long category;
}
