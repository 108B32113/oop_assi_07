public class Ex13_2
{
    public static void main(String[] args)
    {
        for(;;) // ###could not added any initial value but must been added semicolon // or we can directly use while loop
        {
            int num=12, den=0;

            if(den == 0)
            {
                System.out.println("除數為0");
                // continue; // pass backward instruction in this condition of loop
                //           // continuse means navigate to next iteration(迭代)
                break; // end of this condition
            }

            int ans = num/den;
            break; // end of this loop
        }
        
        System.out.println("end of main()!!");    
    }
}
