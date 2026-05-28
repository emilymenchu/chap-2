import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jungle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jungle extends World
{
    GreenfootSound musica = new GreenfootSound("selva.mp3");
    /**
     * Constructor for objects of class Jungle.
     * 
     */
    public Jungle()
    {    
        super(900, 600, 1);
        musica.playLoop();
        prepare(); 
        
    }
    public void detenerMusica()
    {
        musica.stop();
    }
    private void prepare()
    {

        Cat cat = new Cat();
        addObject(cat,811,479);
        cat.setLocation(843,511);
        Bear bear = new Bear();
        addObject(bear,47,506);
        Platform platform = new Platform();
        addObject(platform,116,228);
        platform.setLocation(67,237);
        platform.setLocation(56,238);
        Dispenser dispenser = new Dispenser();
        addObject(dispenser,82,140);

        platform.setLocation(29,199);
        platform.setLocation(46,200);
        platform.setLocation(31,199);
        platform.setLocation(13,194);

        Penguin penguin = new Penguin();
        penguin.velocidadX = -2;
        penguin.limiteMin = 100;
        penguin.limiteMax = 760;
        addObject(penguin,134,100);
        bear.setLocation(47,511);
        Vine vine = new Vine();
        addObject(vine,742,294);
        Candy candy = new Candy();
        addObject(candy,333,267);
        candy.setLocation(139,194);
        vine.setLocation(731,314);
        vine.setLocation(744,298);
        removeObject(vine);
        addObject(vine,816,462);
        Vine vine2 = new Vine();
        addObject(vine2,817,425);
        Vine vine3 = new Vine();
        addObject(vine3,818,376);
        Vine vine4 = new Vine();
        addObject(vine4,818,349);
        Vine vine5 = new Vine();
        addObject(vine5,818,289);
        Vine vine6 = new Vine();
        addObject(vine6,820,263);
        Vine vine7 = new Vine();
        addObject(vine7,820,226);
        Vine vine8 = new Vine();
        addObject(vine8,819,191);
        Vine vine9 = new Vine();
        addObject(vine9,818,160);
        vine9.setLocation(821,145);
        Vine vine10 = new Vine();
        addObject(vine10,821,145);
        vine10.setLocation(823,128);
        Vine vine11 = new Vine();
        addObject(vine11,823,128);
        vine11.setLocation(828,112);
        Vine vine12 = new Vine();
        addObject(vine12,828,112);
        vine12.setLocation(830,97);
        Vine vine13 = new Vine();
        addObject(vine13,830,97);
        vine13.setLocation(824,76);
        Vine vine14 = new Vine();
        addObject(vine14,824,76);
        vine14.setLocation(817,57);
        Vine vine15 = new Vine();
        addObject(vine15,817,57);
        vine15.setLocation(812,37);
        Vine vine16 = new Vine();
        addObject(vine16,812,37);
        vine16.setLocation(811,19);
        Vine vine17 = new Vine();
        addObject(vine17,811,19);
        vine17.setLocation(811,2);
        Vine vine18 = new Vine();
        addObject(vine18,811,2);
        vine4.setLocation(823,332);
        vine4.setLocation(823,332);
        vine4.setLocation(821,331);
        vine10.setLocation(843,122);
        vine11.setLocation(825,114);
        removeObject(vine13);
        vine15.setLocation(815,44);
        removeObject(vine16);
        removeObject(vine18);
        removeObject(vine12);
        vine10.setLocation(814,110);
        vine9.setLocation(820,151);
        vine10.setLocation(824,119);
        addObject(vine12,666,1);

        addObject(vine13,663,38);

        addObject(vine16,662,67);
        addObject(vine18,664,108);
        Vine vine19 = new Vine();
        addObject(vine19,663,151);
        Vine vine20 = new Vine();
        addObject(vine20,663,204);
        vine20.setLocation(658,188);
        vine20.setLocation(664,204);
        vine20.setLocation(664,203);
        vine20.setLocation(664,199);
        vine20.setLocation(664,197);
        Vine vine21 = new Vine();
        addObject(vine21,661,224);
        Vine vine22 = new Vine();
        addObject(vine22,659,262);
        Vine vine23 = new Vine();
        addObject(vine23,658,302);
        vine23.setLocation(655,309);
        removeObject(vine23);

        addObject(vine23,519,13);
        Vine vine24 = new Vine();
        addObject(vine24,518,54);
        Vine vine25 = new Vine();
        addObject(vine25,516,99);
        Vine vine26 = new Vine();
        addObject(vine26,516,150);
        Vine vine27 = new Vine();
        addObject(vine27,515,191);
        vine26.setLocation(517,142);
        vine27.setLocation(512,191);
        vine27.setLocation(519,186);
        Vine vine28 = new Vine();
        addObject(vine28,514,211);
        vine28.setLocation(518,237);
        vine28.setLocation(519,231);
        Vine vine29 = new Vine();
        addObject(vine29,516,261);
        Vine vine30 = new Vine();
        addObject(vine30,524,303);
        vine30.setLocation(530,315);
        vine30.setLocation(523,305);
        Vine vine31 = new Vine();
        addObject(vine31,525,335);
        vine31.setLocation(505,350);
        vine30.setLocation(516,313);
        vine23.setLocation(532,27);
        vine23.setLocation(522,19);
        Vine vine32 = new Vine();
        addObject(vine32,362,11);
        Vine vine33 = new Vine();
        addObject(vine33,362,42);
        Vine vine34 = new Vine();
        addObject(vine34,357,70);
        Vine vine35 = new Vine();
        addObject(vine35,358,114);
        Vine vine36 = new Vine();
        addObject(vine36,359,155);
        Vine vine37 = new Vine();
        addObject(vine37,274,16);
        vine37.setLocation(243,27);
        Vine vine38 = new Vine();
        addObject(vine38,243,63);
        Vine vine39 = new Vine();
        addObject(vine39,241,109);
        vine37.setLocation(241,21);
        Vine vine40 = new Vine();
        addObject(vine40,241,149);
        Vine vine41 = new Vine();
        addObject(vine41,238,194);
        Vine vine42 = new Vine();
        addObject(vine42,129,259);
        penguin.setLocation(129,215);
        Vine vine43 = new Vine();
        addObject(vine43,129,215);
        penguin.setLocation(129,178);
        Vine vine44 = new Vine();
        addObject(vine44,129,178);
    
        Vine vine45 = new Vine();
        addObject(vine45,127,133);
        removeObject(vine45);
        removeObject(vine44);
        removeObject(vine43);
        removeObject(vine42);
        penguin.setLocation(186,184);
        candy.setLocation(211,194);

        addObject(vine42,236,223);

        addObject(vine43,239,278);
        vine43.setLocation(234,290);
        vine42.setLocation(235,250);
        vine42.setLocation(234,242);
        vine42.setLocation(236,240);
        vine43.setLocation(235,268);
        vine43.setLocation(235,294);
        vine43.setLocation(235,287);

        addObject(vine44,235,325);

        addObject(vine45,206,361);
        vine45.setLocation(211,360);
        Vine vine46 = new Vine();
        addObject(vine46,182,356);
        vine46.setLocation(167,356);
        vine46.setLocation(178,358);
        Vine vine47 = new Vine();
        addObject(vine47,141,357);
        Vine vine48 = new Vine();
        addObject(vine48,104,325);
        Vine vine49 = new Vine();
        addObject(vine49,75,303);
        Vine vine50 = new Vine();
        addObject(vine50,59,269);
        Vine vine51 = new Vine();
        addObject(vine51,49,236);
        platform.setLocation(36,197);
        Vine vine52 = new Vine();
        addObject(vine52,36,197);

        platform.setLocation(79,189);
        vine10.setLocation(822,95);
        vine10.setLocation(818,86);
        vine22.setLocation(664,285);
        Vine vine53 = new Vine();
        addObject(vine53,664,285);
        vine22.setLocation(670,289);
        vine22.setLocation(665,251);
        vine21.setLocation(670,224);
        vine20.setLocation(669,184);
        vine53.setLocation(677,294);
        vine22.setLocation(673,259);
        vine21.setLocation(673,221);
        vine30.setLocation(527,341);
        vine30.setLocation(521,302);
        vine31.setLocation(523,336);
        vine31.setLocation(521,357);
        vine31.setLocation(527,339);
        Vine vine54 = new Vine();
        addObject(vine54,379,218);
        vine54.setLocation(374,195);
        vine36.setLocation(368,158);
        vine54.setLocation(372,187);
        vine54.setLocation(372,196);
        Vine vine55 = new Vine();
        addObject(vine55,376,245);
        vine55.setLocation(379,239);
        Vine vine56 = new Vine();
        addObject(vine56,377,269);
    }
}
