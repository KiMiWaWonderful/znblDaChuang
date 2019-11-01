package com.company.factorymode;

public class TestComputerFactory {

    public static void main(String[] args) {
       // Computer computer = null;
        ComputerFactory computerFactory = new ComputerFactory();

        Computer pc = computerFactory.getComputer("Pc");
        Computer server = computerFactory.getComputer("Server");

        System.out.println(pc.toString());
        System.out.println(server.toString());

    }
}
