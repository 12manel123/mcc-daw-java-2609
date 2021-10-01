package com.company;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a =new int [100];
        int b=0,c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,c11=0,c12=0,c13=0,c14=0,c15=0,c16=0,c17=0,c18=0,c19=0,c20=0;
        while (b<a.length){
            a[b]= random.nextInt(21)+30;
            if (a[b]==30){ c0++; }
            else{ if (a[b]==31){ c1++; }
            else{ if (a[b]==32){ c2++; }
            else{ if (a[b]==33){ c3++; }
            else{ if (a[b]==34){ c4++; }
            else{ if (a[b]==35){ c5++; }
            else{ if (a[b]==36){ c6++; }
            else{ if (a[b]==37){ c7++; }
            else{ if (a[b]==38){ c8++; }
            else{ if (a[b]==39){ c9++; }
            else{ if (a[b]==40){ c10++; }
            else{ if (a[b]==41){ c11++; }
            else{ if (a[b]==42){ c12++; }
            else{ if (a[b]==43){ c13++; }
            else{ if (a[b]==44){ c14++; }
            else{ if (a[b]==45){ c15++; }
            else{ if (a[b]==46){ c16++; }
            else{ if (a[b]==47){ c17++; }
            else{ if (a[b]==48){ c18++; }
            else{ if (a[b]==49){ c19++; }
            else{ if (a[b]==50){ c20++; }
            }}}}}}}}}}}}}}}}}}}}
            b++;
        }
        System.out.println("Pes 30: "+c0+" persones");
        System.out.println("Pes 31: "+c1+" persones");
        System.out.println("Pes 32: "+c2+" persones");
        System.out.println("Pes 33: "+c3+" persones");
        System.out.println("Pes 34: "+c4+" persones");
        System.out.println("Pes 35: "+c5+" persones");
        System.out.println("Pes 36: "+c6+" persones");
        System.out.println("Pes 37: "+c7+" persones");
        System.out.println("Pes 38: "+c8+" persones");
        System.out.println("Pes 39: "+c9+" persones");
        System.out.println("Pes 40: "+c10+" persones");
        System.out.println("Pes 41: "+c11+" persones");
        System.out.println("Pes 42: "+c12+" persones");
        System.out.println("Pes 43: "+c13+" persones");
        System.out.println("Pes 44: "+c14+" persones");
        System.out.println("Pes 45: "+c15+" persones");
        System.out.println("Pes 46: "+c16+" persones");
        System.out.println("Pes 47: "+c17+" persones");
        System.out.println("Pes 48: "+c18+" persones");
        System.out.println("Pes 49: "+c19+" persones");
        System.out.println("Pes 50: "+c20+" persones");

    }
}