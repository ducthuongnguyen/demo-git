package com.daicent1.demojpa.daicent1.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "subject")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subId")
    private Long id;
    @Column(name = "name")
    private String name;


}
