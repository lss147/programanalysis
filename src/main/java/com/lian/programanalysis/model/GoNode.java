package com.lian.programanalysis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GoNode {
   private String key;
   private String shape;
    private  String text;
    private String color;
    private String category;

}
