import java.util.Scanner;
public class Rumus {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
 double luas;
 double kel;
 int alas,tinggi,sisi,pil,panjang,lebar,jari,miring,d1,d2,sisi1,sisi2,sisi3,sisi4;
      
 System.out.println("=========== Ali Rohman - Kelompok 3 ==========");
 System.out.println("==================== IF-A ====================");
 System.out.println("========== MENCARI RUMUS MATEMATIKA ==========");
 System.out.println("== 1.Segitiga ==");
 System.out.println("== 2.Persegi ==");
 System.out.println("== 3.Persegi Panjang ==");
 System.out.println("== 4.Lingkaran ==");
 System.out.println("== 5.Jajargenjang ==");
 System.out.println("== 6.Trapesium ==");
 System.out.println("== 7.Belah ketupat ==");
 System.out.println("== 8.Layang Layang ==");
 System.out.println("===========================================");
 System.out.println("Pilihlah salah satu (1-8) : ");
 pil=Integer.parseInt(input.next());
 switch(pil){
     case 1:{
         System.out.println("Masukan Tinggi Segitiga :");
         tinggi=Integer.parseInt(input.next());
         System.out.println("Masukan Alas Segitiga :");
         alas=Integer.parseInt(input.next());
         System.out.println("Masukan Panjang Sisi Miring segitiga :");
          miring = Integer.parseInt(input.next());
         System.out.println("Rumus mencari luas segitiga adalah alas dikali tinggi dibagi dua.");
         luas = alas * tinggi / 2;
         System.out.println("Luas Segitiga Adalah : " + luas) ;
         System.out.println("Rumus mencari keliling segitiga adalah alas ditambah tinggi ditambah sisi siring.");   
         kel = alas + tinggi + miring;
         System.out.println("Keliling segitiga adalah : " + kel) ;
         break;
     }
     case 2:{
         System.out.println("Masukan panjang sisi :");
         sisi=Integer.parseInt(input.next());
         System.out.println("Rumus mencari luas persegi adalah sisi kali sisi.");
         luas=sisi*sisi;
         System.out.println("Luas Persegi Adalah:"+luas);
         System.out.println("Rumus Mencari Keliling Persegi Adalah Sisi Kali 4.");
         kel=sisi*4;
         System.out.println("Keliling persegi adalah : "+kel);
         break;
     }
     case 3:{
         System.out.println("Masukan panjang :");
         panjang=Integer.parseInt(input.next());
         System.out.println("Masukan lebar :");
         lebar=Integer.parseInt(input.next());
         System.out.println("Rumus mencari luas persegi panjang adalah panjang kali lebar.");
         luas=panjang*lebar;
         System.out.println("Luas persegi panjang adalah : "+luas);
         System.out.println("Rumus mencari keliling persegi panjang adalah panjang ditambah lebar dibagi dua.");
         kel=(panjang+lebar)*2;
         System.out.println("keliling persegi panjang adalah : "+kel);
         break;
     }
     case 4:{
         System.out.println("Masukan panjang jari-jari:");
         jari=Integer.parseInt(input.next());
         System.out.println("Rumus Mencari luas lingkaran Adalah 3.14 kali jari-jari Kuadrat.");
         luas=3.14*jari*jari;
         System.out.println("luas lingkaran adalah:"+luas);
         System.out.println("Rumus mencari keliling lingkaran adalah 3.14 kali(jari-jari ditambah jari-jari).");
         kel=(jari+jari)*3.14;
         System.out.println("Keliling lingkaran adalah : "+kel);
         break;
     }
     case 5 :{
         System.out.println("Masukan panjang sisi 1 : ");
         sisi1=Integer.parseInt(input.next());
         System.out.println("Masukan tinggi jajargenjang:");
         tinggi=Integer.parseInt(input.next());
         System.out.println("Masukan alas jajargenjang:");
         alas=Integer.parseInt(input.next());
         System.out.println("Rumus mencari luas jajargenjang adalah alas dikali tinggi.");
         luas=(alas*tinggi);
         System.out.println("Luas jajargenjang adalah : "+luas);
         System.out.println("Rumus mencari keliling jajargenjang adalah penjumlah dari keempat sisi yang ada.");
         kel=sisi1+sisi1+alas+alas;
         System.out.println("keliling jajargenjang : "+kel);
         break;
     }
     case 6:{
         System.out.println("Masukan panjang sisi1 : ");
         sisi1=Integer.parseInt(input.next());
         System.out.println("Masukan panjang sisi2 : ");
         sisi2=Integer.parseInt(input.next());
         System.out.println("Masukan tinggi trapesium : ");
         tinggi=Integer.parseInt(input.next());
         System.out.println("Masukan jumlah sisi sejajar trapesium:");
         sisi=Integer.parseInt(input.next());
         System.out.println("Rumus mencari luas trapesium adalah jumlah sisi sejajar Dikali tinggi dibagi 2.");
         luas = sisi * tinggi / 2 ;
         System.out.println("Luas trapesium Adalah : " + luas) ;
         System.out.println("Rumus mencari keliling trapesium adalah penjumlahan dari keempat sisi yang ada.");
         kel = sisi1 + sisi2 + sisi;
         System.out.println("Keliling trapesium adalah : " + kel) ;
         break;
     }
     case 7 :{
         System.out.println("Masukan panjang diagonal 1: ");
         d1=Integer.parseInt(input.next());
         System.out.println("Masukan panjang diagonal 2: ");
         d2=Integer.parseInt(input.next());
         System.out.println("Masukan panjang sisi 1 : ");
         sisi1=Integer.parseInt(input.next());
         System.out.println("Masukan panjang sisi 2 : ");
         sisi2=Integer.parseInt(input.next());
         System.out.println("Masukan panjang sisi 3 : ");
         sisi3=Integer.parseInt(input.next());
         System.out.println("Masukan panjang sisi 4 : ");
         sisi4=Integer.parseInt(input.next());
         System.out.println("Rumus Mencari luas belah ketupat adalah diagonal 1 dikali diagonal 2 dibagi 2.");
         luas=d1*d2/2;
         System.out.println("luas belah ketupat adalah : "+luas);
         System.out.println("Rumus mencari keliling belah ketupat adalah penjumlahan dari keempat sisi yang ada.");
         kel=sisi1+sisi2+sisi3+sisi4;
         System.out.println("Keliling belah Ketupat adalah : "+kel);
         break;
     }
     case 8:{
         System.out.println("Masukkan Panjang Diagonal 1 : ");
         d1 = Integer.parseInt(input.next());
         System.out.println("Masukkan Panjang Diagonal 2 : ");
         d2 = Integer.parseInt(input.next());
         System.out.println("Masukkan Panjang Sisi 1 : ");
         sisi1 = Integer.parseInt(input.next());
         System.out.println("Masukkan Panjang Sisi 2 : ");
         sisi2 = Integer.parseInt(input.next());
         System.out.println("Masukkan Panjang Sisi 3 : ");
         sisi3 = Integer.parseInt(input.next());
         System.out.println("Masukkan Panjang Sisi 4 : ");
         sisi4 = Integer.parseInt(input.next());
         System.out.println("Rumus mencari luas Layang - Layang adalah diagonal 1 dikali diagonal 2 dibagi 2.");
         luas = d1 * d2 / 2 ;
         System.out.println("Luas layang-layang adalah : " + luas) ;
         System.out.println("Rumus mencari keliling layang - layang adalah penjumlahan dari keempat sisi yang ada.");
         kel = sisi1 + sisi2 + sisi3 + sisi4 ;
         System.out.println("Keliling layang - layang adalah : " + kel) ;
         break;
     }
     default:
     System.out.println("Silahkan input angka yang ada di list (1-8)");
 }
    }
}
