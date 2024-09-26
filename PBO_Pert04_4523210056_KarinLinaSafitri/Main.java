public class Main {
    public static void main(String[] args) {
        Handphone handphone = new Handphone("Samsung", "Galaxy S21");
        handphone.nyalakan();
        handphone.matikan();
        handphone.kirimPesan("081234567890", "Hai Apa Kabar ibu?");
        handphone.kirimPesan("081234567890", "081987654321", "Hai apa kabar papa?");
        String[] daftarNomor = {"081234567890", "081987654321", "081345678901"};
        handphone.kirimPesan(daftarNomor, "This is a group message.");
        FeaturePhone featurePhone = new FeaturePhone("Nokia", "3310");

        featurePhone.nyalakan();
        featurePhone.matikan();
        featurePhone.mainGameSnake();

       
        Smartphone smartphone = new Smartphone("Apple", "iPhone 14");

        smartphone.nyalakan();
        smartphone.matikan();

       
        smartphone.kirimPesan("081234567890", "This is a message from a smartphone.");
        smartphone.kirimPesan("Karin@gmail.com", "Subject Test", "This is the email content from smartphone.");

  
        smartphone.aksesInternet();
    }
}
