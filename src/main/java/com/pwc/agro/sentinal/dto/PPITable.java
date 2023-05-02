package com.pwc.agro.sentinal.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *  Entity
 *
 * @author Jasmine
 * @date 2023-05-01 20:32:06
 */
@Entity
@Table(name = "ppi")
@Getter
@Setter
public class PPITable {

    /**
     *
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     *
     */

    private String foodType;

    /**
     *
     */

    private String time;

    /**
     *
     */

    private String scale;

    /**
     *
     */
    private String ppi;
}
