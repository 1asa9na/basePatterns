public class App {
    public static void main(String[] args) throws Exception {
        Command cmd1 = new MoveCommand(Direction.NORTH);
        cmd1.run();

        System.out.println("\n===============================\n");
        
        Command cmd2 = new LongMoveCommand(cmd1, 100.0);
        cmd2.run();
    }
}
