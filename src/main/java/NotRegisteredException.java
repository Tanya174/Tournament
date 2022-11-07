public class NotRegisteredException extends RuntimeException {

    public NotRegisteredException(String PlayerName) {
        super("Player with name: " + PlayerName + " not found");
    }
}
