public class App {
    public static void main(String[] args) throws Exception {
        Mediator mediator = new Mediator();
        Field field = new Field(mediator);
        mediator.setField(field);

        Player player1 = new Player("Player 1", mediator);
        Player player2 = new Player("Player 2", mediator);
        mediator.addPlayer(player1);
        mediator.addPlayer(player2);
        player1.move(1, 2);
        player2.move(3, 4);
        player1.shoot(player2);
        player2.shoot(player1);
    }
}
