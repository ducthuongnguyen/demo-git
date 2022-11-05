package com.daicent1.demojpa.daicent1.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "clazz")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clasz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claId")
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "graId")
    private Grade graId;

    @Override
    public String toString() {
        return "Clasz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", graId=" + graId +
                '}';
    }
}
