public abstract class GroceriesDecor implements Groceries{
    private Groceries groceries;

    public GroceriesDecor(Groceries groceries) {
        this.groceries = groceries;
    }
    
    @Override //overide method
    public String decorate(){
        return groceries.decorate();
    }
}

//class ini implemen class Groceries untuk overide method decorate nya