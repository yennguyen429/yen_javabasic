package bien;

public class sinhVien {
    int tuoi;
    String ten;
    static int slhs = 30;
     static public void main (String [] args)
     {
         sinhVien sv = new sinhVien();
         sv.tuoi = 20;
         System.out.println("tuoi sinh vien la " + sv.tuoi);
         System.out.println(slhs);
     }

}
