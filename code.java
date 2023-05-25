import java.util.*;

public class Car{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int milesPerDay;
int costPerGallon;
int milesPerGallon;
int parkingFees;
int tollsPerDay;
int dailyDrivingCost;
System.out.printf(&quot;enter total miles driven per day&quot;);
milesPerDay=sc.nextInt();
System.out.printf(&quot;cost per gallon for gasoline&quot;);

12

costPerGallon=sc.nextInt();
System.out.printf(&quot;average miles per gallon&quot;);
milesPerGallon=sc.nextInt();
System.out.printf (&quot;parking fees per day &quot;);
parkingFees=sc.nextInt();
System.out.printf(&quot;tolls per day &quot;);
tollsPerDay=sc.nextInt();
dailyDrivingCost = ((milesPerDay / milesPerGallon) * costPerGallon) + parkingFees +
tollsPerDay;
System.out.printf(&quot;total miles driven per day is %d\n &quot;,milesPerDay);
System.out.printf(&quot;cost per gallon for gasoline %d\n &quot;,milesPerGallon);
System.out.printf(&quot;average miles per gallon %d\n &quot;,milesPerGallon);
System.out.printf (&quot;parking fees per day %d\n &quot;,parkingFees);
System.out.printf(&quot;tolls per day %d\n&quot;,tollsPerDay);
System.out.printf(&quot;Daily driving cost = %d\n&quot;, dailyDrivingCost);
}
}