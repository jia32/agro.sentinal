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
 * @date 2023-05-01 20:37:24
 */
@Entity
@Table(name = "price")
@Getter
@Setter
public class Price {

    /**
     *
     */

    private String country;

    /**
     *
     */

    private String itemCode;

    /**
     *
     */

    private String foodType;

    /**
     *
     */

    private String element;

    /**
     *
     */

    private String month;

    /**
     *
     */

    private String unit;

    /**
     *
     */

    private String y1991;

    /**
     *
     */

    private String y1992;

    /**
     *
     */

    private String y1993;

    /**
     *
     */

    private String y1994;

    /**
     *
     */

    private String y1995;

    /**
     *
     */

    private String y1996;

    /**
     *
     */

    private String y1997;

    /**
     *
     */

    private String y1998;

    /**
     *
     */

    private String y1999;

    /**
     *
     */

    private String y2000;

    /**
     *
     */

    private String y2001;

    /**
     *
     */

    private String y2002;

    /**
     *
     */

    private String y2003;

    /**
     *
     */

    private String y2004;

    /**
     *
     */

    private String y2005;

    /**
     *
     */

    private String y2006;

    /**
     *
     */

    private String y2007;

    /**
     *
     */

    private String y2008;

    /**
     *
     */

    private String y2009;

    /**
     *
     */

    private String y2010;

    /**
     *
     */

    private String y2011;

    /**
     *
     */

    private String y2012;

    /**
     *
     */

    private String y2013;

    /**
     *
     */

    private String y2014;

    /**
     *
     */

    private String y2015;

    /**
     *
     */

    private String y2016;

    /**
     *
     */

    private String y2017;

    /**
     *
     */

    private String y2018;

    /**
     *
     */

    private String y2019;

    /**
     *
     */

    private String y2020;

    /**
     *
     */

    private String y2021;

    /**
     *
     */

    private String y2022;

    /**
     *
     */
    @Id
    @GeneratedValue
    private Integer id;

}
