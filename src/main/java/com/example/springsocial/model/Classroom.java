/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springsocial.model;

import java.util.Set;
import javax.persistence.*;
import javax.persistence.Table;

/**
 *
 * @author Ranyl
 */
@Entity
@Table(name = "Classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
      
    @ManyToOne()
    @JoinColumn(name = "leveId", referencedColumnName = "id")
    private Level levelId;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "classroomId")
    private Set<Classroom_Course> Classroom_Courses;
     
    public Classroom(String name, Level levelId){
        this.name = name;
        this.levelId = levelId;
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
    
    public Level getLevelId(){
       return levelId;
    }
    
    public void setLevelId(Level levelId){
        this.levelId = levelId;
    }
    
    public Set<Classroom_Course> getClassroom_Courses() {
        return Classroom_Courses;
    }

    public void setClassroom_Courses(Set<Classroom_Course> Classroom_Courses) {
        this.Classroom_Courses = Classroom_Courses;
    }
    
}
