import java.util.Scanner;

public class pig
{
    public static void main (String []arg){
        //  Scanner input = new Scanner (System.in);
        //   System.out.print("enter your fav expression");
        //   String saying =input.nextLine();
        //  int spaceNum=0;
        //  int startNum=0;
        
        //for(int i=0; i<saying.length();i++){
        //   if (saying.charAt(i)==' '){
        //      
        //     System.out.println(saying.substring(startNum,i));    
        //            }
        //  }
        //   System.out.println(saying.substring(startNum));
        
        
        //String word = new String ("mia");
        //System.out.println(word);
        //word=word.concat("m");
        //word=word.substring(1);
        //System.out.println(word);
        //word=word.concat("ay");
        //System.out.println(word);
        
        //input
        Scanner input = new Scanner (System.in);    
        System.out.print("enter your fav expression ");
        String saying = input.nextLine();
        saying = saying.toLowerCase();
        saying = saying.concat(" ");
        //final
        String p = new String ();
        
        //temp changes
        String temp = new String();
        temp=saying; 
        String temp2 = new String();
        
        
        int startNum=0;
        int i = 0;
        int num= 0;
         for(int ii=0; ii<saying.length();ii++){
               if (saying.charAt(ii)==' '){
                       temp = saying.substring(startNum, ii);
                       
                       startNum = ii+1; 
                       if (temp.charAt(0) == 'a' || temp.charAt(0) == 'e' || temp.charAt(0) == 'i' || temp.charAt(0) == 'o' || temp.charAt(0) == 'u') {
                              i=ii;
                           p= p.concat(temp);
                              p= p.concat("yay");
                              p= p.concat(" ");
                              
                       } else {
                               i=ii-i-1;
                           temp2=temp.substring(1,i);
                               temp=temp.substring(0,1);
                               p=p.concat(temp2);
                               p=p.concat(temp);
                               p= p.concat("ay");
                               p= p.concat(" ");
                               i=ii;
                        }
               }
        }
        System.out.println(p);
         }
    }


