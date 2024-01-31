/* Parts Worker Test Program */
public class PartsWorkerTest {
   public static void main(String[] args) {
   
      PartsWorker partsWorker = new PartsWorker(
         "David", "Collins", "8563045D", 5.00, 78, 250, 50);
      
      // Test get methods
      System.out.println("First Name: " + partsWorker.getFirstName());
      System.out.println("Last Name: " + partsWorker.getLastName());
      System.out.println("SSN: " + partsWorker.getSocialSecurityNumber());
      System.out.println("Payment per Piece: " + partsWorker.getPaymentPerPiece());
      System.out.println("Num Pieces Produced: " + partsWorker.getNumPiecesProduced());
      System.out.println("Fixed Bonus Amount: " + partsWorker.getFixedBonusAmount());
      System.out.println("Num Pieces for Bonus: " + partsWorker.getNumPiecesForBonus());
      
      // Test isEligibleForBonus method
      System.out.println("Eligible for bonus: " + partsWorker.isEligibleForBonus());
      
      // Test earnings method
      double earnings = partsWorker.earnings();
      System.out.printf("Earnings for the week: €%.2f\n", earnings);
      
      // Test getBonusPieces and getFixedBonusAmount1 methods
      int bonusPieces = partsWorker.getBonusPieces();
      double bonusAmount = partsWorker.getFixedBonusAmount1();
      System.out.printf("Bonus pieces: %d\n", bonusPieces);
      System.out.printf("Bonus amount: €%.2f\n", bonusAmount);
      
   }
}

