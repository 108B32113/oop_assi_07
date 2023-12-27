public class Ex13_3 
{
    public static void main(String[] args)
    {
        int num=12, den=0; // if it's declared in loop then it only be available in loop
        // int ans = num/den; // if want to try try block then we writed excepted instruction only one time in try block
        try
        {
            int ans = num/den;
        }
        catch(ArithmeticException e) // 計算錯誤例外
        {
            System.out.println("除數為0");
        }
        finally
        {
            System.out.println("end of main()!!");
        }
    }    
}
