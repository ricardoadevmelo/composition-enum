package entities1Composition;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<Hourcontract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(Hourcontract contract) {
        contracts.add(contract);
    }

    public void removeContract(Hourcontract contract) {
        contracts.remove(contract);
    }

    public List<Hourcontract> getContracts() {
        return contracts;
    }

//    public void setContracts(List<Hourcontract> contracts) {
//        this.contracts = contracts;
//    }

    public double income(int year, int month) {
        double sum = baseSalary;

        Calendar calendar = Calendar.getInstance();

        for (Hourcontract hC : contracts) {
            calendar.setTime(hC.getDate());
            int hCyear = calendar.get(Calendar.YEAR);
            int hCmonth = 1 + calendar.get(Calendar.MONTH);

            if (year == hCyear && month == hCmonth) {
                sum += hC.totalValue();
            }
        }
        return sum;
    }

}
