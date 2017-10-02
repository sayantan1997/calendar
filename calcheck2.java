import java.util.*;
import java.text.*;
public class calcheck2
{
 public static void main(String args[])
 {
 int i,j,k,l,t,u,v;
 GregorianCalendar cl=new GregorianCalendar();
 k=cl.get(Calendar.DAY_OF_MONTH);
 System.out.println("Today's date:"+cl.get(Calendar.DAY_OF_MONTH)+"/ "+cl.get(Calendar.MONTH)+"/ "+cl.get(Calendar.YEAR));
 String[] name = new DateFormatSymbols().getShortWeekdays();
 l=name.length;
 cl.set(GregorianCalendar.DATE,1);
 u=cl.get(Calendar.DAY_OF_WEEK);
 for(i=0;i<l;i++)
 System.out.print(name[i]+"\t");
 System.out.println();
 for(i=1;i<=u;i++)
 System.out.print("\t");
 //System.out.println();
 System.out.print(cl.get(Calendar.DAY_OF_MONTH));
 while(cl.get(Calendar.MONTH)==9)//set month as required
 {
  cl.add((Calendar.DATE),1);
  if(cl.get(Calendar.DAY_OF_MONTH)==k)
  System.out.print("\t"+cl.get(Calendar.DAY_OF_MONTH)+"*");
  else
  {
   if(cl.get(Calendar.MONTH)==9)//set month as required
   System.out.print("\t"+cl.get(Calendar.DAY_OF_MONTH));
   }
  if(cl.get(Calendar.DAY_OF_WEEK)==7)
  System.out.println();
  }
 }
}
