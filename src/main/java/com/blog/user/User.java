package com.blog.user;

import com.blog.post.Post;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Table;

import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table (name = "user_account")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String name;

    @JsonIgnore
    @OneToMany (mappedBy = "user")
    private List<Post> posts =  new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return posts;
    }
}
