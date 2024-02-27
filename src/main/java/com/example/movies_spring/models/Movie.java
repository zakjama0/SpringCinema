package com.example.movies_spring.models;
import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {


    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private int rating;

    @Column(name = "duration")
    private String duration;

    // constructor functions
    public Movie(){}

    public Movie(String title, int rating, String duration){
        this.title = title;
        this.rating=rating;
        this.duration=duration;
    }




    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
