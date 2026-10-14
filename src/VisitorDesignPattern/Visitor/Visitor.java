package VisitorDesignPattern.Visitor;

import VisitorDesignPattern.Patient.ChildPatient;
import VisitorDesignPattern.Patient.FemalePatient;
import VisitorDesignPattern.Patient.OldPatient;

public interface Visitor {
    public void visit(ChildPatient patient);
    public void visit(OldPatient patient);
    public void visit(FemalePatient patient);
}
