package com.blueyonder.thymeleafproj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Tutorial {

    @Id
    private String title;
    private String description;
    private boolean published;

    public Tutorial() {
    }

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Tutorial [description=" + description + ", published=" + published + ", title=" + title + "]";
    }
}
