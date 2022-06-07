package ru.netology.MovieManager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Movie {
    private int id;
    private String imageUrl;
    private String movieName;
    private String movieGenre;
}
