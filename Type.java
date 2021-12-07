public class Type implements Groceries{
    @Override //overide 1 method dari class Groceries
    public String decorate() {
        return "Sembako bulanan"; //mengebalikan string ini saat decorate() dipanggil
    }
}
 //class type mengimplen class Groceries