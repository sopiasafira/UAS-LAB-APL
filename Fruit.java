public class Fruit extends GroceriesDecor {
    public Fruit(Groceries groceries) {
        super(groceries); //method super untuk merepresentasikan objek dari class induk yaitu groceries (sembako)
    }

    public String decorate() {
        return super.decorate() + this.decorateWithBuah(); //super dan this, this sendiri untuk merepresentasikan objek dari class fruit ini
    }

    public String decorateWithBuah(){
        return " dan buah-buahan"; //mengembalikan string buah-buahan
    }
}

//class ini docorator pertama dari objek decorator yaitu Groceries (sembako)