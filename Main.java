class Main {
    public static void main (String[] args) {
         
        Observable desa = new Distributor(); //membuat objek baru dari class distributor/penyalur/subjek
        //membuat 3 objek sebagai observer yang menerima sembako dari subjek/distributor
        Observer wargaSatu = new Resident("Warga 1 (Sofia Safira)");
        Observer wargaDua = new Resident("Warga 2 (Sri Ulina Raftaini)");
        Observer wargaTiga = new Resident("Warga 3 (Sausan Nabilah)");

        desa.addObserver(wargaSatu);
        desa.addObserver(wargaDua);
        desa.addObserver(wargaTiga);

        desa.notifikasi("sembako anda dapat dijemput sekarang, "); //memanggil notifikasi yang disebarkan subjek/distributor
       

    }
}

/**
Share Groceries (Pembagian Sembako)

Pada kasus ini, warga(observer) akan mendapatkan notifikasi "Observer Pattern" berupa sembako dengan jenis sembakonya. 
Notifikasi berasal dari distributor/subjek
Jenis sembako disini diimplementasikan sebagai "Decorator Pattern", jenis atau dekornya disini adalah terdapat 
tambahan buah-buahan dan sayur-sayuran pada tiap-tiap warga. 

 */