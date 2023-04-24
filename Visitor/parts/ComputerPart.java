package Visitor.parts;

import Visitor.parts.visitInterface.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
