
package sortingusingthreads;

import java.util.Arrays;

public class SortingThread extends Thread
{
    int [] a;
    
    SortingThread(int [] a)
    {
        this.a = a;
    }
    
    public void run()
    {
        Arrays.sort(a);
    }
}
