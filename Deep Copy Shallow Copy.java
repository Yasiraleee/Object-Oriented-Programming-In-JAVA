package com.company;
class Holiday{
    String name;
    int Day;
    String Month;
    Holiday(String name,int Day,String Month){
        this.name=name;
        this.Day=Day;
        this.Month=Month;
    }
    Boolean inSameMonth(String Month){
        if(Month==this.Month) {
            return true;
        }else{
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args) {
    Holiday h1=new Holiday("Independence Day",14,"August");
    Holiday h2=h1;
    h2.name="Defence Day";
    h2.Day=6;
    h2.Month="September";
        System.out.println(h1.inSameMonth(h2.Month));
    Holiday h3=new Holiday("Labour Day",1,"May");
        System.out.println(h3.inSameMonth(h3.Month));
    }
}
