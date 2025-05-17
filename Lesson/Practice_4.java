package Chapter4;

//สามารถซ้อน class ได้
class Dogs{
    int age = 5;
    String name = "น้องหมา";
}
public class Practice_4 {
    public static void main(String[] args) {
        // ทำก่ารสร้าง obj dog1-2
        Dogs dog1 = new Dogs();
        Dogs dog2 = new Dogs();
        dog2.name = "หมา2";
        System.out.println("dog1 age: "+dog1.age+" "+dog1.name);
        System.out.println("dog1 age: "+dog2.age+" "+dog2.name);
        Cats cat1 = new Cats();
        cat1.age = 2;
        System.out.println("cat1 age: "+cat1.age+" "+cat1.color);
    }
}


