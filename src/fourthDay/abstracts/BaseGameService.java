package fourthDay.abstracts;

import fourthDay.entities.Game;

public interface BaseGameService {
    void add(Game game);
    void update(Game game);
    void delete(Game game);
}
