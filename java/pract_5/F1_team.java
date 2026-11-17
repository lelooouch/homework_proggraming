import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class F1_team implements Comparable<F1_team> {
    protected String name;
    protected String leader;
    protected String[] sponsors;

    public F1_team(String name, String leader){
        this.name = name;
        this.leader = leader;
    }

    @Override
    public int compareTo(F1_team other) {
        return this.name.compareTo(other.name);
    }

    public abstract void printDetails();
}

class Pilot extends F1_team {
    private String pilot_name;
    private int age;
    private double salary;
    private int contract;
    private boolean has_contract_next_year;

    public Pilot(String name, String leader, String pilot_name, int age, double salary, int contract){
        super(name, leader);
        this.pilot_name = pilot_name;
        this.age = age;
        this.salary = salary;
        this.contract = contract;
    }

    @Override
    public void printDetails() {
        System.out.println("Команда: " + name + " | Пилот: " + pilot_name);
    }
}

class Engine extends F1_team {
    private String company_name;

    public Engine(String name, String leader, String company_name){
        super(name, leader);
        this.company_name = company_name;
    }

    @Override
    public void printDetails() {
        System.out.println("Команда: " + name + " | Двигатель: " + company_name);
    }
}
