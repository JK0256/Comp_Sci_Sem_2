package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager {
   private ArrayList<Gizmo> purchases;
   private int elecNum;
   private Gizmo cheapest;
   private boolean pair;

   public OnlinePurchaseManager(){
      //this("apple", true, 10);
      purchases = new ArrayList<Gizmo>();
   }
   public OnlinePurchaseManager(String maker){
      //this(maker, true, 10);
      purchases = new ArrayList();
   }
   
   public void add(String maker, boolean isE, double cost){
      Gizmo bob = new Gizmo (maker, isE, cost);
      purchases.add(bob);
   }
   
   public Gizmo getCheapestGizmoByMaker(String mkr){
      int cheapestIndex, i;
      for (i = 0; i <= purchases.size()-1; i++){
         if((purchases.get(i).getMaker().equals(mkr)) && (purchases.get(i).getCost() < cheapest.getCost())) {
            cheapest = purchases.get(i);
            cheapestIndex = i;
         }
      }
      return purchases.get(i);
   }
   
   public int countElectronicsByMaker(String mkr){
      int i;
      for (i = 0; i <= purchases.size()-1; i++){
         if((purchases.get(i).getMaker().equals(mkr)) && (purchases.get(i).getIsE())) {
            elecNum++;
         }
      }
      return elecNum;
   }
   
   public boolean hasAdjacentEqualPair(){
      for (int i = 0; i <= purchases.size()-2; i++){
         if(purchases.get(i) == purchases.get(i+1)) {
            pair = true;
         }
         else {
            pair = false;
         }
      }
      return pair;
   }
   
   public String toString()
   {
   	return "" + purchases;
   }
}
