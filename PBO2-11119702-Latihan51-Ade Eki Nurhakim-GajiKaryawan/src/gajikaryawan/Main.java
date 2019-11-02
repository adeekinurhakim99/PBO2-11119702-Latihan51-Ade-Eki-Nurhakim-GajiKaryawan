/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikaryawan;
import java.util.Scanner;
/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        Karyawan k = new Karyawan();
        System.out.println("===== Program Perhitungan Gaji =====");
        System.out.println("Masukkan NIK : ");
        k.setNik(i.nextLine());
        System.out.println("Masukkan Nama : ");
        k.setNama(i.nextLine());
        System.out.println("Masukkan Golongan(1/2/3) : ");
        k.setGolongan(i.nextInt());
        System.out.println("Masukkan Jabatan(Manager/Kabag) : ");
        k.setJabatan(i.nextLine());
        
        Manager m = new Manager();
        System.out.println("Masukkan Kehadiran : ");
        m.setKehadiran(i.nextInt());
        
        System.out.println("===== Hasil Perhitungan =====");
        System.out.println("NIK : "+k.getNik());
        System.out.println("NAMA : "+k.getNama());
        System.out.println("GOLONGAN : "+k.getGolongan());
        System.out.println("JABATAN : "+k.getJabatan());
        
        System.out.println("TUNJANGAN GOLONGAN : "+m.tunjanganGolongan());
        System.out.println("TUNJANGAN JABATAN : "+m.tunjanganJabatan());
        System.out.println("TUNJANGAN KEHADIRAN : "+m.tunjanganKehadiran());
    }
}
