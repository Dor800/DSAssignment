public class StringHash implements HashFactory<String> {

    public StringHash() {
        throw new UnsupportedOperationException("Replace this by your implementation");
    }

    @Override
    public HashFunctor<String> pickHash(int k) {
        throw new UnsupportedOperationException("Replace this by your implementation");
    }

    public class Functor implements HashFunctor<String> {
        final private HashFunctor<Integer> carterWegmanHash;
        final private int c;
        final private int q;

        public Functor(HashFunctor<Integer> carterWegmanHash, int c, int q) {
            this.carterWegmanHash = carterWegmanHash;
            this.c = c;
            this.q = q;
        }

        @Override
        public int hash(String key) {
            throw new UnsupportedOperationException("Replace this by your implementation");
        }

        public int c() {
            return c;
        }

        public int q() {
            return q;
        }

        public HashFunctor carterWegmanHash() {
            return carterWegmanHash;
        }
    }
}