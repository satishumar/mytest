import java.util.Scanner;

class Test{
	public static void main(String [] args) {

int total=0;
	Scanner sc= new Scanner(System.in);
	String[] a= new String [6];
	a[0]= "Shahi Paneer, Price 120";
	a[1]= "Non Roti, Price 2";
	a[2]= "Tava Roti, Price 4";
	a[3]= "Buzia sabji, Price 60";
	a[4]= "Mater panner, Price 140";
	a[5]= "Dal Makhani, Price 60";
	System.out.println("Restaurant ::Menu");
	System.out.println();
	for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
System.out.println("If you want to select press Y or Press n If It is done");
String s= sc.next();
if(s.equalsIgnoreCase("y")) {
total=total+120;

}
else if(s.equalsIgnoreCase("y")) {
total=total+2;
}
else if(s.equalsIgnoreCase("y")) {
total=total+4;
}
else if(s.equalsIgnoreCase("n")) {
break;
}
else if(s.equalsIgnoreCase("y")) {
total=total+60;
}
else if(s.equalsIgnoreCase("y")) {
total=total+140;
}
else if(s.equalsIgnoreCase("y")) {
total=total+60;
}
	}
	
	System.out.println(" Billing Amount Rs:"+ total);
	
	
	
	
	
}}