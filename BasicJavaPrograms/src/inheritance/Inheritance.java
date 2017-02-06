package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        Teaching person1 = new Teaching("Java",90000,"Peter Parker",30);
        NonTeaching person2 = new NonTeaching(30000,"Tony Stark",35);
        System.out.println(person1.name+":"+person1.age+"-"+person1.getSubject()+":"+person1.getSalary());
        System.out.println(person2.getName()+":"+person2.getAge()+"-"+person2.salary);
    }

}

class Faculty{
    String name;
    int age;

    public Faculty(String n, int a){
        name = n;
        age = a;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

}

class Teaching extends Faculty{
    String subject;
    int salary;

    public Teaching(String su, int sa, String n, int a){
        super(n,a);
        subject = su;
        salary = sa;
    }

    public String getSubject(){
        return subject;
    }

    public int getSalary(){
        return salary;
    }

}

class NonTeaching extends Faculty{
    int salary;

    public NonTeaching(int s, String n, int a){
        super(n,a);
        salary = s;
    }

    public int getSalary(){
        return salary;
    }

}
