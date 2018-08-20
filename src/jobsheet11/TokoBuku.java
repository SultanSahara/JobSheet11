/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TokoBuku {

    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Toko Buku Sultan Sahara");
        System.out.println("Jl.Sapteronggo Pakis Malang");
        System.out.println("Selamat Berbelanja");
        Scanner scanner = new Scanner(System.in);
        //Harga Buku
        int a = 4000;
        int Buku = a;
        System.out.println("Harga Buku = " + "Rp " + a);
        //Harga Buku Besar
        int b = 6000;
        int BukuBesar = b;
        System.out.println("Harga Buku Besar = " + "Rp " + b);
        //Harga Pensil
        int c = 4000;
        int Pensil = c;
        System.out.println("Harga Pensil = " + "Rp " + c);
        //Harga Bulpen
        int d = 5000;
        int Bulpen = d;
        System.out.println("Harga Bulpen = " + "Rp " + d);
        //Harga SketchBook
        int e = 20000;
        int SketchBook = e;
        System.out.println("Harga SketchBook = " + "Rp " + e);
        //Harga Tepak
        int f = 13000;
        int Tepak = f;
        System.out.println("Harga Tepak = " + "Rp " + f);

        System.out.println("Berapa Jumlah Buku yang ingin anda beli?");
        int JumlahBuku = scanner.nextInt();
        System.out.println("Jumlah buku yang ingin anda beli sejumlah = " + JumlahBuku);
        int JumlahHargaBuku = a * JumlahBuku;
        System.out.println("Total Harga = " + "Rp " + JumlahHargaBuku);

        System.out.println("Berapa Jumlah BukuBesar yang ingin anda beli?");
        int JumlahBukuBesar = scanner.nextInt();
        System.out.println("Jumlah BukuBesar yang ingin anda beli sejumlah = " + JumlahBukuBesar);
        int JumlahHargaBukuBesar = b * JumlahBukuBesar;
        System.out.println("Total Harga = " + "Rp " + JumlahHargaBukuBesar);

        System.out.println("Berapa Jumlah Pensil yang ingin anda beli?");
        int JumlahPensil = scanner.nextInt();
        System.out.println("Jumlah Pensil yang ingin anda beli sejumlah = " + JumlahPensil);
        int JumlahHargaPensil = c * JumlahPensil;
        System.out.println("Total Harga = " + "Rp " + JumlahHargaPensil);

        System.out.println("Berapa Jumlah Bulpen yang ingin anda beli?");
        int JumlahBulpen = scanner.nextInt();
        System.out.println("Jumlah Bulpen yang ingin anda beli sejumlah = " + JumlahBulpen);
        int JumlahHargaBulpen = d * JumlahBulpen;
        System.out.println("Total Harga = " + "Rp " + JumlahHargaBulpen);

        System.out.println("Berapa Jumlah SketchBook yang ingin anda beli?");
        int JumlahSketchBook = scanner.nextInt();
        System.out.println("Jumlah SketchBook yang ingin anda beli sejumlah = " + JumlahSketchBook);
        int JumlahHargaSketchBook = e * JumlahSketchBook;
        System.out.println("Total Harga = " + "Rp " + JumlahHargaSketchBook);

        System.out.println("Berapa Jumlah Tepak yang ingin anda beli?");
        int JumlahTepak = scanner.nextInt();
        System.out.println("Jumlah Tepak yang ingin anda beli sejumlah = " + JumlahTepak);
        int JumlahHargaTepak = f * JumlahTepak;
        System.out.println("Total Harga = " + "Rp " + JumlahHargaTepak);

        int TotalPembelian = JumlahHargaBuku + JumlahHargaBukuBesar + JumlahHargaPensil + JumlahHargaBulpen + JumlahHargaSketchBook + JumlahHargaTepak;

        System.out.println("           ");
        System.out.println("===== Total Harga Pembelian =====");

        if (TotalPembelian >= 500000) {
            System.out.println("Total Harga Sebelum Diskon" + "Rp " + TotalPembelian);
            System.out.println("Karena pembelian melebihi Rp 500000 maka anda mendapat diskon 50%");
            int TotalSetelahDiDiskon50Persen = (TotalPembelian / 2);
            System.out.println("Total Harga = " + "Rp " + TotalSetelahDiDiskon50Persen);
        } else if (TotalPembelian >= 200000) {
            System.out.println("Total Harga Sebelum Diskon" + "Rp " + TotalPembelian);
            System.out.println("Karena pembelian melebihi Rp 200000 maka anda mendapat diskon 20%");
            int TotalSetelahDiDiskon20Persen = (TotalPembelian - TotalPembelian * 2 / 10);
            System.out.println("Total Harga = " + "Rp " + TotalSetelahDiDiskon20Persen);
        } else if (TotalPembelian >= 100000) {
            System.out.println("Total Harga Sebelum Diskon" + "Rp " + TotalPembelian);
            System.out.println("Karena pembelian melebihi Rp 100000 maka anda mendapat diskon 10%");
            int TotalSetelahDiDiskon10Persen = (TotalPembelian - TotalPembelian * 1 / 10);
            System.out.println("Total Harga = " + "Rp " + TotalSetelahDiDiskon10Persen);
        } else {
            System.out.println("Total Harga = " + "Rp " + TotalPembelian);
        }
        System.out.println("Kasir : Sultan Sahara");
        System.out.println("Kritik dan saran Hubungi 081434356573");
        System.out.println("Terima Kasih Dan Semoga Harimu Menyenangkan");

    }
}
