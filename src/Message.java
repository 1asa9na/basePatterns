public class Message {
    private String type;
    private Player player;
    private Object data;

    public Message(String type, Player player, Object data) {
        this.type = type;
        this.player = player;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public Player getPlayer() {
        return player;
    }

    public Object getData() {
        return data;
    }
}
