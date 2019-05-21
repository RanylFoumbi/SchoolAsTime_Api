/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springsocial.model;

import javax.persistence.*;

/**
 *
 * @author Ranyl
 */
@Entity
@Table(name = "Department")
public class Department {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @ManyToOne()
    @JoinColumn(name = "courseId", referencedColumnName = "id")
    private Course courseId;
    
    public Department(Long id, Course courseId){
        this.id = id;
        this.courseId = courseId;
    }
        
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }
    
}
