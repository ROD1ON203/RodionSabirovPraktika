import java.util.*;
class Film
{
    String name;
    int budjet;
}

public class JavaFilms {


    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in,"cp1251");
        System.out.println("Vvedite kolichestvo filmov");
        int kol = in.nextInt();
        Film [] film =new Film [kol];
        in.nextLine();
        for (int i = 0; i < kol; i++) {
            film[i] = new Film();
            System.out.println("Vvedite nazvanie " + (i+1) + "  filma - ");
            film[i].name = in.nextLine(); 
               System.out.println("Vvedite budjet " + (i+1) + " filma - ");
           film[i].budjet = in.nextInt();
            in.nextLine();
        }
                  int maxbudjet  = film[0].budjet;         
     for (int x = 0; x<film.length; x++) 
     {             
         if (maxbudjet < film[x].budjet)   {              
             maxbudjet  = film[x].budjet;
          System.out.print("Film s maximalnim budjetom " + film[x].name + " "+ film[x].budjet+" \n");
         System.out.print("Film nomer 2" + film[x+1].name + " "+ film[x+1].budjet+" \n");
         System.out.print("Film nomer 3 " + film[x-1].name + " "+ film[x-1].budjet+" \n");}}
    
    }}