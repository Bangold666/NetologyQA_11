package ru.netology.MovieManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    void shouldAddMoviesAndFindAll() {

        MovieManager manager = new MovieManager();
        int arraySize = 20;
        Movie[] expectedMovies = new Movie[arraySize];

        //заполнение списка фильмов
        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movie newMovie = new Movie(i, "urlMovie" + number, "Movie" + number, "genre" + number);
            manager.MovieAdd(newMovie);
            expectedMovies[i] = newMovie;
        }

        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expectedMovies, actual);
    }

    @Test
    void shouldEmptyAndFindAll() {
        MovieManager manager = new MovieManager();
        Movie[] actual = manager.findAll();
        Movie[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldViewLastMovies() {

        MovieManager manager = new MovieManager();
        int arraySize = 15;
        Movie[] expectedMovies = new Movie[arraySize];

        // заполнение списка фильмов
        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movie newMovie = new Movie(i, "urlMovie" + number, "Movie" + number, "genre" + number);
            manager.MovieAdd(newMovie);
            expectedMovies[i] = newMovie;
        }

        Movie[] actual = manager.findLast();
        Movie[] expected = {expectedMovies[14], expectedMovies[13], expectedMovies[12], expectedMovies[11], expectedMovies[10], expectedMovies[9], expectedMovies[8], expectedMovies[7], expectedMovies[6], expectedMovies[5]};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldViewConfigLastMovies() {

        MovieManager manager = new MovieManager(3);
        int arraySize = 7;
        Movie[] expectedMovies = new Movie[arraySize];

        //заполнение списка фильмов
        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movie newMovie = new Movie(i, "urlMovie" + number, "Movie" + number, "genre" + number);
            manager.MovieAdd(newMovie);
            expectedMovies[i] = newMovie;
        }

        Movie[] actual = manager.findLast();
        Movie[] expected = {expectedMovies[6], expectedMovies[5], expectedMovies[4]};

        Assertions.assertArrayEquals(expected, actual);
    }

}
