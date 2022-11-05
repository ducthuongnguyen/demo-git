package com.daicent1.demojpa.daicent1.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stuId")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "claId")
    private Clasz claId;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "subandstu",
            joinColumns = {@JoinColumn(name = "stuId")},
            inverseJoinColumns = {@JoinColumn(name = "subId")})
    private Set<Student> students;

}
