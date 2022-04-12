import java.util.Scanner;
/*
      Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yapımı.
      Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
      eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
      aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen
      başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
       */
public class Main {
    public static void main(String[] args) {
        String userName, password, soru, evet, hayir, yeniSifre;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici adiniz: ");
        userName = input.nextLine();

        System.out.println("Sifreniz: ");
        password = input.nextLine();


        if (userName.equals("patika") && password.equals("java123") ){
            System.out.println("Giris yaptiniz !");
        }else{
            System.out.println("Giris basarisiz !");
            System.out.println("Sifrenizi sifirlamak ister misiniz ? ");
            soru = input.nextLine();
            if(soru.equals("evet")){
                System.out.println("Yeni sifreniz icin oneriler:\n1- Hatali girilen sifre ile ayni olmamali\n2- Unutulan sifre ile ayni olmamali");
                System.out.println("Yeni sifrenizi giriniz: ");
                yeniSifre = input.nextLine();
                if(yeniSifre.equals(password)){
                    System.out.println("Sifre olusturulamadi  :(  Lutfen baska sifre deneyiniz..");


                } else
                    System.out.println("Sifre olusturuldu !");
            }else{
                System.out.println("Yeni sifre talebi basariyla reddedildi..\niyi gunler dileriz..");
            }

        }
    }
}
