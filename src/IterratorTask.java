import java.util.Iterator;
import java.util.function.Predicate;

class Filteringiterator<E> implements Iterator<E>{
    private Iterator<E> base_iterator;
    private Predicate< E > filter;
    private  E iteratorNext;
    private boolean iteratorHasNext;

    public Filteringiterator(Iterator< E > base_iterator, Predicate<E>filter ) {
        this.base_iterator=base_iterator;
        this.filter=filter;
        findNextValid();
    }



    private void findNextValid() {
        iteratorHasNext = base_iterator.hasNext();

        while (base_iterator.hasNext()) {
            iteratorNext = base_iterator.next();
System.out.println("testing"+iteratorNext);
            if (filter == null || filter.test(iteratorNext)) {
                System.out.println("ok");
                iteratorHasNext = true;
                break;

            }
            System.out.println("not OK");
            iteratorHasNext=false;
            break;
        }
    }


    @Override
    public boolean hasNext() {
if (iteratorHasNext)
    return true;
        findNextValid();
        if (iteratorHasNext)
            return true;
        findNextValid();
        return iteratorHasNext;
    }


    @Override
    public E next() {
        E nextValue;
        if(iteratorHasNext){
            nextValue =iteratorNext;
        findNextValid();
        return nextValue;}
        nextValue = iteratorNext;
        findNextValid();
        return nextValue;
    }



    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public final class FilteringIterator<E> implements Iterator<E> {

        public FilteringIterator(final Iterator<E> iterator, Predicate<E> filter) {

            }


        /**
         * Returns true if there is next element matching predicate
         */
        @Override
        public boolean hasNext() {
            return iteratorHasNext;





        }

        @Override
        public E next() {
            return null;
        }

    }


        }




