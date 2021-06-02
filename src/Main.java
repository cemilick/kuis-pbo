
import com.divisi.Android;
import com.divisi.Web;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cemil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);
        
        int pilih,tulis, coding, wawancara;
        String nama, nik;
        
        System.out.println("FORM PENDAFTARAN PT. UDIN");
        System.out.println("1. Web Development");
        System.out.println("2. Android Development");
        System.out.println("Pilih jenis form: ");
        pilih = inputAngka.nextInt();
        
        System.out.println("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.println("Masukkan NIK: ");
        nik = input.nextLine();
        System.out.println("Masukkan Nilai Tulis    : ");
        tulis = inputAngka.nextInt();
        System.out.println("Masukkan Nilai Coding   : ");
        coding = inputAngka.nextInt();
        System.out.println("Masukkan Nilai Wawancara: ");
        wawancara = inputAngka.nextInt();
        
        if(pilih == 1){
            Web mahasiswa = new Web(nama, nik, tulis, coding, wawancara);
                do {
                System.out.println("Menu");
                System.out.println("1. Ubah");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.println("Pilih Menu : ");
                pilih = inputAngka.nextInt();

                if(pilih == 1){
                    System.out.println("Masukkan Nilai Tulis    : ");
                    mahasiswa.setTulis(inputAngka.nextInt());
                    System.out.println("Masukkan Nilai Coding   : ");
                    mahasiswa.setCoding(inputAngka.nextInt());
                    System.out.println("Masukkan Nilai Wawancara: ");
                    mahasiswa.setWawancara(inputAngka.nextInt());
                } else if(pilih == 2){
                    System.out.println("Nilai Akhir : " + mahasiswa.nilaiAkhir());
                    System.out.println(mahasiswa.keterangan());
                } else {
                    break;
                }
            } while(true);    
        } else if(pilih == 2){
            Android mahasiswa = new Android(nama, nik, tulis, coding, wawancara);
                do {
                System.out.println("Menu");
                System.out.println("1. Ubah");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.println("Pilih Menu : ");
                pilih = inputAngka.nextInt();

                if(pilih == 1){
                    System.out.println("Masukkan Nilai Tulis    : ");
                    mahasiswa.setTulis(inputAngka.nextInt());
                    System.out.println("Masukkan Nilai Coding   : ");
                    mahasiswa.setCoding(inputAngka.nextInt());
                    System.out.println("Masukkan Nilai Wawancara: ");
                    mahasiswa.setWawancara(inputAngka.nextInt());
                } else if(pilih == 2){
                    System.out.println("Nilai Akhir : " + mahasiswa.nilaiAkhir());
                    System.out.println(mahasiswa.keterangan());
                } else {
                    break;
                }
            } while(true);
        }    
    }
    
}

