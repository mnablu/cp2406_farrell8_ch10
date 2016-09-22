import javax.swing.*;
public class FixDebugPhoneBook extends FixDebugBook
{
   private String area;
   private String size;
   private final int CUTOFF = 30;
   private int pages = 0;

   FixDebugPhoneBook(int in_pages, String city)
   {
      pages = in_pages;

      area = city;
      if(pages < CUTOFF)
         size = "big";
      else
         size = "small";
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book."); 
   }
}