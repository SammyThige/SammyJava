package com.company;

public class Printer {
    public static void printTriangle(int rows) {
        Ncr ncr=new Ncr();
        double largest= (rows-1)%2==0?
                ncr.findNcr((rows-1),(rows+1)/2-1):
                ncr.findNcr((rows-1),rows/2-1);

                Spacing s=new Spacing();
                String oSpaces;
                oSpaces= s.outerSpacing((int)largest);

                for(int n=0;n<rows;n++) {
                    System.out.println(n + "->");
                    for (int i = 0; i < rows - n; i++) {
                        System.out.println(oSpaces);
                    }


                    for (int r = 0; r <= n; r++) {
                        int num = (int) ncr.findNcr(n, r);
                        String iSpaces = s.innerSpacing(num);

                        System.out.println(iSpaces + num);
                    }
                    System.out.println();
                }
    }
}
