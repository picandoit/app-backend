package com.example.kahootcl.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "kahoot", schema = "extensions")
public class Kahoot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "kahoot_quiz", joinColumns = @JoinColumn(name = "kahoot_id"), inverseJoinColumns = @JoinColumn(name = "quiz_id"),schema = "extensions")
    private List<Quiz> quizzes;


    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH} , mappedBy = "kahoots")
    private List<Profile> profiles;


}
