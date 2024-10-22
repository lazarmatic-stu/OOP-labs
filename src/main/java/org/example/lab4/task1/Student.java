package org.example.lab4.task1;

public class Student extends Person {
    private int credit;
    public Student(String name, String address){
        super(name, address);
        this.credit = 0;
    }
    public int getCredit(){
        return this.credit;
    }
    public void setCredit(int credit){
        this.credit = credit;
    }
    public void study(){
        this.credit++;
    }
    @Override
    public String toString(){
        return super.getName() + "\n" + super.getAddress() + "\n credits " + this.credit;
    }
}
