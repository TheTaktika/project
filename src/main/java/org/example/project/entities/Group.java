package org.example.project.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Group {
    private final UUID id;
    private String title;


    public Group(String title) {
        this.id = UUID.randomUUID();
        this.title = title;
    }

    @JsonCreator
    public Group(@JsonProperty("id") UUID id,
                 @JsonProperty("title") String title) {
        this.id = id;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, title: %s", id, title);
    }

}
