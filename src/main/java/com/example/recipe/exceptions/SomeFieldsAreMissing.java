package com.example.recipe.exceptions;

public class SomeFieldsAreMissing extends Exception{
    public SomeFieldsAreMissing(String message) {
        super(message);
    }

    public SomeFieldsAreMissing() {
    }
}
