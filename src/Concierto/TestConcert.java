package Concierto;


import li.Screen;

public class TestConcert {
    public static void main(String[] args) {
        Test();
    }
    public static Cancion[] cargarSongs(int nc){
        Cancion lista[]=new Cancion[nc];
        lista[0]=new Cancion(1,"On","Map of the Soul: 7","BTS",346,"src/Concierto/recursos/1BTS-On.mp3","src/Concierto/recursos/1BTS-On.jpg");
        lista[1]=new Cancion(2,"Fire","The Most Beautiful Moment in Life: Young Forever.","BTS",341,"src/Concierto/recursos/2BTS - FIRE.mp3","src/Concierto/recursos/2BTS - FIRE.jpg");
        lista[2]=new Cancion(3,"Dope","The Most Beautiful Moment in Life: Young Forever.","BTS",256,"src/Concierto/recursos/3BTS-Dope.mp3","src/Concierto/recursos/3BTS-Dope.jpg");
        lista[3]=new Cancion(4,"DNA","Love Yourself: Her","BTS",255,"src/Concierto/recursos/4BTS-DNA.mp3","src/Concierto/recursos/4BTS-DNA.jpg");
        lista[4]=new Cancion(5,"Blue & Grey","BE","BTS",267,"src/Concierto/recursos/5BTS-Blue and Grey.mp3","src/Concierto/recursos/5BTS-Blue and Grey.jpg");
        lista[5]=new Cancion(6,"Black Swan","Map of the Soul: 7.","BTS",217,"src/Concierto/recursos/6BTS-Black Swan.mp3","src/Concierto/recursos/6BTS-Black Swan.jpg");
        lista[6]=new Cancion(7,"Blood Sweat & Tears","Wings","BTS",366,"src/Concierto/recursos/7BTS-Blood Sweat & Tears.mp3","src/Concierto/recursos/7BTS-Blood Sweat & Tears.jpg");
        lista[7]=new Cancion(8,"Fake Love","Love Yourself: Tear","BTS",318,"src/Concierto/recursos/8BTS-FAKE LOVE.mp3","src/Concierto/recursos/8BTS-FAKE LOVE.jpg");
        lista[8]=new Cancion(9,"Life goes on","Be","BTS",230,"src/Concierto/recursos/9BTS-Life Goes On.mp3","src/Concierto/recursos/9BTS-Life Goes On.jpg");
        lista[9]=new Cancion(10,"Boy With Luv (Feat.Halsey)","Map of the Soul: Persona","BTS",252,"src/Concierto/recursos/10BTS-Boy With Luv.mp3","src/Concierto/recursos/10BTS-Boy With Luv.jpg");
        lista[10]=new Cancion(11,"Dynamite","Be","BTS",223,"src/Concierto/recursos/11BTS-Dynamite.mp3","src/Concierto/recursos/11BTS-Dynamite.jpg");
        lista[11]=new Cancion(12,"Butter","Butter / Permission to Dance","BTS",182,"src/Concierto/recursos/12BTS-Butter.mp3","src/Concierto/recursos/12BTS-Butter.jpg");
        lista[12]=new Cancion(13,"Airplane pt.2","Love Yourself: Tear","BTS",218,"src/Concierto/recursos/13BTS-Airplane Part 2.mp3","src/Concierto/recursos/13BTS-Airplane Part 2.jpg");
        lista[13]=new Cancion(14,"Silver Spoon (Baepsae)","The Most Beautiful Moment In Life, Part 2","BTS",235,"src/Concierto/recursos/14BTS-Silver Spoon (Baepsae).mp3","src/Concierto/recursos/14BTS-Silver Spoon (Baepsae).jpg");
        lista[14]=new Cancion(15,"Disease","BE","BTS",239,"src/Concierto/recursos/15BTS-Dis-ease.mp3","src/Concierto/recursos/15BTS-Dis-ease.jpg");
        lista[15]=new Cancion(16,"Telepathy","Be","BTS",215,"src/Concierto/recursos/16BTS-Telepathy.mp3","src/Concierto/recursos/16BTS-Telepathy.jpg");
        lista[16]=new Cancion(17,"Stay","Be","BTS",213,"src/Concierto/recursos/17BTS -Stay.mp3","src/Concierto/recursos/17BTS -Stay.jpg");
        lista[17]=new Cancion(18,"So What","Love Yourself: Tear","BTS",278,"src/Concierto/recursos/18BTS-SO WHAT.mp3","src/Concierto/recursos/18BTS-SO WHAT.jpg");
        lista[18]=new Cancion(19,"I Need U","The Most Beautiful Moment In Life Pt 1","BTS",210,"src/Concierto/recursos/19BTS-I NEED U.mp3","src/Concierto/recursos/19BTS-I NEED U.jpg");
        lista[19]=new Cancion(20,"Save Me","The Most Beautiful Moment in Life: Young Forever","BTS",216,"src/Concierto/recursos/20BTS-Save ME.mp3","src/Concierto/recursos/20BTS-Save ME.jpg");
        lista[20]=new Cancion(21,"Idol","Love Yourself: Answer","BTS",231,"src/Concierto/recursos/21BTS-IDOL.mp3","src/Concierto/recursos/21BTS-IDOL.jpg");
        lista[21]=new Cancion(22,"Epilogue:Young Forever","The Most Beautiful Moment in Life: Young Forever","BTS",205,"src/Concierto/recursos/22BTS-EPILOGUE  Young Forever.mp3","src/Concierto/recursos/22BTS-EPILOGUE  Young Forever.jpg");
        lista[22]=new Cancion(23,"Spring Day","You Never Walk Alone","BTS",328,"src/Concierto/recursos/23BTS-Spring Day.mp3","src/Concierto/recursos/23BTS-Spring Day.jpg");
        lista[23]=new Cancion(24,"Permission To Dance","Butter / Permission to Dance","BTS",299,"src/Concierto/recursos/24BTS-Permission to Dance.mp3","src/Concierto/recursos/24BTS-Permission to Dance.jpg");
        lista[24]=new Cancion(25,"Mikrokosmos","Map of the Soul: Persona.","BTS",346,"src/Concierto/recursos/25BTS-Mikrokosmos.mp3","src/Concierto/recursos/25BTS-Mikrokosmos.jpg");

        return lista;

    }
    public static void Test(){
        Screen Poster =new Screen();
        Screen Info = new Screen();
        Cancion cancionesL[]=cargarSongs(25);
        Concert cPermisionTD=new Concert(1,cancionesL,25,"Permission to Dance","BTS");
        Runnable mostrarPoster =new Runnable() {
            @Override
            public void run() {
                cPermisionTD.inicializar(Poster,Info);
            }
        };
        Thread mostrarCPoster=new Thread(mostrarPoster);
        mostrarCPoster.start();

    }
}
