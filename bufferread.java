import java.io.*;
class BufferRead
{
public static void main(String []args) throws IOException
    {
        char c;
        int i;
        BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press a to quit ");
        do{
            i=b1.read();
            c=(char)(i);
            System.out.println(c+"--->"+ i);
        }
        while(c!='a');
        
    }
}
