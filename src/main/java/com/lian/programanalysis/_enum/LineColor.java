package com.lian.programanalysis._enum;

public enum LineColor {
    red(1),
    green(2),
    black(3);
    private int index;
    LineColor(int index) {
        this.index = index;
    }
    public static LineColor getType(String type) {
        switch (type) {
            case "no":
                return red;
            case "yes":
                return green;
            case "":
                return black;
            default:
                return black;
        }

    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static void main(String[] args) {
        System.out.println(LineColor.getType("yes"));
    }
}
