package com.pwc.agro.sentinal.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *  Entity
 *
 * @author Jasmine
 * @date 2023-05-01 20:32:15
 */
@Entity
@Table(name = "ratio")
@Getter
@Setter
public class RatioTable {

    /**
     * 
     */
    private Double foodSecurity;

    /**
     * 
     */
    private String country;

    /**
     * 
     */
    
    private Double affordability;

    /**
     * 
     */
    
    private Double availability;

    /**
     * 
     */
    
    private Double quality;

    /**
     * 
     */
    
    private Double sustainability;

    /**
     * 
     */
    @Id
    @GeneratedValue
    private Integer id;
}
