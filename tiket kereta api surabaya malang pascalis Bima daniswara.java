import java.util.*;

 // Pascalis Bima Daniswara/35

 class tiket_kereta_api_surabaya_malang_pascalis
 {
   public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    int pilihan, harga, total, banyak, bayar, kembalian ;
    
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("TIKET KERETA API SBY-MLG");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println(" ");
    System.out.println(" ");
    
    System.out.println("silahkan pilih opsi tiket");
    System.out.println("1. Ekonomi   : Rp.15.000,00");
    System.out.println("2. Bisnis    : Rp.80.000,00");
    System.out.println("3. Eksklusif : Rp.110.000,00");
    System.out.println(" ");
    
    System.out.print("Masukkan pilihan anda dengan angka (1-3) : ");
    pilihan = input.nextInt();
    
    switch(pilihan){
      case 1:
        System.out.print("Masukkan jumlah tiket yang anda beli : ");
        banyak = input.nextInt();
        harga = 15000;
        total = banyak * harga;
        System.out.println("total : Rp. " +total);
        System.out.print("uang pembayaran anda: Rp. ");
        bayar = input.nextInt();
        kembalian = bayar-total;
        System.out.println(" ");
        System.out.println("berikut struk pembayaran anda :");
        System.out.println("------------------------------------");
        System.out.println(" Tiket kereta api Surabaya - Malang ");
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" tipe kelas        :  ekonomi   ");
        System.out.println(" Harga tiket       :  Rp.15.000");
        System.out.println(" Total tiket       :  " +banyak);
        System.out.println(" ");
        System.out.println(" Total harga       :  Rp." +total);
        System.out.println(" Uang pembayaran   :  Rp." +bayar);
        System.out.println(" Kembalian         :  Rp." +kembalian);
        System.out.println("-----------------------------------");
        System.out.println("     Terimakasih telah memesan     ");
        System.out.println("  semoga perjalanan anda memuaskan  ");
        System.out.println("-----------------------------------");
      break;
      
      case 2:
        System.out.print("Masukkan jumlah tiket yang anda beli : ");
        banyak = input.nextInt();
        harga = 80000;
        total = banyak * harga;
        System.out.println("total : Rp. " +total);
        System.out.print("uang pembayaran anda: Rp. ");
        bayar = input.nextInt();
        kembalian = bayar-total;
        System.out.println(" ");
        System.out.println("berikut struk pembayaran anda :");
        System.out.println("------------------------------------");
        System.out.println(" Tiket kereta api Surabaya - Malang ");
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" tipe kelas        :  bisnis   ");
        System.out.println(" Harga tiket       :  Rp.80.000");
        System.out.println(" Total tiket       :  " +banyak);
        System.out.println(" ");
        System.out.println(" Total bayar       :  Rp." +total);
        System.out.println(" Uang pembayaran   :  Rp." +bayar);
        System.out.println(" Kembalian         :  Rp." +kembalian);
        System.out.println("-----------------------------------");
        System.out.println("     Terimakasih telah memesan     ");
        System.out.println("  semoga perjalanan anda memuaskan  "); 
        System.out.println("-----------------------------------");
      break;
      
      case 3: 
        System.out.print("masukkan jumlah tiket yang anda beli : ");
        banyak = input.nextInt();
        harga = 110000;
        total = banyak * harga;
        System.out.println("total : Rp. " +total);
        System.out.print("uang pembayaran anda: Rp. ");
        bayar = input.nextInt();
        kembalian = bayar-total;
        System.out.println(" ");
        System.out.println("berikut struk pembayaran anda :");
        System.out.println("------------------------------------");
        System.out.println(" Tiket kereta api Surabaya - Malang ");
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" tipe kelas        :  eksekutif   ");
        System.out.println(" Harga tiket       :  Rp.110.000");
        System.out.println(" Total tiket       :  " +banyak);
        System.out.println(" ");
        System.out.println(" Total bayar       :  Rp." +total);
        System.out.println(" Uang pembayaran   :  Rp." +bayar);
        System.out.println(" Kembalian         :  Rp." +kembalian);
        System.out.println("-----------------------------------");
        System.out.println("     Terimakasih telah memesan     ");
        System.out.println("  semoga perjalanan anda memuaskan  ");
        System.out.println("-----------------------------------");
        break;
        
        default: 
          System.out.print("maaf pilihan anda tidak ada");
    }
    
    
   }
 }
