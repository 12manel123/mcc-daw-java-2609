package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);

    String paraula="hola que tal avui no plou tampoc fa sol";
    int i=0;
    while (i<paraula.length()){
		System.out.println(paraula.charAt(i));
		i++;
	}

    i=0;
    char p[] = paraula.toCharArray();
    while (i<p.length){
    	System.out.println(p[i]);
    	i++;
    }


	//int[] a =new int [10];
	//int i = 0;
	//while (i<a.length){
	//	System.out.print("Entra valor de posició "+i+": ");
	//	a[i] = teclat.nextInt();
	//	i=i+1;
	//}

	//char res='s';
	//String [] noms=new String[8];
	//int index=0;
	//while (res=='s'&& index <8){
	//	System.out.print("Nom: ");
	//	noms[index]=teclat.next();
	//	index++;
	//	System.out.print("Vols continuar(s/n)?: ");
	//	res=teclat.next().toLowerCase().charAt(0);
	//}
	//int i = 0;
	//while (i<index){
	//	System.out.println("Nom "+i+" = "+noms[i]);
	//	i++;
	//}


	//double[] b = {7.9,8.2,3.9,1.1,34.6};
	//b[4]=1.89;
	//int j = 0;
	//while (j< b.length){
	//	System.out.println(b[i]);
	//	j = j +1;
	//}

    }
}
