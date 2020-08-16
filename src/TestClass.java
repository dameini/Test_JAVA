import Test_Package.*;

public class TestClass {
    public static void main(String[] args) {
        classs m1 = new classs();
        m1.name = "name";
        m1.id = "11";
        System.out.println(m1.id);
        m1.fangfa();//调用类的方法
        int c = m1.fanhuizhi();
        System.out.println(c);
    }
}
