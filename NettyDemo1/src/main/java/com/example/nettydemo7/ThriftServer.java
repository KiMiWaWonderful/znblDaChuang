package com.example.nettydemo7;

import com.example.thrift.generated.PersonService;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;

public class ThriftServer {

    public static void main(String[] args) throws Exception{
        TNonblockingServerSocket tNonblockingServerSocket = new TNonblockingServerSocket(8899);
        THsHaServer.Args args1 = new THsHaServer.Args(tNonblockingServerSocket).minWorkerThreads(2).maxWorkerThreads(4);
        PersonService.Processor<PersonServiceImpl> personServiceProcessor = new PersonService.Processor<>(new PersonServiceImpl());

        args1.protocolFactory(new TCompactProtocol.Factory());
        args1.transportFactory(new TFramedTransport.Factory());
        args1.processorFactory(new TProcessorFactory(personServiceProcessor));

        TServer tServer = new THsHaServer(args1);
        System.out.println("Thrift Server Started");
        tServer.serve();

    }
}
