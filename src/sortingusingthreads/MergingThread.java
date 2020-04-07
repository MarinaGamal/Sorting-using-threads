
package sortingusingthreads;

public class MergingThread extends Thread
{
    int [] a;
    int [] b;
    int [] c;
    
    public MergingThread(int[] a,int[] b, int[] c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        //c = new int[a.length + b.length];      
    }
    
    public void run()
    {
        int i=0;
        int j=0;
        int k=0;
        
        while (i<b.length && j<c.length)
        {
            if(b[i]<= c[j])
            {
                a[k] = b[i];
                k++;
                i++;
            }
            else
            {
                a[k] = c[j];
                j++;
                k++;
            }
        }
        
        while (i < b.length)
        {
            a[k] = b[i];
            i++;
            k++;
        }

        while (j < c.length)
        {
            a[k] = c[j];
            j++;
            k++;
        }   
    }
    
//    public int [] getArray()
//    {
//        return c;
//    }
}
