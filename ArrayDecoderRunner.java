
/**
 * Runner for 3.6 excercises #3-6
 *
 * @author Brian Huang
 * @version 9/17/19
 */
public class ArrayDecoderRunner
{
    public static void main (String args[])
    {
        int[] data = {10,20,31,40,55,60,65525};
        ArrayDecoder dataTester = new ArrayDecoder(data,20);
        System.out.println(dataTester.find111());
        System.out.println("Expected: 1");

        int[] data2 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,39,40,50,62};
        ArrayDecoder dataTesterTwo = new ArrayDecoder(data2,20);
        System.out.println(dataTesterTwo.find110());
        System.out.println("Expected: 19");
        
        int[] data3 = {65515,65525,-100,-20,0,9,20,31,40,55};
        ArrayDecoder dataTesterThree = new ArrayDecoder(data3,20);
        System.out.println(dataTesterThree.find110());
        System.out.println("Expected: 3");

        int[] data4 = {40, 20, 0};
        ArrayDecoder dataTesterFour = new ArrayDecoder(data4,20);
        System.out.println(dataTesterFour.find110());
        System.out.println("Expected: -1");
    }
}
 