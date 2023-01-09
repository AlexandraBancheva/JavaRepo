import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    List<T> data;
    public CustomList(){
        this.data = new ArrayList<>();
    }
    public void add(T element){
        this.data.add(element);
    }
    public T remove(int index){
        return this.data.remove(index);
    }
    public boolean contains(T element){
        return this.data.contains(element);
    }
    public void swap(int firstIndex, int secondIndex){
        Collections.swap(this.data, firstIndex, secondIndex);
    }

    public long countGreaterThan(T element){
        return this.data.stream().filter(t -> t.compareTo(element) > 0).count();
    }
    public T getMax(){
        return Collections.max(this.data);
    }
    public T getMin(){
        return Collections.min(this.data);
    }

    public void printList(){
        this.data.forEach(System.out::println);
    }
}
