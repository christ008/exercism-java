import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        for (String myCard : myCollection) {
            if (!theirCollection.contains(myCard) && !myCollection.containsAll(theirCollection)) {
                return true;
            }
        }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commons = new HashSet<>(collections.getFirst());
        for (var collection : collections) {
            commons.retainAll(collection);
        }
        return commons;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        for (var collection : collections) {
            allCards.addAll(collection);
        }
        return allCards;
    }
}
