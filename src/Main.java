import java.util.Comparator;
import java.util.stream.Stream;
class Persone{

    private String name;
    private int age;

    public Persone(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }


    @Override
    public String toString() {
        return String.format("name:%s-------age:%d",getName(),getAge());
    }
}

class PhoneComparator implements Comparator<Persone>{

    public int compare(Persone a, Persone b){


        return Character.compare( a.getName().charAt(0),b.getName().charAt(0));
    }
}