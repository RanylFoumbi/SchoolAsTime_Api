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
@Table(name = "Classroom_Course")
public class Classroom_Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne()
    @JoinColumn(name = "classroomId", referencedColumnName = "id")
    private Classroom classroomId;
    
    @ManyToOne()
    @JoinColumn(name = "courseId", referencedColumnName = "id")
    private Course courseId;
    
    public Classroom_Course(Long id, Level levelId, Course courseId){
        this.id = id;
        this.classroomId = classroomId;
        this.courseId = courseId;
    }
    
    public Long getId() {
        return id;
    }

    public Classroom getLevelId() {
        return classroomId;
    }

    public void setLevelId(Classroom classroomId) {
        this.classroomId = classroomId;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

   
}
