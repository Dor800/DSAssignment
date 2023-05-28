public class MultiplicativeShiftingHash implements HashFactory<Long> {
    public MultiplicativeShiftingHash() {
        throw new UnsupportedOperationException("Replace this by your implementation");
    }

    @Override
    public HashFunctor<Long> pickHash(int k) {
        throw new UnsupportedOperationException("Replace this by your implementation");
    }

    public class Functor implements HashFunctor<Long> {
        final public static long WORD_SIZE = 64;
        final private long a;
        final private long k;

        public Functor(long a, long k) {
            this.a = a;
            this.k = k;
        }

        @Override
        public int hash(Long key) {
            throw new UnsupportedOperationException("Replace this by your implementation");
        }

        public long a() {
            return a;
        }

        public long k() {
            return k;
        }
    }
}
