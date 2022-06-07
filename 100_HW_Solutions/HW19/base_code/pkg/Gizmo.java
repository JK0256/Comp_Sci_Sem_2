package pkg;

public class Gizmo {
   private String maker;
   private boolean isE;
   private double cost;
   
   public Gizmo(){
      this("apple", true, 10);
   }
   public Gizmo(String maker){
      this(maker, true, 10);
   }
   public Gizmo(String maker, boolean isE, double cost){
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   
   public String getMaker() {
      return maker;
   }
   public boolean getIsE() {
      return isE;
   }
   public double getCost() {
      return cost;
   }
   
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
}
