package com.atecher.mintools.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MtResource implements Serializable {

    private int id;

    private String code;

    private String title;

    private String target;

    private String href;

    private String type;

    private int relative;

    private String icon;

    private String description;

    private String tag;

}
