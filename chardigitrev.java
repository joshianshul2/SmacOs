class Charrevdigit
{
    public static void main(String[] args)
    {
        int n=153,sum=0,r,s=0;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        while(sum!=0)
        {
            r=sum%10;
            switch(r)
            {
                case 0:System.out.print("ZERO  ");
                    break;
                case 1:System.out.print("ONE  ");
                    break;
                    case 2:System.out.print("TWO  ");
                    break;
                case 3:System.out.print("THREE  ");
                    break;
                case 4:System.out.print("FOUR  ");
                    break;
                case 5:System.out.print("FIVE  ");
                    break;
                case 6:System.out.print("SIX  ");
                    break;
                    
                case 7:System.out.print("SEVEN  ");
                    break;
                case 8:System.out.print("EIGHT  ");
                    break;
                case 9:System.out.print("NINE  ");
                    break;
                default:System.out.print("NOT VALID");
            }
            s=s*10+r;
            sum=sum/10;
        }
        //System.out.println("Digit are : "+s);
    }
}
