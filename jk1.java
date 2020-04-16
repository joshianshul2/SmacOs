import java.io.*;
    class TestRuntime
 {
    public static void main(String []ars)
 {
    try
 {
    Runtime r1=Runtime.getRuntime();
       Process p1=r1.exec("notepad.exe");
      // p1.waitFor();
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
