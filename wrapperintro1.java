class Wrapperintro1 // float;
{
   public static void main(String args[])
    {
        Float f1=new Float ("10.5"); // if "HEllo" is there then their will be be NumFormat exception;
        Float f2=new Float (10.5f);
        //Float f3=new Float ();
        Float f4=new Float(10/0.0);
        Float f5=new Float (0.0/0.0);
        Float f6=new Float (10/0.0);
        Float f7=new Float (10.0/10.0);
        System.out.println(f1);
        System.out.println(f2);
        //System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);
        System.out.println(f4.isNaN()); // return boolean value ;
        System.out.println(f4.isInfinite());
        System.out.println(f5.isNaN());
        System.out.println(f5.isInfinite());
    }
}
/*
 10.5
 10.5
 Infinity
 NaN
 Infinity
 1.0
 false
 true
 true
 false
*/
