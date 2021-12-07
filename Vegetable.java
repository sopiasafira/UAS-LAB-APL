public class Vegetable extends GroceriesDecor {
    public Vegetable(Groceries groceries) {
        super(groceries); //method super untuk merepresentasikan objek dari class induk yaitu groceries (sembako)
    }

    public String decorate() {
        return super.decorate() + this.decorateWithVegetable(); //super dan this, this sendiri untuk merepresentasikan objek dari class fruit ini
    }

    public String decorateWithVegetable(){
        return " dengan sayur-sayuran"; //mengembalikan string sayur-sayuran
    }
}

//class ini docorator kedua dari objek decorator yaitu Groceries (sembako)