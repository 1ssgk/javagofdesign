package _21_CommandPattern;

import java.util.Stack;

public class MacroCommand implements Command {
  private final Stack<Command> commands = new Stack<>();

  @Override
  public void execute() {
    for (Command command : commands) {
      command.execute();
    }
  }

  public void append(Command cmd) {
    if (cmd != this) {
      commands.add(cmd);
    }
  }

  public void undo() {
    if (!commands.empty()) {
      commands.pop();
    }
  }

  public void clear() {
    commands.clear();
  }
}
