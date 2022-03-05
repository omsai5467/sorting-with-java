
class Main{
    public static void main(String[] args){
        C ch = new C();
        f f  = new f();
        System.out.println(ch.age+" "+f.age);
    }
}

class C{
    int age = 30;
}
class f extends C{

    int age = 1;
}