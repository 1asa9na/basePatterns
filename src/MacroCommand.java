public abstract class MacroCommand implements Command {
    protected Command cmd;

    public MacroCommand(Command cmd) {
        this.cmd = cmd;
    }
}
