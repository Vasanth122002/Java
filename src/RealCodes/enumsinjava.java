package RealCodes;
/*
 enum constants are static and final implicitly.
 enum can have fields, constructors,methods.
 enum implement many interfaces but cant extend any class because it it internally extends enum class.
 it is possible to create a main method inside enum.
 public enum season{
 WINTER,SPRING,SUMMER,FALL;
 	public static void main(String[] args) {
		season s = season.WINTER;
		System.out.println(s);
	}
 }
 
 
 */
public class enumsinjava {
	public enum season{WINTER,SPRING,SUMMER,FALL}
	public static void main(String[] args) {
		for(season s: season.values())
			System.out.println(s);
		System.out.println("value of winter is "+season.valueOf("WINTER"));
		System.out.println("value of winter is "+season.valueOf("WINTER").ordinal());
		season s = season.WINTER;
		System.out.println(s);
		enum season1{ 
			WINTER(5),SPRING(10),SUMMER(15),FALL(20);

			private int value;

			season1(int value) {
				this.value = value;
			                   }
			
			        }
		for(season1 s1: season1.values())
			System.out.println(s1+" "+s1.value);
	// enum with switch
		enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,HELLODAY}
	Day day = Day.HELLODAY;
	switch(day) {
	case SUNDAY: System.out.println("SUNDAY");break;
	case MONDAY: System.out.println("MONDAY");break;
	case TUESDAY: System.out.println("TUESDAY");break;
	case WEDNESDAY: System.out.println("WEDNESDAY");break;
	case THURSDAY: System.out.println("THURSDAY");break;
	case FRIDAY: System.out.println("FRIDAY");break;
	case SATURDAY: System.out.println("SATURDAY");break;
	default : System.out.println("other day");break;
	}
	
	
	
	
	
	}

}
