import java.util.Scanner;

public class pig
{
    public static void main (String []arg){
        
        //input
        Scanner input = new Scanner (System.in);    
        System.out.print("enter your fav expression ");
        String saying = input.nextLine();
        saying = saying.toLowerCase();
        saying = saying.concat(" ");
        //final statement 
        String p = new String ();
        
        //2nd for loop
        int q=0;
        char result;
        
        //temp changes
        String temp = new String();
        String temp2 = new String();
        
        int startNum=0;
         for(int ii=0; ii<saying.length();ii++){
               if (saying.charAt(ii)==' '){
                       temp = saying.substring(startNum, ii);
                       startNum = ii+1; 
                       if (temp.charAt(0) == 'a' || temp.charAt(0) == 'e' || temp.charAt(0) == 'i' || temp.charAt(0) == 'o' || temp.charAt(0) == 'u') 
                       {
                           p= p.concat(temp);
                           p= p.concat("yay");
                           p= p.concat(" ");   
                       } 
                       else
                       {           
                          
                           boolean test=false;
                     
                           for (q=1;test!=true; q++){
                            if (temp.charAt(q)=='a'||temp.charAt(q)=='e'||temp.charAt(q)=='i'||temp.charAt(q)=='o'||temp.charAt(q)=='u' || temp.charAt(q)=='y'){
                                    test=true;
                                }
                            }
                            //System.out.println("q is @ " + temp + " "+q);
                            
                            
                               temp2=temp.substring(q-1);
                            //System.out.println("temp2 is @ " +temp + " "+temp2);
                               temp=temp.substring(0,q-1);
                           // System.out.println("temp is "+temp);
                               p=p.concat(temp2);
                               p=p.concat(temp);
                               p= p.concat("ay");
                               p= p.concat(" ");
                             
                           
                        }
                }
         }
        System.out.println("in pig latin " +saying+ "is:");
         System.out.println(p);
    }
}