package edu.estatuas;

public class Holes {

        public short number = 0;
        public short par;

        Holes(short number, short par) {
            this.number = number;
            this.par = par;
        }


    public short getPar() {
        return this.par;
    }

    public short getNumber() {
        return this.number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public void setPar(short par) {
        this.par = par;
    }
    public String toString() {
            return  this.getNumber() + " - " + this.getPar() ;
    }
}
