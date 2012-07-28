package org.pytun.console;

import java.util.Scanner;

public class CommandBuilder {
	private Scanner in;
	private State state;

	enum State {
		NONE, STRING, COMMENT, FINISHED
	}

	public CommandBuilder() {
		in = new Scanner(System.in);
	}

	public String readCommand() {
		state = State.NONE;
		String query = new String("");
		/* continue to read lines until a command is complete */
		while (state != State.FINISHED) {
			if (!query.equals("")){
				/* add end of line which was stripped by the last iteration */
				query += System.getProperty("line.separator");
			}
			query += readLine();
		}
		return query;
	}

	private String readLine() {
		String line = in.nextLine();

		if (state == State.NONE) {
			/* trim white spaces but only if this is the first line */
			line = line.replaceAll("^\"|\"$", "");
		}

		if (line.startsWith("?") && state == State.NONE) {
			state = State.FINISHED;
			return line;
		}

		for (int i = 0; i < line.length(); i++) {
			switch (line.charAt(i)) {
			case '\'':
				switch (state) {
				case STRING:
					/* if we're inside a string, this marks the end of it */
					state = State.NONE;
					break;
				case NONE:
					/* beginning of a string */
					state = State.STRING;
					break;
				}
			case '/':
				if (state == State.NONE && line.charAt(i + 1) == '*') {
					/* beginning of a comment */
					state = State.COMMENT;
					i += 1;
				}
				break;
			case '*':
				if (state == State.COMMENT && line.charAt(i + 1) == '/') {
					/* end of a comment */
					state = State.NONE;
					i += 1;
				}
				break;
			case ';':
				if (state == State.NONE) {
					/* end of a statement */
					if (i != line.length() - 1) {
						System.out.println("Warning: Ignoring");
						System.out.println("'" + line.substring(i + 1) + "'");
						System.out.println("because statement is "
								+ "already complete ");
					}
					state = State.FINISHED;
					return line.substring(0, i + 1);
				}
			}
		}
		return line;
	}
}
