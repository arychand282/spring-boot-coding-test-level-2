package com.accenture.codingtest.springbootcodingtest.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "project")
public class Project {

    @Id
    @Column(name = "id", length = 40)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

}
