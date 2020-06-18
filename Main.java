package com.tutorial;

//membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;

}

public class Main{
    public static void main(String[]args) throws Exception {
        
        //instansiasi/membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Rifky";
        mahasiswa1.NIM = "152018119";
        mahasiswa1.jurusan = "teknik informatika";
        mahasiswa1.IPK = 2.95;
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Nugraha";
        mahasiswa2.NIM = "152018110";
        mahasiswa2.jurusan = "teknik informatika";
        mahasiswa2.IPK = 3.65;
        mahasiswa2.umur = 24;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}