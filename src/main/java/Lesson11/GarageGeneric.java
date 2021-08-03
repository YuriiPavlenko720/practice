package Lesson11;

import java.util.ArrayList;
import java.util.List;

public class GarageGeneric<T extends Vehicle> {
    List<T> transport = new ArrayList<>();

    public T get(int i) {
        return transport.get(i);
    }

    public void add(T newObj) {
        transport.add(newObj);
    }

    public List<T> getByType(Class classType) {
        List<T> newList = new ArrayList<>();
        for (int i=0; i< transport.size();i++){
            if (classType.isInstance(transport.get(i))){
                newList.add(transport.get(i));
            }
        }
        return newList;
    }
}

