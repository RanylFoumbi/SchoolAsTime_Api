/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springsocial.model;

import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Ranyl
 */
@Entity
@Table(name = "Course")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "cotaHoraire", nullable = false)
    private Integer cotaHoraire;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId")
    private Set<Classroom_Course> classroom_Courses;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId")
    private Set<Proposition> propositions;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId")
    private Set<Department> departments;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCotaHoraire() {
        return cotaHoraire;
    }

    public void setCotaHoraire(Integer cotaHoraire) {
        this.cotaHoraire = cotaHoraire;
    }
    
    public Set<Classroom_Course> getClassroom_Courses() {
        return classroom_Courses;
    }

    public void setClassroom_Courses(Set<Classroom_Course> classroom_Courses) {
        this.classroom_Courses = classroom_Courses;
    }
    
    public Set<Proposition> getPropositions() {
        return propositions;
    }

    public void setPropositions(Set<Proposition> propositions) {
        this.propositions = propositions;
    }
    
    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartmentns(Set<Department> departments) {
        this.departments = departments;
    }
      
}
