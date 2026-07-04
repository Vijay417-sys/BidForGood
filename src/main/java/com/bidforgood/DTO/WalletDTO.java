package com.bidforgood.DTO;

public class WalletDTO {
	  private int walletId;
	    private int userId;
	    private double balance;
	    private String updatedAt;
	    
		@Override
		public String toString() {
			return "WalletDTO [walletId=" + walletId + ", userId=" + userId + ", balance=" + balance + ", updatedAt="
					+ updatedAt + "]";
		}
		public int getWalletId() {
			return walletId;
		}
		public void setWalletId(int walletId) {
			this.walletId = walletId;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

}
