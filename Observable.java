interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifikasi(String s);
}

//class ini merupakan interface dari class Distributor