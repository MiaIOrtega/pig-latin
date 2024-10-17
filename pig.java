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
    String saying =input.nextLine();
    int spaceNum=0;
    int startNum=0;
    String add = " ";
    String letter= " ";
        int i = 0;
        int num= 0;
     for(int ii=0; i<saying.length();i++){
           if (saying.charAt(ii)==' '){
              num= saying.length ();
              if (saying.charAt(ii)=='a') {
            add= saying.substring(0,i);
            saying=saying.concat("ay");
            System.out.println(saying.substring(startNum,num));    
            
         }
         else if (saying.charAt(ii)=='e')
         {
             add= saying.substring(0,i);
            saying=saying.concat("ay");
            System.out.println(saying.substring(startNum,num));    
            
            }
             System.out.println(saying.substring(startNum,ii));    
                    }
        
                }
       // if (saying.charAt(i)=='a') {
          //  add= saying.substring(0,i);
         //   saying=saying.concat("ay");
           // System.out.println(saying.substring(startNum,i));      
        // }
       //  else if (saying.charAt(i)=='e')
        // {
         //    add= saying.substring(0,i);
         //   saying=saying.concat("ay");
         //   System.out.println(saying.substring(startNum,i));    
            
          //  }
         //   else if (saying.charAt(i)=='i')
         //{
             
         //   saying=saying.concat("ay");
         //   System.out.println(saying.substring(startNum,i));    
            
          //  }
          //  else if (saying.charAt(i)=='o')
        // {
             
          //  saying=saying.concat("ay");
         //   System.out.println(saying.substring(startNum,i));    
            
           // }
          //  else if (saying.charAt(i)=='u')
         //{
             
          //  saying=saying.concat("ay");
          //  System.out.println(saying.substring(startNum,i));       
         }
    }


