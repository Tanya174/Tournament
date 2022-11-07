import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GameTest {

    @Test
    public void shouldFirstPlayerBeStrength() {
        Game game = new Game();
        Player player1 = new Player(1, "Sasha", 87);
        Player player2 = new Player(2, "Zhenya", 7);
        game.register(player1);
        game.register(player2);

        int actual = game.round("Sasha", "Zhenya");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondPlayerBeStrenght() {
        Game game = new Game();
        Player player1 = new Player(1, "Sasha", 87);
        Player player2 = new Player(2, "Zhenya", 99);
        game.register(player1);
        game.register(player2);

        int actual = game.round("Sasha", "Zhenya");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayersBeWithEqualStrenght() {
        Game game = new Game();
        Player player1 = new Player(1, "Sasha", 5);
        Player player2 = new Player(2, "Zhenya", 5);
        game.register(player1);
        game.register(player2);

        int actual = game.round("Sasha", "Zhenya");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFirstPlayerNotRegistered() {
        Game game = new Game();
        Player player1 = new Player(1, "Sasha", 5);
        Player player2 = new Player(2, "Zhenya", 5);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Sasha", "Zhenya");
        });
    }

    @Test
    public void shouldSecondPlayerNotRegistered() {
        Game game = new Game();
        Player player1 = new Player(1, "Sasha", 5);
        Player player2 = new Player(2, "Zhenya", 5);
        game.register(player1);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Sasha", "Zhenya");
        });
    }

    @Test
    public void shouldBothPlayerNotRegistered() {
        Game game = new Game();
        Player player1 = new Player(1, "Sasha", 5);
        Player player2 = new Player(2, "Zhenya", 5);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Sasha", "Zhenya");
        });
    }
}
