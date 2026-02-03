public class VarargsToplama {
    public static void main(String[] args) {

        int toplam = topla(3,5,7,8,10,15,7,-80);
        System.out.println(toplam);

//        String [][] sehirler = new String[3][3];
//
//        sehirler[0][0] = "İstanbul";
//        sehirler[0][1] = "Kırklareli";
//        sehirler[0][2] = "Edirne";
//        sehirler[1][0] = "Nevşehir";
//        sehirler[1][1] = "Kayseri";
//        sehirler[1][2] = "Ankara";
//        sehirler[2][0] = "Aydın";
//        sehirler[2][1] = "İzmir";
//        sehirler[2][2] = "Muğla";
//
//        for (String[] sehir:sehirler){
//            for (String seh:sehir){
//                switch (seh){
//                    case "İstanbul":
//                        System.out.println("------Marmara Bölgesi---------");
//                        break;
//                    case "Nevşehir":
//                        System.out.println("-----İç Anadolu Bölgesi---------");
//                        break;
//                    case "Aydın":
//                        System.out.println("--------Ege Bölgesi------------");
//                }
//
//                System.out.println(seh);
//
//
//            }
//        }

    }
    public static int topla(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam +=sayi;
        }return toplam;
    }
}
