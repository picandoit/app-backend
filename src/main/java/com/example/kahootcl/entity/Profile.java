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
@Table(name = "profile" , schema = "extensions")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "register_id" , referencedColumnName = "id")
    private Register register;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "profile_kahoot" , joinColumns = @JoinColumn(name = "profile_id") , inverseJoinColumns = @JoinColumn(name = "kahoot_id"))
    private List<Kahoot> kahoots;


}
