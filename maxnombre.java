import java.util.Scanner;

/**
 *
 * @author Landry
 */
public class maxnombre {
           //fonction creer un tableau
    public static void creerTableau(int nombre,int tab[])
    {
        
           for(int i=0;i<nombre;i++)
         {
        
             Scanner sc=new Scanner(System.in); 
             System.out.print("Entrer nombre n° "+i+":");
             tab[i]=sc.nextInt();
             
                 
         }
        
        
    }
    //fonction afficher contenu tableau
     public static void AfficherTableau(int tab[],int nombre)
    {
        
          for(int i=0;i<nombre;i++)
         {
        
              System.out.println(tab[i]);
                 
         }
       
        
        
    }
     //fonction avoir maximum tableau
     public static int MaxTableau(int tab[],int max)
    {
        
          for(int i=0;i<tab.length-1;i++)
         {
        
             if(tab[i]<tab[i+1])
             {
                 max=tab[i+1];
             }
                 
         }
          return max;
       
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int nb,max=0,nombre;
         
              
         Scanner sc=new Scanner(System.in); 
         System.out.print("Combien de nombre voulez vous saisir :");
         nombre=sc.nextInt();
         int tab[] = new int[nombre];
         //appel de la fonction creer tableau
         creerTableau(nombre,tab);
         //appel de la fonction afficher contenu tableau
         System.out.println("Les nombres saisis sont :");
         AfficherTableau(tab,nombre);
         //appel de la fonction avoir maxumum tableau
         MaxTableau(tab,max);
              
         System.out.println("Le maximum des nombres saisis est :"+MaxTableau(tab,max));
    }
}