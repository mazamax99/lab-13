public class Main {

    public  static void deCode(String urWord, int Sdvig) {
        char[] abc = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
                'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        char[] word = urWord.toCharArray();
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < abc.length; j++) {
                if (word[i] == abc[j] && j > Math.abs(Sdvig) - 1&&Sdvig< 0) {
                    word[i] = (char) ((int) abc[j + Sdvig]);
                    break;
                } else if (word[i] == abc[j] && j < Math.abs(Sdvig) - 1 && Sdvig < 0) {
                    word[i] = (char) ((int) abc[abc.length + (j + Sdvig)]);
                    break;
                } else if (word[i] == abc[j] && j < abc.length && (j + Sdvig) < abc.length && Sdvig > 0) {
                    word[i] = (char) ((int) abc[j + Sdvig]);
                    break;
                }
                else if (word[i] == abc[j] && j < abc.length && (j + Sdvig) > abc.length && Sdvig > 0){
                    word[i] = (char) ((int) abc[j + Sdvig-abc.length]);
                    break;
                }
                else if (word[i] != abc[j]) {
                    word[i] = word[i];
                }
            }

        }
        String encodeWord = new String(word);
        System.out.print(encodeWord);
    }
    public static void main (String[] args){
      deCode("ЗТЕФТИ ЧЦФТ!",-4);
        System.out.println();
        deCode("ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.",8);
        System.out.println();
        deCode("БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.",15);
        System.out.println();
        deCode("ЗЛКСВПЗЁ",3);
        deCode(" Н ",28);
        deCode("ЁЫНЫДТЫ ",-23);
        deCode("А ",2);
        deCode("ЩЛБХШЙЛЁ ",-1);
        deCode("ХЗИПДН ",-4);
        deCode("ТПНЙЗ ",1);
        deCode("ЫЮРЮЙЗЁ ",7);
        deCode("СТРДЖТА.",31);
        deCode(" ПГПГ.",-3);
        //for(int i=1;i<=33;i++)
            //deCode("БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.",i);
        //deCode("ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.",15);
       // for(int i=1;i<=33;i++)
        //deCode("ЗЛКСВПЗЁ",i);
        ///for(int i=1;i<=33;i++)
          //deCode(" Н ",i);
        //for(int i=1;i<=33;i++)
        //            //deCode("ЁЫНЫДТЫ ",-23);
        //for(int i=1;i<=33;i++)
        //deCode("ЩЛБХШЙЛЁ ",i);
        //for(int i=1;i<=33;i++)
        //deCode("ХЗИПДН ",-i);
        //for(int i=1;i<=33;i++)
        //deCode("ТПНЙЗ ",i);
        //for(int i=1;i<=33;i++)
        //deCode("ЫЮРЮЙЗЁ ",i);
        //for(int i=1;i<=33;i++)
        //deCode("СТРДЖТА.",i);
        //for(int i=1;i<=33;i++)
        //deCode(" ПГПГ.",-i);

    }

}
