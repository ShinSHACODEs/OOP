/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

public class Student {

    String id;
    String name;
    int year;

    // defualt Contructor
    public Student() {
        this.id = " ";
        this.name = " ";
        this.year = 0;
    }

    public Student(String id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }
    //overloading Contructors \/  ชื่อเดัยวกันแต่ argument ต่างกัน
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.year = 4;
    }
    //void ไม่มีการส่งค่ากลับ
    public void displayInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.year);
    }
}
