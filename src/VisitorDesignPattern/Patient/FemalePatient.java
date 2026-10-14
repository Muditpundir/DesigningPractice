package VisitorDesignPattern.Patient;


import VisitorDesignPattern.Visitor.Visitor;

public class FemalePatient implements Patient {


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
