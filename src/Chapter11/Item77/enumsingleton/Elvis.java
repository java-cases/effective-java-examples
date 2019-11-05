// Enum singleton - the preferred approach - Page 311
package Chapter11.Item77.enumsingleton;

import java.util.*;

public enum Elvis {
    INSTANCE;
    private String[] favoriteSongs =
            {"Hound Dog", "Heartbreak Hotel"};

    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));
    }
}