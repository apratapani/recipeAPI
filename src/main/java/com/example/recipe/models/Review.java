package com.example.recipe.models;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private int rating;
/*
    private void setRating(int rating) {
        if ((rating < 0) || (rating > 10)) {
            throw new IllegalStateException("Rating must be between 0 and 10");
        }
        this.rating = rating;
    }
*/

}
