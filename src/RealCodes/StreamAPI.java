package RealCodes;
/*
 intermediate operation transforms stream into another stream
 */
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public class product{
		int id;
		String name;
		float price;
		public product(int id,String name,float price) {
			this.id = id;
			this.name = name;
			this.price = price;
		}
	}
	public static void main(String[] args) {
List<String> words =Arrays.asList("gfg","geeks","for","geeksquize","geeksforgeeks");
  Optional<String>longeststring =words.stream()
                        .reduce((word1,word2)->word1.length()>word2.length()?word1:word2);
  longeststring.ifPresent(System.out::println);
  StreamAPI s = new StreamAPI();
	List<product> productslist = new ArrayList<product>();
	productslist.add(s.new product(1,"hp",25000f));
	productslist.add(s.new product(2,"dell",28000f));
	productslist.add(s.new product(3,"lenova",24000f));
	productslist.add(s.new product(4,"sony",29000f));
	List<Float> productsPricelist = new ArrayList<Float>();
	for(product p:  productslist) {
		if(p.price<30000) {
			productsPricelist.add(p.price); //without stream
		}		
	}
		System.out.println(productsPricelist);
		List<Float> productsPricelist1 =productslist.stream()
				                                     .filter(p-> p.price<30000)
				                                     .map(p->p.price)
				                                     .collect(Collectors.toList());	
	/*	 ALLOWDED BUT IN ARRAYS.STREAM()- SEE
	productslist.stream()
                .filter(p-> p.price<30000)
                .map(p->p.price)
                .forEach(p->System.out.println(p));	
		productslist.stream()
        .filter(p-> p.price<30000)
        .map(p->p.price)
        .forEach(p->System.out.println(p));	
	
		System.out.println(productsPricelist1);
		*/
		Stream.iterate(1, e->e+1)
		      .filter(e->e%5==0)
		      .limit(5)
		      .forEach(e->System.out.print(e+" "));
		System.out.println(" ");
		
		productslist.stream()
		            .filter(p->p.price==25000)
		            .forEach(p->System.out.println(p.name));
		Float totalprice = productslist.stream()
				                       .map(p->p.price)
				                       //      initialValue,Accumulator
				                       .reduce(0.0f, (sum,price)->sum+price);
		System.out.println("total_price "+totalprice);		
		// collectors to summing values
		
		
		double totalprice1 = productslist.stream()
				                         .collect(Collectors.summingDouble(p->p.price));
		System.out.println("total_price1 "+totalprice1);
		
		
		//max in stream
		List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Comparator<Integer> getmax = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer num1 = (Integer)o1;
				Integer num2= (Integer)o2;
				if(num1>num2)return 1;
				if(num1<num2)return -1;
				return 0;
			}
		};
		Optional<Integer> max = list.stream().max(getmax);
		System.out.println("maximum integerof list is  "+max.get());
		
		//list into set
		Set<Float>productpricelist1 = productslist.stream()
				                                  .filter(p->p.price<30000)
				                                  .map(p->p.price)
				                                  .collect(Collectors.toSet());
		System.out.println(productpricelist1);
		
		
		//list into map
		Map<Integer,String> productpricemap = productslist.stream()
				                                .collect(Collectors.toMap(p->p.id, p->p.name));
		System.out.println(productpricemap);
		
		
		
		
		
		
		
		
		
		
	}

}
