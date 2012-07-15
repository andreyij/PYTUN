package org.pytun.execution.asl;

import java.util.ArrayList;

import org.pytun.execution.ExecutionEnv;
import org.pytun.execution.Buffer;

public class Program {

	private ArrayList<Procedure> procedures;
	private Procedure entryPoint;

	public Program() {
		setEntryPoint(null);
		procedures = new ArrayList<Procedure>();
	}

	public Procedure getEntryPoint() {
		return entryPoint;
	}

	public void setEntryPoint(Procedure entryPoint) {
		this.entryPoint = entryPoint;
	}
	
	public void addProcedure(Procedure proc) {
		procedures.add(proc);
	}
	
	public Procedure getProcedure(String name) {
		
		for (Procedure p : procedures) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		
		return null;
	}
	
	public Buffer execute() {
		
		if (entryPoint == null) {
			System.out.println("Exec error: null ASL entry point!");
			return null;
		}

		ExecutionEnv env = new ExecutionEnv();
		env.setProgram(this);
		
		if (entryPoint.execute(env)) {
			return env.getReturnBuffer();
		} else {
			System.out.println("ASL program execution failed!");
		}
		
		return null;
	}
	
	public String toString() {
		
		String text = "";
		
		text += "MAIN " + entryPoint.toString();
		
		for (Procedure p : procedures) {
			text += "\n\n" + p.toString();
		}
		
		return text;
	}
}
