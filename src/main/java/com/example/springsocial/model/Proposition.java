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
@Table(name = "Proposition")
public class Proposition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "day", nullable = false)
    private String day;
    
    @Column(name = "period", nullable = false)
    private String period;
    
    @ManyToOne()
    @JoinColumn(name = "courseId", referencedColumnName = "id")
    private Course courseId;
    
    @ManyToOne()
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User userId;
    
    public Proposition(Long id, Course courseId, User userId){
        this.id = id;
        this.courseId = courseId;
        this.userId = userId;
    }
    
    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }
    
     public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

}
