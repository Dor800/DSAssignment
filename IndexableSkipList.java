public class IndexableSkipList extends AbstractSkipList {
    final protected double probability;
    public IndexableSkipList(double probability) {
        super();
        this.probability = probability;
    }

    @Override
    public Node find(int val) {
        Node output = head;
        for (int i = output.height(); i >= 0; i--) {
            while (output.getNext(i) != null && output.getNext(i).key() < val) {
                output = output.getNext(i);
            }
        }
        return output;
    }

    @Override
    public int generateHeight() {
        int output = 0;
        while (Math.random() < this.probability && output < head.height()) {
            output++;
        }
        return output;
    }

    public int rank(int val) {
        throw new UnsupportedOperationException("Replace this by your implementation");
    }

    public int select(int index) {
        throw new UnsupportedOperationException("Replace this by your implementation");
    }
}
