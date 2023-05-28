public class ModularHash implements HashFactory<Integer> {
    public ModularHash() {
        throw new UnsupportedOperationException("Replace this by your implementation");
    }

    @Override
    public HashFunctor<Integer> pickHash(int k) {
        throw new UnsupportedOperationException("Replace this by your implementation");
    }

    public class Functor implements HashFunctor<Integer> {
        final private int a;
        final private int b;
        final private long p;
        final private int m;

        public Functor(int a, int b, long p, int m) {
            this.a = a;
            this.b = b;
            this.p = p;
            this.m = m;
        }

        @Override
        public int hash(Integer key) {
            throw new UnsupportedOperationException("Replace this by your implementation");
        }

        public int a() {
            return a;
        }

        public int b() {
            return b;
        }

        public long p() {
            return p;
        }

        public int m() {
            return m;
        }
    }
}
