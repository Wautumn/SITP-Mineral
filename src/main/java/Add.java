public class Add {
    private int a=0;
    private int b=0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void add(){

    }

    public void add(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int count(){
        return a+b;
    }
}
