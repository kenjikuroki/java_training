//設計用クラス
class Student4{
    String name;
    static int counter = 0;

    Student4(String n){
        name = n;
        counter++;
        System.out.println(name + "さんをインスタンス化しました");
    }
    static void display(){
        System.out.println(counter + "人です");
    }
}

//実行用クラス
class StuSample4{
    public static void main(String[] args){
        Student4.display();

        Student4 stu1 = new Student4("菅原");
        Student4.display();

        Student4 stu2 = new Student4("村上");
        Student4.display();
    }
}