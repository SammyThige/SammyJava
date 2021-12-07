package com.company;

public class Spacing {
    int count=0;
    public String outerSpacing(int num) {
        String spacing="";
        for(int i=num;i!=0;i/=10) {
            spacing+=" ";
            count++;
        }
        return spacing;
    }
    public String innerSpacing(int num) {
        String spaces="";
        for (int i=0;i<(2*count)-1;i++) {
            spaces+=" ";
        }
        for (int i=num/10;i!=0;i/=10) {
            spaces+="\b";
        }
        return spaces;
    }
}
