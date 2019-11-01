package com.example.nettydemo7;

import com.example.thrift.generated.DataException;
import com.example.thrift.generated.Person;
import com.example.thrift.generated.PersonService;
import org.apache.thrift.TException;

public class PersonServiceImpl implements PersonService.Iface{


    @Override
    public Person getPersonByName(String username) throws DataException, TException {

        System.out.println("Get Client Param:" + username);

        Person person = new Person();
        person.setUsername("jack");
        person.setAge(20);
        person.setMarried(false);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {

        System.out.println("Get Client Param:" );
        System.out.println(person.getUsername());
        System.out.println(person.getAge());
        System.out.println(person.isMarried());
    }
}
