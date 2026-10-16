class Student{
    int rollNo;
    String name;
    int sub1,sub2,sub3;
    Student(int x,String s,int s1,int s2,int s3){
        rollNo=x;
        name=s;
        sub1=s1;
        sub2=s2;
        sub3=s3;
    }
    void details(){
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name: "+name);
    }
    int totalMarks(){
        return sub1+sub2+sub3;
    }
    double percentage(){
        return (sub1+sub2+sub3)*100/300.0;
    }
}
class Main {
    public static void main(String[] args) {
        Student s1=new Student(145,"Noor",87,89,98);
        s1.details();
        System.out.println("Marks: "+s1.totalMarks());
        System.out.println("Percentage: "+s1.percentage());
    }
}
