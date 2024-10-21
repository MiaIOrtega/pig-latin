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
    
        Scanner input = new Scanner (System.in);    
        System.out.print("enter your fav expression");
        String saying = input.nextLine();
        saying = saying.toLowerCase();
        String p = new String ();
        String temp = new String();
        
        String temp2= new String();
        temp2=saying; 
        temp2=temp2.substring(0,1);
        int spaceNum=0;
        int startNum=0;
        int i = 0;
        int num= 0;
         for(int ii=0; ii<saying.length();ii++){
               if (saying.charAt(ii)==' '){
                       temp = saying.substring(startNum, ii);
                       startNum = i+1; 
                       if (temp.charAt(0) == 'a' || temp.charAt(0) == 'e' || temp.charAt(0) == 'i' || temp.charAt(0) == 'o' || temp.charAt(0) == 'u') {
                              temp = temp.concat("yay"); 
                              p= p.concat(temp);
                       } else {
                               p=saying.substring(1,ii);
                               p=p.concat(temp2);
                               p= p.concat("ay");
                        }
               }
        }
        System.out.println(p);
           
         }
    }


