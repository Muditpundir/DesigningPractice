package VisitorDesignPattern.Patient;


import VisitorDesignPattern.Visitor.Visitor;

public class ChildPatient implements Patient {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
