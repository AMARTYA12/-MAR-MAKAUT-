package Good_prefix;
import java.util.*;
public class Good_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan =new Scanner (System.in);
		int t=0;
		if (Scan.hasNext())
	       t=Scan.nextInt();
	  
	  while(t!=0) {
		  System.out.println("enter the String:");
	     String S1= Scan.next();
		 int y=Scan.nextInt();
	     int z=Scan.nextInt();
	     int count=0;
		 int freq[]=new int [26];
		 char[]a=S1.toCharArray();
		  for(int i=0;i<S1.length()-1;i++) {
			  freq[a[i]-'a']++;
			  if(freq[a[i]-'a']>z) {
				  if (y>0) {
					  freq[a[i]-'a']--;
					  y--;
				  }
				  else{
					  break;
			  }
			  }
			else
			    count++;
		  }
		  System.out.println(count);
		  System.out.println("the String is: ");
		  for(int i=0;i<S1.length();i++) {
			  System.out.print(freq[i]);
		  }
		  t--;
	  }
	}

}
