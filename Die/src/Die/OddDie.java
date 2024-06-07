package Die;

class OddDie extends Die {

    void roll() {
        super.roll();
        if (this.getNumber() % 2 == 0) {
            this.setNumber(this.getNumber() - 1);
        }
    }
}