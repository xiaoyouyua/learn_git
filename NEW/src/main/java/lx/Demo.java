package main.java.lx;

public class Demo{
    public static void main(String[] args) {
        Diannao diannao=new Diannao();
        diannao.kaiji();
        Shubiao shubiao = new Shubiao();
        Jianpan jianpan = new Jianpan();

        diannao.Usbjk(shubiao);
        diannao.Usbjk(jianpan);
        diannao.guanji();
    }
}
