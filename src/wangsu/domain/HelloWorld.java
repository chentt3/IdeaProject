package wangsu.domain;

public class HelloWorld {
    private String name;
    private int x ;
    private int y ;
    private int c=0;
    private int d=0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello" + name+","+x+","+y);
    }

    public void sum(){
        c=x+y;
        System.out.println("x+y="+c);
    }

    public void  cheng(){
       d=c*x;
       System.out.println("(x+y)*x="+d);
    }
}
