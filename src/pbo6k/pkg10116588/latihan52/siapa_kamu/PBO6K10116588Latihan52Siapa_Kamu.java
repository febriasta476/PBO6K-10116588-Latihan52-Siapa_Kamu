/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan52.siapa_kamu;

/**
 *
 * @author Indra F
 * NAMA                     : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : 
 */
public class PBO6K10116588Latihan52Siapa_Kamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10116588");
        mahasiswa.setNama("Indra Febriastanto");
        mahasiswa.setUmur(20);
        mahasiswa.setKelas("PBO6K");

        System.out.println("\nNIP MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
