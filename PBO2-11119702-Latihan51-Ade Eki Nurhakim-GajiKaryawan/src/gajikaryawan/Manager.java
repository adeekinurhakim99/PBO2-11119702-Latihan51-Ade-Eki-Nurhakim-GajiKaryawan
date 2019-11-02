/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikaryawan;

/**
 *
 * @author Ekiw
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganJabatan;
    private float tunjanganGolongan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(){
        return kehadiran*10000;
    }
    public float tunjanganJabatan(){
        switch(jabatan){
            case"Manager":
                int i=2000000;
                break;
            case"Kabag":
                int x=1000000;
                break;
            default:
                System.out.println("");
        }
        return tunjanganJabatan;
    }
    public float tunjanganGolongan(){
        if(golongan==1){
            int golongan1=500000;}
        else if(golongan==2){
            int golongan2=1000000;}
        else if(golongan==3){
            int golongan3=1500000;}    
        return tunjanganGolongan;
        }
    public float gajiTotal(){
        return tunjanganJabatan+tunjanganGolongan+tunjanganKehadiran;
    }
    }
