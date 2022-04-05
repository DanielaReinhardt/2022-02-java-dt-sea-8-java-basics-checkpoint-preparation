package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {
  
    List<T> itCrowd = new ArrayList<>();
    
    
    
 public boolean storePerson(T person){
    return itCrowd.add(person);
 }

public T getFirstStoredPerson() {
    return itCrowd.get(0);
}

public T getLastStoredPerson() {
       return itCrowd.get(itCrowd.size()-1);
}  

}
