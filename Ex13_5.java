public class Ex13_5
{
    public static void main(String args[])
    {
        int num=5;
        int[] d = {3, 0, 0, 1}; // in java when we build a array variable to use type+[] and = {a, b, c}
        
        // System.out.println(num+ "/" + d[i] + "= " + num/d[i]); //opera
        for(int i=0; i<d.length; i++){
            try
            {
                int ans = num / d[i]; // can not only write expression(表達式), need to write a function
                System.out.println(num+ "/" + d[i] + "= " + num/d[i]);
            }
            catch(ArithmeticException e)
            {   
                if(d[i] == 0)
                {
                    System.out.println("除數為0不計算");

                }
            }
            // finally{} // not  necessary
        }
    }
}
