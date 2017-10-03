/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

/**
 *
 * @author Acer
 * Nama     : Albert Afriadi Sigiro
 * NIM      : 10116514
 * Kelas    : PBO-12
 */
class mahasiswa {
    public String nama;
    public String nim;
}
class nilaimahasiswa {
    private double Quiz;
    private double Uts;
    private double Uas;
    private double na;

    public double getQuiz() {
        return Quiz;
    }

    public void setQuiz(double Quiz) {
        this.Quiz = Quiz;
    }

    public double getUts() {
        return Uts;
    }

    public void setUts(double Uts) {
        this.Uts = Uts;
    }

    public double getUas() {
        return Uas;
    }

    public void setUas(double Uas) {
        this.Uas = Uas;
    }
    public double na(double Quiz,double Uts, double Uas) {
        return (0.2 * Quiz + 0.3 * Uts + 0.5 * Uas);
    }
    public void info (double na) {
        char index;
            if (na > 80 && na <= 100) {
            index = 'A';
            } else if (na > 68 && na <= 80) {
            index = 'B';
            } else if (na > 56 && na <= 68) {
            index = 'C';
            } else if (na > 45 && na <= 56) {
            index = 'D';
            } else  {
            index = 'E';
            }
            switch (index) {
            case 'A':

                System.out.println("\nIndex = " + index);
                System.out.println("Sangat Baik"+ index);
                break;
            case 'B':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Baik");
                break;
            case 'C':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Cukup");
                break;
            case 'D':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Kurang");
                break;
            case 'E':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Sangat Kurang");
                break;
            default:
                System.out.println("\nUNRECOGNIZE");
        }
    }
}
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mhs = new mahasiswa();
        mhs.nama    = "Albert Afriadi Sigiro";
        mhs.nim     = "1.01.16.514";
        int i;
        i=1;
        while (i<=4) {
            System.out.println("Nama ke-"+i+"\t = "+mhs.nama);
            i++;
        }
        System.out.println("\n");
        
        i=8;
        while (i >= 1) {
            System.out.println("NIM ke-"+i+"\t = "+mhs.nim+"."+i);
            i--;
        }
        nilaimahasiswa nilai = new nilaimahasiswa ();
        nilai.setQuiz(75);
        nilai.setUts(45);
        nilai.setUas(34);
        
        System.out.println("\n");
        System.out.println("QUIZ    = "+nilai.getQuiz());
        System.out.println("UTS     = "+nilai.getUts());
        System.out.println("UAS     = "+nilai.getUas());
        
        System.out.println("\n");
        System.out.println("Nilai Akhir    = "+nilai.na(nilai.getQuiz(), nilai.getUts(), nilai.getUas()));
        nilai.info(nilai.na(nilai.getQuiz(), nilai.getUts(), nilai.getUas()));        
    }
}
