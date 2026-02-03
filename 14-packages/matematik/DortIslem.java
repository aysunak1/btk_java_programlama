package matematik;

public class DortIslem {
    int toplam = 0;
    public int topla(int...sayilar){
        for(int sayi: sayilar){

            toplam = toplam + sayi;
        }
        return toplam;
    }

}
