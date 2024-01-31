/* Parts Worker Class Program */
public class PartsWorker extends Employee {
	   private double paymentPerPiece;
	   private int numPiecesProduced;
	   private double fixedBonusAmount;
	   private int numPiecesForBonus;

	   public PartsWorker(String first, String last, String ssn, double paymentPerPiece, int numPiecesProduced, double fixedBonusAmount, int numPiecesForBonus) {
	      super(first, last, ssn);
	      this.paymentPerPiece = paymentPerPiece;
	      this.numPiecesProduced = numPiecesProduced;
	      this.fixedBonusAmount = fixedBonusAmount;
	      this.numPiecesForBonus = numPiecesForBonus;
	   }

	   public double getPaymentPerPiece() {
	      return paymentPerPiece;
	   }

	   public void setPaymentPerPiece(double paymentPerPiece) {
	      this.paymentPerPiece = paymentPerPiece;
	   }

	   public int getNumPiecesProduced() {
	      return numPiecesProduced;
	   }

	   public void setNumPiecesProduced(int numPiecesProduced) {
	      this.numPiecesProduced = numPiecesProduced;
	   }

	   public double getFixedBonusAmount() {
	      return fixedBonusAmount;
	   }

	   public void setFixedBonusAmount(double fixedBonusAmount) {
	      this.fixedBonusAmount = fixedBonusAmount;
	   }

	   public int getNumPiecesForBonus() {
	      return numPiecesForBonus;
	   }

	   public void setNumPiecesForBonus(int numPiecesForBonus) {
	      this.numPiecesForBonus = numPiecesForBonus;
	   }

	   public double earnings() {
	      double totalPayment = paymentPerPiece * numPiecesProduced;
	      if (numPiecesProduced >= numPiecesForBonus) {
	         totalPayment += fixedBonusAmount;
	      }
	      return totalPayment;
	   }

	   public String toString() {
	      return String.format("%s %s\nsocial security number: %s\nearnings: %.2f",
	         getFirstName(), getLastName(), getSocialSecurityNumber(), earnings());
	   }

	   public void producePieces(int numPieces) {
	      numPiecesProduced += numPieces;
	   }

	   public boolean isEligibleForBonus() {
	      return numPiecesProduced >= numPiecesForBonus;
	   }

	   public int getBonusPieces() {
		   if (isEligibleForBonus()) {
			   return numPiecesProduced - numPiecesForBonus;
		   } else {
			   return 0;
		   }
	   }

	   public void setProducedPieces(int producedPieces) {
		   numPiecesProduced = producedPieces;
	   }

	   public double getFixedBonusAmount1() {
		   return fixedBonusAmount;
		}
	}

