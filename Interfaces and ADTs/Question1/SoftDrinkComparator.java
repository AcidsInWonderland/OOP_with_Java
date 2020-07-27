import java.util.Comparator;

public class SoftDrinkComparator implements Comparator<SoftDrink>{
   public int compare(SoftDrink s1, SoftDrink s2) {
       int nameCmp = s1.name.compareTo(s2.name);
   if (nameCmp != 0){
   return nameCmp;
   }
   int colorCmp = s1.color.compareTo(s2.color);
   if (colorCmp != 0) {
   return colorCmp;
   }

   return Double.compare(s1.volume, s2.volume);
   }
}
