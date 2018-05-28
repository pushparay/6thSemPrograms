import java.util.*;
class Test3
{
        public static void main(String[] args)
        {
                int i;
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter a String");
                String s=scan.nextLine();
                String[] s2=s.split(" ");
                for(String s3 : s2)
                {
                        char[] ch=s3.toCharArray();
                        for(i=0;i<ch.length;i++)
                        {
                                if(i%2==0)
                                        System.out.print(Character.toUpperCase(ch[i]));
                                else
                                        System.out.print(ch[i]);

                        }
                        System.out.print(" ");
                }
        }

}

