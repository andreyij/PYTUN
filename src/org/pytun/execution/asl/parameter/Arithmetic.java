package org.pytun.execution.asl.parameter;

import org.pytun.execution.asl.arithmetic.ArithNode;

public class Arithmetic extends Parameter {
	
	private ArithNode arithmeticNode;
	
	public Arithmetic(ArithNode node) {
		arithmeticNode = node;
	}
	
	@Override
	public String toString() {
		return arithmeticNode.toString();
	}

	public ArithNode getArithmeticNode() {
		return arithmeticNode;
	}

	public void setArithmeticNode(ArithNode arithmeticNode) {
		this.arithmeticNode = arithmeticNode;
	}

}
