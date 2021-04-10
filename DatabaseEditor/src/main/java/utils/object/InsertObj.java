package utils.object;

import java.util.Objects;

public class InsertObj {
    String key;
    String value;


    public InsertObj(String key, String value){
        this.key = key;
        this.value = value;
    }


    public String[] getMem() {
        return new String[]{key, value};
    }

    @Override
    public String toString() {
        return "InsertObj{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public boolean equals(InsertObj o) {
        if (this.toString().equals(o.toString())) return true;
        if (o == null || !String.valueOf(getClass()).equals(String.valueOf(o.getClass()))) return false;
        String[] val = o.getMem();
        return key.equals(val[0]) && value.equals(val[1]);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
