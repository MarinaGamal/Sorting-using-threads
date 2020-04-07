
package sortingusingthreads;

import java.util.Random;

public class SortingUsingThreads 
{
    public static void main(String[] args)
    {
      Random r = new Random();
      int [] a = new int [r.nextInt(10)];
      int [] b = new int [a.length/2];
      int [] c = new int [a.length-b.length];
      
      
      int j=0;
      for(int i=0;i<a.length;i++)
      {
          a[i] = r.nextInt(100);
      }
     
      for(int i=0;i<a.length/2; i++)
      {
          b[i] =a[i];
      }
      
      for(int i=(a.length)/2; i<a.length; i++)
      {
          c[j] =a[i];
          j++;
      }
      
      for(int i =0; i<a.length;i++)
      {
          System.out.println(a[i]);
      }
      
      System.out.println("-----------------");
      
      SortingThread t1 = new SortingThread(b);  
      t1.run();
      SortingThread t2 = new SortingThread(c);  
      t2.run();
      MergingThread m = new MergingThread(a,b,c);
      m.run();
      
      //a = m.getArray();
      
      for(int i =0; i<a.length;i++)
      {
          System.out.println(a[i]);
      }
      

    }
    
}
