package com.example.barvolume1;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Bonang",
            "Gambang",
            "Gender",
            "Gong",
            "Kempul",
            "Kempyang",
            "Kendang",
            "Kethuk",
            "Rebab",
            "Siter",
            "Suling"
    };

    private static String[] heroDetails = {
            "Bonang merupakan alat musik pendukung gamelan yang penting. Fungsinya yaitu sebagai penguat melodi dasar pada sebuah lagu (gendhing). Bentuknya seperti pot yang terbuat dari perunggu. Bonang pada umumnya berjumlah 14 buah yang ditempatkan berjejer di sebuah tempat menyerupai rak. Cara memainkan bonang ini adalah dengan memukul bagian pot perunggu menggunakan 2 palu tabuh. Biasanya palu tabuh ini dibalut dengan lapisan kain atau karet pada salah satu ujungnya.",
            "Gambang merupakan salah satu alat musik gamelan yang dimainkan dengan cara dipukul dengan alat yang disebut tabuh.Memiliki bentuk dan suara yang unik dan khas.Pada dasarnya gambang dibuat dari kayu dan bagian penghasil nadanya dibuat dari kayu atau bambu yang dibentuk menjadi bilah bilah. Bilah-bilah tersebut berisi 18 buah yang biasanya diletakkan disebuah rak resonantor nada berbentuk mirip perahu.Bentuk bilah nya disusun berurutan mulai dari paling kecil hingga terbesar agar nada yang dikeluarkan bisa bervariasi.",
            "Gender dibuat dari logam kuningan yang dibentuk menjadi bilah bilah. Pada umumnya alat music ini memiliki 10 sampai 14 bilah yang saat dimainkan menghasilkan nada yang berbeda. Gender dimainkan dengan cara dipukul menggunakan alat bernama tabuh yang berbentuk bulat dan ujungnya dilapisi kain.",
            "Gong ini merupakan alat musik gamelan yang paling besar. Alat ini berfungsi untuk memberi tanda awal dan berakhirnya sebuah lagu atau gendhing. Gong akan memberi rasa keseimbangan setelah berlalunya lagu dengan lirik yang panjang. Salah satu alat musik gamelan ini dibunyikan dengan cara dipukul.Gong umumnya dibuat bahan logam kuningan. Biasanya diletakkan dengan cara digantung dalam sebuah panahan.",
            "Penampakan kempul sekilas mirip gong namun lebih kecil. Oleh karena itu sering disebut gong kecil. Fungsi kempul ini yaitu untuk menegaskan irama melodi dalam sebuah lagu (gendhing).Kempul dapat menghasilkan suara lebih tinggi dari alat musik gong.Kempul biasanya berjumlah 8 hingga 10 buah yang masing masing menghasilkan nada yang berbeda beda. Alat pemukulnya terbuat dari bahan kayu yang salah satu bagian ujung(untuk memukul) diberi lapisan kain yang cukup tebal.",
            "Kempyang berfungsi sebagai alat musik ritmis dalam pertunjukan gamelan.Selain itu digunakan untuk membantu kendang agar menghasilkan sebuah ritme yang diinginkan. Biasanya kempyang dimainkan bersahutan dengan kethuk hingga menghasilkan bunyi Tuk Bluk Tuk Bluk dan membentuk harmoni yang indah.",
            "Kendang ini berfungsi untuk mengatur irama dan tempo dari gendhing (lagu yang dimainkan). Bunyi kendang biasanya mengatur tempo pokok,Irama cepat maupun lambat dengan tangkap. Cara memainkan alat musik ini yaitu dengan cara di tabuh atau dipukul dengan tangan pada bagian permukaan kulitnya.Biasanya permukaan kulit ini terbuat dari kulit hewan seperti kerbau,sapi, kambing atau rusa.Namun beberapa pengrajin Kendang meyakini bahwa penggunaan kulit kerbau adalah terbaik sebagai bahan baku karena dianggap lebih awet ketimbang kulit hewan lain",
            "Dalam permainan gamelan, kethuk berfungsi untuk menjaga keajegan irama agar tetap harmonis. Cara memainkan Kethuk ini adalah dipukul menggunakan sebuah alat pemukul yang dibalut karet atau kain yang cukup tebal pada ujungnya.",
            "Rebab dimainkan dengan cara digesek mirip alat musik biola. Namun dengan ukuran yang lebih kecil. Cara memainkannya yaitu dengan menggesek bagian dawainya menggunakan alat gesek yang bentuknya mirip busur panah. Bagian badan rebab berbentuk bulat dan bagian lainnya mempunyai ujung yang panjang. Fungsi rebab ini yaitu sebagai instrument pemuka dan dijuluki sebagai pemimpin lagu terutama dalam tabuhan yang lirih.Salah satu alat musik gamelan ini juga biasa dimainkan untuk mengiringi sinden ketika bernyanyi.",
            "Dalam pertunjukan gamelan, siter berfungsi sebagai pengendali cengkok. Siter dapat mengeluarkan  suara khas dari 11 dawainya. Pada umumnya alat musik gamelan ini dimainkan dengan kecepatan yang sama dengan alat musik gambang.Walaupun kebanyakan dimainkan dengan tempo yang cepat. Permainan siter membawa pengaruh besar dalam pertunjukan gamelan. Karena Jika terjadi kesalahan nada akan langsung mempengaruhi permainan alat musik yang lain. Hal ini otomatis akan merubah ritme permainan gamelan menjadi tidak teratur dan kurang harmonis.",
            "Suling merupakan alat musik yang dimainkan dengan ditiup. Biasanya terbuat dari kayu atapun dari bambu yang diberi lubang sebagai penentu nada atau laras.Salah satu ujungnya yaitu bagian yang ditiup dinamakan Jambangan. Jambangan ini fungsinya untuk mengalirkan udara hingga menghasilkan getaran udara dan menjadi bunyi. Suling dalam musik gamelan berfungsi sebagai Pangrengga lagu. Suara yang dikeluarkan dari alat musik ini sangat lembut.Karena itu sangat cocok jika dipadukan dengan alat musik gamelan lain.",
    };

    private static int[] heroesImages = {
            R.drawable.bonang,
            R.drawable.gambang,
            R.drawable.gender,
            R.drawable.gong,
            R.drawable.kempul,
            R.drawable.kempyang,
            R.drawable.kendang,
            R.drawable.kethuk,
            R.drawable.rebab,
            R.drawable.siter,
            R.drawable.suling
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
