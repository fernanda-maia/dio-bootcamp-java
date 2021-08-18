package datas.model;

import java.util.Objects;

public class Obj extends TreeOBJ<Obj>{

    Integer value;

    public Obj(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(value, obj.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Obj obj) {
        return this.value.compareTo(obj.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
