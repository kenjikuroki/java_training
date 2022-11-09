/*public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}*/



class StuSample { 
    public static void main(String[] args){
        Student stu1 = new Student();

        stu1.name = "菅原";
        stu1.setScore(90, 80);

        stu1.display();
        System.out.println("平均" + stu1.getAvg() + "点");
    }
}

class Student {
    String name;
    int engScore;
    int mathScore;

    void display() {
        System.out.println(name + "さん");
        System.out.println("英語" + engScore + "点・数字" + mathScore + "店");
    }
    void setScore(int eng, int math) {
        engScore = eng;
        mathScore = math;
    }
    double getAvg() {
        double avg = (engScore + mathScore) / 2.0;
        return avg;
    }
}