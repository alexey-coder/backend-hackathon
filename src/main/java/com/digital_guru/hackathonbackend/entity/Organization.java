package com.digital_guru.hackathonbackend.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@EqualsAndHashCode
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Organization {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "Name", nullable = false, length = 45)
    private String name;
    @Basic
    @Column(name = "description", nullable = false, length = -1)
    private String description;

}
