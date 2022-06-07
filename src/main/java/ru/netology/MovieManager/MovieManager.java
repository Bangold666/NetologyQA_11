package ru.netology.MovieManager;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int numberOfLastAddedMovies;

    public MovieManager() {
        this.numberOfLastAddedMovies = 10;
    }

    public MovieManager(int numberOfLastAddedMovies) {
        this.numberOfLastAddedMovies = numberOfLastAddedMovies;
    }

    public void MovieAdd(Movie newMovie) {

        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        int lastAdd = tmp.length - 1;
        tmp[lastAdd] = newMovie;

        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {

        if (numberOfLastAddedMovies < movies.length) {

            Movie[] result = new Movie[numberOfLastAddedMovies];

            //заполняем массив в обратном порядке
            for (int i = 0; i < numberOfLastAddedMovies; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }

            return result;

        } else {

            Movie[] result = new Movie[movies.length];

            //заполняем массив в обратном порядке
            for (int i = 0; i < numberOfLastAddedMovies; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
            return result;
        }
    }

}
