package com.pwc.agro.sentinal.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  Entity
 *
 * @author Jasmine
 * @date 2023-05-01 20:32:05
 */
@Entity
@Table(name = "pivot")
@Getter
@Setter
public class Pivot {

    /**
     * 
     */
    private String foodType;

    /**
     * 
     */
    private String averageY2022;

    /**
     * 
     */
    
    private String averageY2021;

    /**
     * 
     */
    
    private String averageY2020;

    /**
     * 
     */
    
    private String averageY2019;

    /**
     * 
     */
    
    private String averageY2018;

    /**
     * 
     */
    
    private String averageY2016;

    /**
     * 
     */
    
    private String averageY2017;

    /**
     * 
     */
    
    private String averageY2015;

    /**
     * 
     */
    
    private String averageY2014;

    /**
     * 
     */
    
    private String averageY2013;

    /**
     * 
     */
    @Id
    @GeneratedValue
    private Integer id;
}
