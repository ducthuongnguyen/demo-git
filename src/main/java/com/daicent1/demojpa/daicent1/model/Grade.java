package com.daicent1.demojpa.daicent1.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "grade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "graId")
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "schoolId")
    private School schoolId;

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schoolId=" + schoolId +
                '}';
    }
}
