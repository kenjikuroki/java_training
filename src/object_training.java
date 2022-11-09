class Car {
    //メンバ変数（属性）
    int no;
    int speed;

    //メソッド（操作）
    void setNo(int n){
        no = n;
    }
    void run(int s){
        speed = s; 
    }
    void stop(){
        speed = 0;
    }
    void display(){
        System.out.println("ナンバー" + no + "の速度は" + speed + "です。" );

    }
}

class DriveCar{
    public static void main(String[] args){
        //Carクラスのオブジェクトc1を生成
        Car c1 = new Car();

        //c1のナンバーを2525に設定
        c1.setNo(2525);

        //c1の速度を30に設定
        c1.run(30);

        //c1のナンバー、速度を表示
        c1.display();

        //c1の速度を0に設定
        c1.stop();

        //c1のナンバー、速度を表示
        c1.display();

    }
}


