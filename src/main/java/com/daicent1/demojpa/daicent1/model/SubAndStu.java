package com.daicent1.demojpa.daicent1.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "subandstu")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SubAndStu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sId")
    private Long id;
    @Column(name = "score")
    private double score;


}
