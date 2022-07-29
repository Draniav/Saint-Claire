package com.sofka.saint_claire.utilities;

import org.springframework.stereotype.Component;
@Component
public class Response {


    public Boolean error;
    public String message;
    public Object data;

    public Response() {
        error = false;
        message = "Success";
        data = null;
    }

    public void restart() {
        error = false;
        message = "Success";
        data = null;
    }
}

