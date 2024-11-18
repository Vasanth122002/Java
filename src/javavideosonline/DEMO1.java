package javavideosonline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class DEMO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
       
           Predicate<Integer> p = aa->aa % 3 !=0;
           Predicate<Integer> pp = aa->aa < 21;
         check(p,pp,a);
	}

	private static void check(Predicate<Integer> p, Predicate<Integer> pp, int[] a) {
		// TODO Auto-generated method stub
		  for(int i=0;i<10;i++) {
              if( p.test(a[i]) && pp.test(a[i]))
                  System.out.println(a[i]);
         }
	}



}
