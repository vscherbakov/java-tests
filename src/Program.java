import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Stream<Persone> personeStream = Stream.of(new Persone("Bob",  20),
                new Persone("jill",35),
                new Persone("Jhon",40),
                new Persone("Sonia",40),
                new Persone("Sergei",45));


        Map<Character, List<Persone>> map;
        map = personeStream.filter(persone -> persone.getAge()>30 ).collect(Collectors.groupingBy(p -> p.getName().charAt(0)));



        for (Character k : map.keySet()) {
            System.out.println(k);
Iterator<Persone> it0 = map.get(k).iterator();
Filteringiterator<Persone>it1 =  new Filteringiterator<Persone>(it0,(Persone persone)->persone.getAge()>30);
            while (it1.hasNext()) {
System.out.println("result>"+it1.next());
                System.out.println("================================="+ it1.hasNext());
            }



           
            }



        }

    }






