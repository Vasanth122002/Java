package javavideosonline;

public class car extends vehicle{
	String name="ford";
	int price = 1000000;
	
public String toString() {
	String str=name+" "+price;
	return str;
}

@Override
int price() {
	// TODO Auto-generated method stub
	return 10;
}
}