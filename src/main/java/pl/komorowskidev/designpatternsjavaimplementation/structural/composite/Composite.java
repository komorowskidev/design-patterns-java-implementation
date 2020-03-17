package pl.komorowskidev.designpatternsjavaimplementation.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Department {

    private String name;

    private int profit;

    private List<Department> departmentList;

    public Composite(String name, int profit){
        this.name = name;
        this.profit = profit;
        departmentList = new ArrayList<>();
    }

    @Override
    public int getProfit() {
        int result = profit;
        for(Department department : departmentList){
            result += department.getProfit();
        }
        return result;
    }

    @Override
    public String getName() {
        String result = "";
        for (Department department : departmentList){
            result += "\n" + department.getName();
        }
        result = result.replaceAll("\n", "\n  " );
        return name + ":" + result;
    }

    public void addDepartment(Department department){
        departmentList.add(department);
    }

    public void removeDepartment(Department department){
        departmentList.remove(department);
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }
}
