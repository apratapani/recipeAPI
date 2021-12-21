package com.example.recipe.exceptions;

public class NoSameReviewUsernameAsRecipeException extends Exception {

    public NoSameReviewUsernameAsRecipeException(String message)
    {
        super(message);
    }

    public NoSameReviewUsernameAsRecipeException() {
    }
}
