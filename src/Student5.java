public class Student5 {
    private String name;
    private int score;
    
    public Student5(String n){
        name = n;
    }
    public void setScore(int s){
        if(0 <= s && s <= 100){
            score = s;
        } else {
            System.out.print(name + "さんの点数が範囲外です。");
            score = 0;
        }
    }
    void display(){
        System.out.println( name + "さん：" + score + "点");
    }
}

class StuSample5{
    public static void main(String[] args){
        Student5 stu1 = new Student5("菅原");
        stu1.setScore(80);
        stu1.display();

        Student5 stu2 = new Student5("村上");
        //stu.score= -50;
        stu2.display();
    }
}
