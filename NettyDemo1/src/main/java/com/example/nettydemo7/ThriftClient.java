package com.example.nettydemo7;

import com.example.thrift.generated.Person;
import com.example.thrift.generated.PersonService;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ThriftClient {

    public static void main(String[] args) {
        TTransport tTransport = new TFramedTransport(new TSocket("localhost",8899),600);
        TProtocol tProtocol = new TCompactProtocol(tTransport);
        PersonService.Client client = new PersonService.Client(tProtocol);

        try {
            tTransport.open();

            Person person = client.getPersonByName("jack");
            System.out.println(person.getUsername());
            System.out.println(person.getAge());
            System.out.println(person.isMarried());

            System.out.println("==============");

            Person person1 = new Person();

            person1.setUsername("mary");
            person1.setAge(10);
            person1.setMarried(false);

            client.savePerson(person1);
        }catch (Exception ex){
            throw  new RuntimeException(ex.getMessage(),ex);
        }finally {
            tTransport.close();
        }
    }
}
