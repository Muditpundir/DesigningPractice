package VisitorDesignPattern.Visitor;

import VisitorDesignPattern.Patient.ChildPatient;
import VisitorDesignPattern.Patient.FemalePatient;
import VisitorDesignPattern.Patient.OldPatient;

public class Doctgor implements  Visitor{

    @Override
    public void visit(ChildPatient patient) {
        System.out.println("Vising child patient");
    }

    @Override
    public void visit(OldPatient patient) {
      System.out.println("Vising old patient");
    }

    @Override
    public void visit(FemalePatient patient) {
    System.out.println("Visiting female patient");
    }
}
