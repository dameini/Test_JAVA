import Test_Package.classs;

public class ReferenceNumType {
    public static void main(String[] args) {
        // TODO 类是对象的模板，对象是类的实例
        // TODO 一个Java类不能重名
        // TODO 一个类可以有很多对象，对象只能根据一个类来创建
        //
        // TODO 引用必须是、只能是一个类的引用
        // TODO 引用只能指向其所属类型的类的对象
        // TODO 相同类型的引用之间可以赋值
        // TODO 只能通过指向一个对象的引用，来操作一个对象
        classs c1;
        c1 = new classs();
        System.out.println(c1);
// TODO 数组其实也是一个引用数据类型
        int[] shuzu;
        shuzu = new int[2];
        shuzu[0] = 1;
        shuzu[1] = 2;
        System.out.println(shuzu.length);

        double[][][] sanwei = new double[1][2][3];

        System.out.println(sanwei[0][1].length);
        // TODO 引用的缺省值null
        if (c1.id == null)
            c1.name = "dd";
            System.out.println(c1.name);
        for (int x:
             shuzu) {
            System.out.println(x);
        }
        // 视频5.55
    }
}
