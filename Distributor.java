import java.util.ArrayList;

public class Distributor implements Observable { //class ini implemen dari class Observable
    private ArrayList<Observer> residents = new ArrayList<>(); //create objek resident/warga, for semua method bisa diberikan pada resident 
    
    //overide semua method yang ada pada class observable
    @Override
    public void addObserver(Observer observer) {
        residents.add(observer);
    }

     @Override
    public void removeObserver(Observer observer) {
        residents.remove(observer);
    }

    @Override
    public void notifikasi(String s) {
        for (Observer resident : residents) {
            resident.update(s);
        }
    }
}

/*
class ini adalah subjek dari design OBSERVER, dimana subjeknya disini adalah distributor atau penyalur dari
sembako untuk warga nantinya 

*/