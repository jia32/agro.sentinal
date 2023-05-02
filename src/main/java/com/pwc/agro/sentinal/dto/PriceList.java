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
 * @date 2023-05-01 20:37:22
 */
@Entity
@Table(name = "price_list")
@Getter
@Setter
public class PriceList {

    /**
     *
     */

    private String foodType;

    /**
     *
     */

    private String y2022;

    /**
     *
     */

    private String y2021;

    /**
     *
     */

    private String y2020;

    /**
     *
     */

    private String y2019;

    /**
     *
     */

    private String y2018;

    /**
     *
     */

    private String y2017;

    /**
     *
     */

    private String y2016;

    /**
     *
     */

    private String y2015;

    /**
     *
     */

    private String y2014;

    /**
     *
     */

    private String y2013;

    /**
     *
     */

    private String average20202022;

    /**
     *
     */
    @Id
    @GeneratedValue
    private Integer id;

}
