package Detyra2;

public class Test{
  public static void main(String[] args) {
      String s1 = """
              Plagjiatura është shkelje e normave akademike por jo e paligjshme; Shkelja e të drejtës së autorit është e paligjshme, por mjaft e zakonshme
              në akademi. Plagjiatura është një vepër kundër autorit; Shkelja e të drejtës së autorit është një shkelje kundër mbajtësit të së drejtës së autorit.\040
              Në botimet tradicionale akademike, ata zakonisht nuk janë i njëjti person, sepse marrëveshjet e transferimit të të drejtës së autorit (CTA) janë kaq të zakonshme.
              Plagjiatura nuk përcaktohet ose ndëshkohet me ligj, por nga institucionet (duke përfshirë shoqatat profesionale, institucionet arsimore 
              dhe subjektet tregtare, siç janë kompanitë botuese). Në shekullin e 1-të, përdorimi i fjalës latine plagiarius (fjalë për fjalë "rrëmbyes") u përdor për të treguar vjedhjen e veprës së dikujt tjetër, 
              nga poeti romak Martial, i cili u ankua se një poet tjetër kishte "rrëmbyer ajetet e tij". Plagjiati, një derivat i plagiarës, u fut në gjuhën angleze në vitin 1601 nga dramaturgu Ben Jonson gjatë 
              epokës Jacobean për të përshkruar një person fajtor për vjedhje letrare. Plagjiatura zbatohet kur kopjohen idetë. Shkelja e të drejtës së autorit ndodh vetëm kur kopjohet një shprehje e caktuar fikse
              (p.sh., sekuenca e fjalëve, përdorim i një imazhi).E drejta e autorit është një mbrojtje që u sigurohet me ligj, autorëve/krijuesve të "veprave origjinale të autorësisë", duke përfshirë vepra letrare, dramatike, 
              muzikore, artistike dhe disa vepra të tjera intelektuale. Ligjet për të drejtat e autorit u krijuan për të siguruar ekuilibër dhe për të mbrojtur të drejtat e krijuesve dhe 
              përdoruesve të përmbajtjes me të drejtë autori.“E drejta e autorit është një formë e mbrojtjes e parashikuar nga ligjet e Shteteve të Bashkuara për veprat origjinale të autorit, 
              duke përfshirë krijimet letrare, dramatike, muzikore, arkitekturore, hartografike, koreografike, pantomimike, piktoreske, grafike, skulpturore dhe audiovizuale.Termi ka ardhur të 
              nënkuptojë atë tërësi të të drejtave ekskluzive që u jepet me ligj autorëve për mbrojtjen e veprës së tyre. Mbrojtja është edhe për veprat e botuara dhe të pabotuara.
              Plagjiatura dhe shkelja e të drejtës së autorit përputhen në një masë të konsiderueshme, por ato nuk janë koncepte ekuivalente dhe shumë lloje të plagjiaturë nuk përbëjnë shkelje të 
              të drejtës së autorit dhe mund të gjykohen nga gjykatat. \s""";

      String s2 = """
              Plagjiatura është shkelje e normave akademike por jo e paligjshme; Shkelja e të drejtës së autorit është e paligjshme, por mjaft e zakonshme\040
              në akademi. Plagjiatura është një vepër kundër autorit. Shmangia e plagjiaturës ka të bëjë me ndarjen e duhur të kredisë intelektuale; e\040
              drejta e autorit ka të bëjë me ruajtjen e rrjedhave të të ardhurave. Eshte e qarte se detektimi i plagjiatures ne menyre softuerike me njohurite e tanishme\040
              eshte e pa ndalshme , per kete arsye edhe kompani te medha si youtube , spotify , ... etj. Nuk tregojne se si behet detektimi per shkak se ekziston nje dere\040
              per keqperdoruesit.E drejta e autorit është një mbrojtje që u sigurohet me ligj, autorëve/krijuesve të "veprave origjinale të autorësisë", duke përfshirë vepra letrare,
              dramatike, muzikore, artistike dhe disa vepra të tjera intelektuale. Ligjet për të drejtat e autorit u krijuan për të siguruar ekuilibër dhe për të mbrojtur të drejtat e krijuesve dhe përdoruesve
              të përmbajtjes me të drejtë autori.Zbulimi i plagjiaturës ose zbulimi i ngjashmërisë së përmbajtjes është procesi i gjetjes së rasteve të plagjiaturës ose shkeljes së të drejtës së autorit brenda
              një vepre ose dokumenti. Përdorimi i gjerë i kompjuterëve dhe ardhja e internetit e kanë bërë më të lehtë plagjiaturën e punës së të tjerëve dhe me universale , pasiqe mund te detektohet nga robotet
              e ndryshem ndersa ne kushtet qe kane qene ka qene i limituar zbulimi , kreatori eshte dashur ta gjeje vet ngjashmerine nese dikush tjeter ka bere plagjiature. Zbulimi i plagjiaturës mund të ndërmerret\040
              në mënyra të ndryshme. Plagjiatura dhe shkelja e të drejtës së autorit përputhen në një masë të konsiderueshme, por ato nuk janë koncepte ekuivalente dhe shumë lloje të plagjiaturë nuk përbëjnë shkelje të\040
              të drejtës së autorit dhe mund të gjykohen nga gjykatat. Plagjiatura nuk përcaktohet ose ndëshkohet me ligj, por nga institucionet (duke përfshirë shoqatat profesionale, institucionet arsimore dhe subjektet tregtare,\040
              siç janë kompanitë botuese). Në shekullin e 1-të, përdorimi i fjalës latine plagiarius (fjalë për fjalë "rrëmbyes") u përdor për të treguar vjedhjen e veprës së dikujt tjetër, nga poeti romak Martial, i cili u ankua se një poet
              tjetër kishte "rrëmbyer ajetet e tij". Plagjiati, një derivat i plagiarës, u fut në gjuhën angleze në vitin 1601 nga dramaturgu Ben Jonson gjatë epokës Jacobean për të përshkruar një person fajtor për vjedhje letrare.
              \s""";

      Plagjiatura obj = new Plagjiatura();
    //  Test obj2 = new Test();
      String[] t1 = s1.split("\\W+");
      String[] t2 = s2.split("\\W+");


      boolean[] b=obj.fjalitengjashme(t1,t2);
      int[] ob= obj.algoritmi(t1,t2);
      obj.kontrollo(b,ob);

    //  obj2.time_second();
    //  obj2.time_millis();
    //  obj2.time_microsecond();
    //  obj2.time_nano();
    //  obj2.time_picosecond();

  }
    public double time_second(){
         double time = System.currentTimeMillis();
         System.out.println("Koha e ekzekutimit në sekonda: " + ((time)/ 1000));

      return ((time)/1000);
    }
    public double time_millis() {

           System.out.println("Koha e ekzekutimit në milisekonda: ");
           System.out.println(System.currentTimeMillis());
        return System.currentTimeMillis();
    }
    public double time_microsecond() {

        double time = System.currentTimeMillis();
        System.out.println("Koha e ekzekutimit në mikrosekonda: " + ((time)* 1000));

        return ((time)*1000);
    }
        public double time_nano () {
            System.out.println("Koha e ekzekutimit në nanosekonda: ");
            System.out.println(System.nanoTime());
        return System.nanoTime();
     }
    public double time_picosecond() {

        double time = System.nanoTime();
        System.out.println("Koha e ekzekutimit në pikosekonda: " + ((time)*1000));

        return ((time)*1000);
    }
}