package RealCodes;

import java.util.function.Function;
// it a interface
public class FunctionInterface {

	public static void main(String[] args) {
  Function<Integer,Double> half = a-> a/2.0;
  half = half.andThen(b ->3*b);//first apply() runs then .andThen() runs then expression
  System.out.println(half.apply(17));
	
  Function<Integer,Integer> half1 = a->{ return (int) (a/2.0) ;};
  half1 = half1.compose(a->3*a);//first apply() runs then .compose() runs then expression
  System.out.println(half1.apply(17));
	
  Function<Integer,Integer> i = Function.identity();// returns argument which is send by the apply().
  System.out.println(i.apply(17));
	}

	
	
	
}
