
/**
 * Write a description of class ArrayDecoder here.
 *
 * @author Brian Huang
 * @version 9/17/19
 */
public class ArrayDecoder
{
    int[] initialArray;
    int holder; 
    int gapSpace;
    public ArrayDecoder(int[] array,int gap) //Problem #5 int gap for generalize gap
    {
        initialArray = array;
        holder = 0;
        gapSpace = gap;
    }

    private int find11()
    {
        for(int i = 0; i < initialArray.length - 1; i++)
        {
            for(int k = i + 1; k < initialArray.length; k++)
            {
                if((initialArray[k] - initialArray[i]) == gapSpace)
                {
                    holder = i;
                    return holder;
                }
                else if((initialArray[k] - initialArray[i]) > gapSpace || initialArray[k] - initialArray[i] < 0)
                //Problem #6 "initialArray[k] - initialArray[i] < 0" breaks loop if wrap around
                {
                    break;
                }
            }
        }
        return -1;
    }

    public int find111() //Problem #3 three values contianed within the array equally spaced 20 units apart
    {
        if(find11() == -1)
        {
            return -1;
        }
        for(int i = holder + 1; i < initialArray.length; i++)
        {
            if((initialArray[i] - initialArray[holder]) == gapSpace*2)
            {
                return holder;
            }
            else if((initialArray[i] - initialArray[holder]) > gapSpace*2 || initialArray[i] - initialArray[holder] < 0)
            {
                return -1;
            }
        }
        return -1;
    }

    public int find110() //Problem #4 first two elements are spaced 20 units apart and there is no element 40 units away from the first
    {
        if(find11() == -1)
        {
            return -1;
        }
        for(int i = holder + 1; i < initialArray.length; i++)
        {
            if((initialArray[i] - initialArray[holder]) > gapSpace*2 || initialArray[i] - initialArray[holder] < 0)
            {
                return holder;
            }
        }
        return -1;
    }
}
