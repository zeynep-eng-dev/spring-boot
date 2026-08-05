
public interface IPaymentService { //Ödeme işlemleriyle ilgili servislerin hangi kurallara uyacağını belirleyen bir sözleşmedir (interface).
	
	 public void processPayment(double amount);
	// Bu interface'i implement edecek (uyarlayacak) her sınıfın, dışarıdan double türünde bir miktar (amount) alarak ödeme
	 //işlemini gerçekleştiren bu metodu kendine göre doldurması gerektiğini söyler.	

}
