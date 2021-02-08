package com.lian.programanalysis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GoConnectLine {
    private String from;
    private  String to;
    private String color;
    private String text;
}
