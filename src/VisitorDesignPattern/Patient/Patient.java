package VisitorDesignPattern.Patient;

import VisitorDesignPattern.Visitor.Visitor;

public interface Patient {
    public void accept( Visitor visitor);
}
