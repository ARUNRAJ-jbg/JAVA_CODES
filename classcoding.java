class Student{
    int rollNo;
    String name;
    String dept;
    String section;
    int year;
    Student(int rollNo,String name,String dept,String section,int year){
    this.rollNo=rollNo;
    this.name=name;
    this.dept=dept;
    this.section=section; 
    this.year=year;
    }
    void display(){
        System.out.println("rollNo:"+rollNo);
        System.out.println("name:"+name);
        System.out.println("dept:"+dept);
        System.out.println("section:"+section);
        System.out.println("year:"+year);
    }
    }
    public class Main{
        public static void main(String[]args){
            Student[]students=new Student[3];
            student[0]=new student(101,"arun","CSE","A",4);
            student[1]=new student(102,"anbu","ECE","B",4);
            student[2]=new student(103,"rj","EEE","C",5);
            for(int i=0;i<students.length;i++){
                students[i].display();
            }
        }
    }
