import java.util.*;

class RandomizedSet {
    private HashSet<Integer> set;
    private Random random;

    public RandomizedSet() {
        set = new HashSet<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (!set.contains(val)) {
            set.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(set.size());
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < randomIndex; i++) {
            it.next();
        }
        return it.next();
    }
}
