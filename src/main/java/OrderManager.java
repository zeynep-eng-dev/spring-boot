public class OrderManager {
    private final IPaymentService paymentService;

    // Constructor (Yapıcı Metot) - Ödeme servisini dışarıdan zorunlu alıyoruz
    public OrderManager(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void completeOrder(double totalAmount) {
        System.out.println("Sipariş hazırlanıyor...");
        paymentService.processPayment(totalAmount);
        System.out.println("Sipariş başarıyla tamamlandı!");
    }
}

//completeOrder Metodu: Sipariş sürecini yönetir. Önce hazırlık mesajı basar, ardından enjekte edilen ödeme servisinin processPayment metodunu tetikleyerek
//parayı çeker ve en son siparişin tamamlandığını bildirir.
