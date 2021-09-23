import java.util.Scanner;
class Kertas{
    public int panjang;
    public int lebar;
    public String jenis;
    private String tulisan;
    // int jumlah;
    public Kertas(){
        int pnj,lbr;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("panjang kertas : ");
        pnj = sc.nextInt();
       
        System.out.print("lebar kertas : ");
        lbr = sc.nextInt();
        this.panjang = pnj;
        this.lebar = lbr;
 
    }
    public String getTulisan(){
        return this.tulisan;
    }

    public void setTulisan(){
        Scanner scn= new Scanner(System.in);
        System.out.print("Masukkan teks yang ingin dicetak : ");
        String x = scn.nextLine();
        this.tulisan=x;
    }
}

class Printer {
    int jumlahKertas;
    boolean power;

    public Printer (){
        Scanner input=new Scanner(System.in);
        System.out.print("Jumlah kertas : ");
        int jml = input.nextInt();
        this.jumlahKertas = jml;
        System.out.print("Apakah printer on (true/false) : ");
        boolean pwr = input.nextBoolean();
        this.power = pwr;
    }
    public void cetak (String x){
        if (this.power== false){
            System.out.println("Printer mati tidak bisa mencetak");
            return;
        }
        if (this.jumlahKertas == 0){
            System.out.println ("kertas habis tidak bisa mencetak");
            return;
        }
        System.out.println("============================================");
        System.out.println("              Hasil tercetak");
        System.out.println("============================================");
        System.out.println(x);
        System.out.print("Sisa kertas : ");
        jumlahKertas--;
    }
    public int  getJumlahKertas() {
        return jumlahKertas;
    
    }
}
public class Main {
    public static void main(String[] args)  {
        
        Kertas kertas1 = new Kertas();
        Printer printer1 = new Printer();

        kertas1.setTulisan();
        String isiTulisan = kertas1.getTulisan();
        printer1.cetak(isiTulisan);
        System.out.println(printer1.getJumlahKertas());
    }
}        
