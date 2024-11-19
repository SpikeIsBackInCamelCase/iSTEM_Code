import java.util.Scanner;
public class mla
{
    
    public static void main(String[] args)
    {
        boolean promptTrueFalse;/*RERUN LOOP MASTER*/
          do {
            

        System.out.println ("MLA MAKER 1.3.6.1");
        System.out.println (1 + ".) Website");
        System.out.println (2 + ".) Book");
        //System.out.println (3 + ".) Book");
         Scanner input = new Scanner(System.in);
        
       
        int prompt = input.nextInt();
        promptTrueFalse = false;
        
        if (prompt == 1) {
            promptTrueFalse = true;
        }
        if (prompt == 2) {
            promptTrueFalse = true;
        }
       
        if (prompt == 1) //website
        {
        Scanner site = new Scanner(System.in); 
        System.out.println("Enter the author's First Name: ");
        String nameFirst = site.nextLine();
        System.out.println("Enter the author's Last Name: ");
        String nameLast = site.nextLine();
        System.out.println("Enter the title of the book: ");
        String title = site.nextLine();
        System.out.println("Enter the publisher of the website:");
        String pubName = site.nextLine();
        boolean accessTrueFalse = false; /*RERUN LOOP*/
        do {
            accessTrueFalse = false;
        System.out.println ("Publication Date?");
        System.out.println (1 + ".) Yes");
        System.out.println (2 + ".) No");
        Scanner temp = new Scanner(System.in);
        int access = temp.nextInt();
        
        if (access == 1) {
            accessTrueFalse = true;
            Scanner ifThan = new Scanner(System.in);
           System.out.println("Enter the year the book was published: ");
        String pubDate = ifThan.nextLine();
        System.out.println("Enter URL: ");
        String siteURL = site.nextLine();
        System.out.print( "\n\n" + nameFirst + ", ");
        System.out.print(nameLast + ". ");
        System.out.println("\"" + title + "\"" + ". ");
        System.out.print(pubName + ", ");
        System.out.print(pubDate + ".");
        System.out.print(siteURL + ", ");
       } //WITH PUBLICATION DATE
        if (access ==2) { 
            accessTrueFalse = true;
            Scanner ifThan = new Scanner(System.in);
         System.out.println("Enter the date you accessed this website: ");
        String accessDate = ifThan.nextLine();
        System.out.println("Enter URL: ");
        String siteURL = site.nextLine();
        System.out.print( "\n\n" + nameFirst + ", ");
        System.out.print(nameLast + ". ");
        System.out.println("\"" + title + "\"" + ". ");
        System.out.print(pubName + ", ");
        System.out.print(siteURL + ", ");
        System.out.print(accessDate + "."); 
        } //NO PUBLICATION DATE
        if (accessTrueFalse == false) { /*RERUN BACKBONE*/
            System.out.println("Please Enter a valid Digit");
            try {
            Thread.sleep(100);
            }
            catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            }
            System.out.println(" ");
            accessTrueFalse = true;
            
        } else {
            {break;}
        }
        } while(accessTrueFalse = true);
            }
        if (prompt == 2) //book
        {
        Scanner book = new Scanner(System.in);
        System.out.println("Enter the author's First Name: ");
        String nameFirst = book.nextLine();
        System.out.println("Enter the author's Last Name: ");
        String nameLast = book.nextLine();
        System.out.println("Enter the year the book was published: ");
        String pubDate = book.nextLine();
        System.out.println("Enter the title of the book: ");
        String title = book.nextLine();
        System.out.println("Enter the publisher of the book:");
        String pubName = book.nextLine();
        System.out.print( "\n\n" + nameFirst + ", ");
        System.out.print(nameLast + ". ");
        System.out.println(title + ". ");
        System.out.print(pubName + ", ");
        System.out.print(pubDate + ".");
        }
        
        if (promptTrueFalse == false) {
            System.out.println("Please Enter a valid Digit");
            try {
            Thread.sleep(500);
            }
            catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            }
            System.out.println(" ");
            
            
        } else {
            {break;}
        }
        } while(promptTrueFalse = true);
    }
}