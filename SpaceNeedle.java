public class SpaceNeedle {
   //public static final SIZE
   public static void main (String[] args) {
      needle();
      top();
      bottom();
      needle();
      neck();
      top();
   }
   public static void needle() {
      for (int i=1; i<=4; i++) {
         for(int j=1; j<=12; j++){
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   public static void top() {
      for (int i=1; i<=4; i++) {
         for (int j=1; j<=-3*i+12; j++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         for (int k=1; k<=3*i-3; k++) {
            System.out.print(":");
         }
         System.out.print("||");
         for (int l=1; l<=3*i-3; l++) {
            System.out.print(":");
         }
         System.out.println("\\__");
      }
      System.out.print("|");
      for (int j=1; j<=24; j++) {
         System.out.print ("\"");
      }
      System.out.println("|");
   }
   public static void bottom() {
      for (int i=1; i<=4; i++) {
         for (int j=1; j<= 2*i-2; j++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for (int k=1; k<= -2*i+13; k++) {
            System.out.print("/\\");
         }
         System.out.println("_/");
      }
   }
   public static void neck() {
      for (int i=1; i<=16; i++) {
         for (int j=1; j<=9; j++) {
            System.out.print(" ");
         }
         for (int k=1; k<=2; k++) {
            System.out.print("|%%|");
         }
         System.out.println();   
      }   
   }
}

            