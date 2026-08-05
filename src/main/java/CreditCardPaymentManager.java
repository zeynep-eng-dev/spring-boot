
public class CreditCardPaymentManager implements IPaymentService {
	// Kredi Kartı ile ödeme yapan bağımlılık sınıfı
	 public void processPayment(double amount) {
		System.out.println(amount+" tl kredı kartında çekıldı.");
	}

}
//implements IPaymentService: Bu sınıf, az önce baktığımız IPaymentService arayüzünün (interface) kurallarını kabul eder 
//ve "ben bu sözleşmedeki metodları dolduracağım" der.