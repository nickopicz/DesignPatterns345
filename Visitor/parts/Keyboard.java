package Visitor.parts;

import Visitor.parts.visitInterface.ComputerPartVisitor;

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
