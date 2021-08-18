package datas.model;

public abstract class TreeOBJ<T> implements Comparable<T>{

    public abstract boolean equals(Object obj);
    public abstract int hashCode();
    public abstract int compareTo(T obj);
    public abstract String toString();

}
