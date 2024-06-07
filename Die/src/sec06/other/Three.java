package sec06.other;

import sec06.One;

public class Three {
    void print() {

        One o = new One();
        //private
        //System.out.println(o.secret);
        //default
        //System.out.println(o.roomate);
        //protected
        //System.out.println(o.child);
        //public
        System.out.println(o.anybody);
    }

}
