package bien;

public class baiTap3 {
    static public int TongHaiSo(int a, int b){
        return a+b;
    }

    static public float TichHaiSo(float a, float b){
        return a*b;
    }

    static public void main (String [] args){
        System.out.println("Tong hai so: " + TongHaiSo(2,3));
        System.out.println("Tich hai so: " + TichHaiSo(2,3));
    }
}
