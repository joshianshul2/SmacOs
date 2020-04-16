import java.io.*;
class TestRuntime2
{
    public static void main(String []ars)
    {
        try
        {
            Runtime r1=Runtime.getRuntime().exec("Screen Shot 2017-06-20 at 6.04.33 PM.jpj");
;
 //            Process p1= r1.exec("open,Screen Shot 2017-06-20 at 6.04.33 PM.jpj");
            //p1.waitFor();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        System.out.println("Bye ");
    }
}
/*
 O/P:
 java.io.IOException: Cannot run program "notepad.exe": error=2, No such file or directory
 Bye
 */
