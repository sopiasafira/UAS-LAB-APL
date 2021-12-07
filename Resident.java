public class Resident implements Observer { //implemet class observer
    private String warga;

    public Resident (String warga){
        this.warga=warga;
    }
    @Override //overide method update supaya notifikasi dapat diterima oleh resident
    public void update(String s) {
        Groceries type = new Fruit(new Vegetable(new Type())); //implementasi decorator pattern       
        System.out.println("Notifikasi Kepada " + this.warga+ " dari kepala dusun: "+s+ "" +type.decorate());
    }

}
 /*
 class ini merupakan class residdent/warga sebagai obeserver, notifikasi pada warga akan diedit pada class ini
 Class ini juga sekaligus digunakan untuk mengimplementasi Design Decorator Pattern, 
 pada baris 10 this.warga berlaku untuk seluruh warga dan type.decorate untuk memanggil method decorate pada class type
 method decorate tersebut telah mendecorasi class Vegetable dan class Fruit
 */