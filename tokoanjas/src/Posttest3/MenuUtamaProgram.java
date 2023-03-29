
package Posttest3;

import java.io.IOException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;


public class MenuUtamaProgram {
    static String option, admin;
    static Scanner input = new Scanner(System.in);
    static Brgtoko Brg = new Brgtoko();//OBJEK
    static ArrayList<Brgtoko> BrgList;//ARRAYLIST
    static Tokosepatu1 TK = new Tokosepatu1();//OBJEK
    static ArrayList<Tokosepatu1> TKList;//ARRAYLIST
    
    public static void menu () throws IOException{
        Boolean ulang,ulang2;
        System.out.println("|==================================================================|");
        System.out.println("|    SELAMAT DATANG DI APLIKASI PENDATAAN TOKO SEPATU              |");
        System.out.println("|==================================================================|");
        ulang = true;
        while (ulang) {
            menuPertama();
            switch (option) {
                case "1":
                ulang2=true;
                while(ulang2){
                menuKedua();
                    switch (admin){
                        case "1":
                            Brg.tambahBarang();
                            break;
                        case "2":
                            Brg.tampilBarang();
                            break;
                        case "3":
                            Brg.ubahBarang(BrgList);
                            break;
                        case "4":
                            Brg.hapusBarang();
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "2":
                ulang2=true;
                while(ulang2){
                menuKetiga();
                    switch (admin){
                        case "1":
                            TK.tambahBarang();
                            break;
                        case "2":
                            TK.tampilBarang();
                            break;
                        case "3":
                            TK.ubahBarang(TKList);
                            break;
                        case "4":
                            TK.hapusBarang();
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "3":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);

                default:
                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                break;
            }
        } 
    }
    public static String menuKedua (){
        System.out.println();
        System.out.println("\t|==================================================|");
        System.out.println("\t|        PROGRAM PENDATAAN TOKO SEPATU  |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  PILIH MENU                      |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                                                  |");
        System.out.println("\t|                 1. TAMBAH DATA BARANG TOKO       |");
        System.out.println("\t|                 2. TAMPIL DATA BARANG TOKO       |");
        System.out.println("\t|                 3. UBAH DATA BARANG TOKO         |");
        System.out.println("\t|                 4. DELETE DATA BARANG TOKO       |");
        System.out.println("\t|                 5. KEMBALI KE MENU AWAL TOKO     |");
        System.out.println("\t|                 6. EXIT PROGRAM                  |");
        System.out.println("\t|===============================================   |");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
     public static String menuKetiga (){
        System.out.println();
        System.out.println("\t|==================================================|");
        System.out.println("\t|     PROGRAM PENDATAAN BARANG TOKO SEPATU         |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                    TOKO                          |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  PILIH MENU                      |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                                                  |");
        System.out.println("\t|                 1. TAMBAH DATA BARANG            |");
        System.out.println("\t|                 2. TAMPIL DATA BARANG            |");
        System.out.println("\t|                 3. UBAH DATA BARANG              |");
        System.out.println("\t|                 4. DELETE DATA BARANG            |");
        System.out.println("\t|                 5. KEMBALI KE MENU AWAL          |");
        System.out.println("\t|                 6. EXIT PROGRAM                  |");
        System.out.println("\t|==================================================|");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
    public static String menuPertama (){
      System.out.println();
      System.out.println("\t|==================================================|");
      System.out.println("\t|        PROGRAM PENDATAAN TOKO SEPATU  |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                PILIH MENU                        |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                                                  |");
      System.out.println("\t|           1. TOKO BARANG SEPATU 1                |");
      System.out.println("\t|           2. TOKO SEPATU 2                       |");
      System.out.println("\t|           3. EXIT PROGRAM                        |");
      System.out.println("\t|==================================================|");
      System.out.print("Masukan Pilihan menu : ");
      option = input.nextLine();
      return option;
    }


    public static void main(String[] args) throws IOException  {
       menu();
    }
    
    
}
