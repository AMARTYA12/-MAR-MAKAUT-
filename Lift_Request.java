package Lift_Request;
import java.util.*;
import java.lang.*;

public class Lift_Request {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Scanner Scan=new Scanner (System.in);
if (Scan.hasNextInt()) {
	int x=Scan.nextInt();
}
System.out.println("enter the Number Of Floors:");
int y=Scan.nextInt();
System.out.println("enter the Queue:");
int z=Scan.nextInt();
int curr=0;
long  sum=0;
while(z!=0) {
	System.out.println("enter the Source Floor:");
	int a=Scan.nextInt();
	System.out.println("enter the Destination Floor:");
	int b=Scan.nextInt();
	sum+=Math.abs(a-curr)+Math.abs(b-curr);

	curr=b;
	z--;
}
System.out.println("the Number of Floor:"+sum);

	}

}
