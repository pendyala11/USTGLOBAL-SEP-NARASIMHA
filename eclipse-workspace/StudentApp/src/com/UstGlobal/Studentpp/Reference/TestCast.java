package com.UstGlobal.Studentpp.Reference;

public class TestCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pen p = new Marker();
        System.out.println(p.cost);
        p.write();
        
        Marker m = (Marker)p;
        m.color();
	}

}
