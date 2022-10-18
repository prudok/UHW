package Task1;
import java.util.HashMap;

public class Student<T, V, K> {

    private T name;
    private HashMap<K, V>subjectGrades = new HashMap<K, V>();

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public HashMap<K, V> getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(HashMap<K, V> subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    public Student(T name, K key, V value) {
        this.name = name;
        subjectGrades.put(key, value);
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", subjects grades: " + getSubjectGrades();
    }
}
