import java.util.*;
class Test
{
        public static void main(String[] args)
        {
                int count=0;
                int i;
                char ch1;
                char ch2;
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter a string");
                String s=scan.nextLine();
                System.out.println(s);
                String s1=s.replaceAll("\\s","");
                char[] ch=s1.toCharArray();

                 for(ch1='a',ch2='A';(ch1<='z'&ch2<='Z');ch1++,ch2++)
                  {
                          for(i=0;i<ch.length;i++)
                            {

                                if(ch1==ch[i]||ch2==ch[i])
                                count++;

                            }
                          if(count!=0)
                           {
                              System.out.println(count+""+ch1);
                              count=0;

                           }
                  }

        }
}

