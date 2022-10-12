package com.amrul.test.testapp.data

import com.amrul.test.testapp.R
import com.amrul.test.testapp.model.Cat

object CatData {

    private val catNames = arrayOf(
            "Kucing Abisinia",
            "Kucing Bengal",
            "Kucing Birma",
            "Kucing Bulu Pendek Britania",
            "Kucing Hutan Norwegia",
            "Kucing Laperm",
            "Kucing Nebelung",
            "Kucing Ragdoll",
            "Kucing Rex Cornish",
            "Kucing Sabana",
            "Kucing Siam",
            "Kucing Telinga Lipat Skotlandia",
            "Kucing Munchkin",
            "Kucing Persia",
            "Kucing Russian Blue"
    )
    private val catPrice = arrayOf(
            "Kisaran harga Rp8.000.000 – Rp17.500.000",
            "Kisaran harga Rp2.500.000 – Rp40.000.000",
            "Kisaran harga Rp6.700.000 – Rp12.000.000",
            "Kisaran harga Rp500.000 – Rp40.000.000",
            "Kisaran harga Rp10.000.000 -an",
            "Kisaran harga Rp5.318.800 – Rp7.978.200",
            "Kisaran harga Rp3.989.100 – Rp6.648.500",
            "Kisaran harga Rp1.000.000  – Rp30.000.000",
            "Kisaran harga Rp3.989.100 – Rp7.978.200",
            "Kisaran harga Rp126.000.000 – Rp343.000.000",
            "Kisaran harga Rp300.000 – Rp3.000.000",
            "Kisaran harga Rp2.500.000 – Rp25.000.000",
            "Kisaran harga Rp955.000 – Rp10.200.000",
            "Kisaran harga Rp650.000 – Rp7.000.000",
            "Kisaran harga Rp450.000 – Rp39.000.000"

    )

    private val catDetails = arrayOf(
            "Belum ada sejarah pasti yang mencatat darimana asal muasal dari kucing Abisinia ini. Ada yang berpendapat jika kucing ini berasal dari negara Ethiopia dan ada juga yang berpendapat jika kucing ini berasal dari Mesir. Tetapi, yang pasti banyak juga orang yang percaya jika kucing ras ini adalah kucing tertua yang ada di dunia. Pasalnya, bentuk dan juga rupanya yang menyerupai lukisan yang terdapat di masa Mesir Kuno.",
            "Kucing bengal atau juga disebut sebagai blacan adalah hasil kawin silang dengan pola spotted wild cat yang dilakukan oleh dr. Centerwall seorang ahli genetic. Awalnya, beliau mengawin silangkan antara kucing american shorthair dengan kucing asian leopard. Dan dari hasil kawin silang tersebut melahirkan anak betani. Dan kemudian anak petani tersebut dikawinkan dengan ayahnya. Dan lahirlah si kucing bengal ini. Meskipun masih satu family dengan leopard, kucing bengal ini memiliki karakteristik yang jinak dan juga ramah. Bahkan si bengal ini juga sangat mahir dalam berenang.",
            "Kucing Birman merupakan kucing yang berasal dari negara Myanmar, oleh sebab itu, kucing ini dinamakan sebagai Birma dan termasuk ke dalam kucing ras oriental. Kucing dari ras ini juga dikenal sebagai sahabat untuk para biksu maupun pendeta yang ada di Myanmar. Bahkan ada beberapa orang yang meyakini bahwa kucing ini adalah kucing yang suci. Terlepas dari benar tidaknya, tetapi kucing ini pada waktu ini telah menjadi salah satu hewan peliharaan, terutama untuk para pecinta kucing.",
            "Sesuai dengan namanya, kucing yang satu ini juga berasal dari negara Inggris, sehingga disebut sebagai Kucing British Shorthair. Kucing ini diyakini sebagai salah satu ras kucing yang tertua di dunia. Dan ada juga yang menyebutkan jika keberadaan kucing ini tak lepas dari peran orang romawi kuno yang terdahulu dalam mengkoloni daerah Inggris. Orang romawi pada zaman itu memerlukan binatang yang ditugaskan untuk memburu sekaligus untuk menjaga ladang pertanian dari hama seperti tikus atau semacamnya. Oleh sebab itu, mereka kemudian membawa serta memanfaatkan kucing ini sebagai hewan untuk melindungi ladang tersebut. Dan tentunya si kucing tersebut pada waktu itu memiliki sifat liar sebab dilatih untuk menjadi pekerja. Lalu, kucing tersebut kemudian berkembangbiak secara pesat, si kucing kemudian kawin dengan jenis lokal serta mampu menghasilkan kucing dengan memiliki fisik tubuh yang indah yakni berbulu halus dan juga tebal.",
            "Tidak ada sejarah pasti yang menyebutkan sejarah dari kucing hutan yang satu ini. Namun ada yang menduga jika kucing ini adalah keturunan dari kucing-kucing berbulu panjang dari Turki, yang kemudian dibawa kembali dari Byzantium oleh para prajurit Skandinavia yang melayani Kekaisaran Bizantium. Dan atau mungkin merupakan keturunan dari kucing Siberia dari Rusia. Atau juga bisa jadi kucin ini adalah barang rampasan Viking, atau memang hasil seleksi alam. Selama berabad-abad yang laku, kucing hutan atau Skogcat (Bahasa Norwegia) ini telah menjadi ‘teman’ petani atau ibu rumah tangga. Mereka memiliki tugas untuk mengusir tikus. Dan sebagai imbalannya, mereka dapat memperoleh rumah serta makanannya secara teratur. Kemudian di tahun 1938, suatu pertunjukkan di Oslo sempat menunjukan kucing-kucing ini. Tetapi kemudian peristiwa Perang Dunia II menghambat proses pengembangan breed kucing hutan. Beruntung, sebagian dari kucing-kucing ini bisa selamat dari perang. Tetapi pasca perang, eksistensi dari kucing hutan memang sempat terusik. Lalu di tahun 1977, kucing ini sudah resmi terdaftar sebagai breed dalam Federasi Feline Internasional Eropa.",
            "Laperm adalah salah satu jenis kucing yang berasal dari Amerika Serikat. Kucing ini merupakan hasil dari perkawinan genetik secara spontanitas. Kucing ini memiliki ciri secara fisik yang khas di mana memiliki bulu yang bergelombang, tidak terlalu panjang ataupun pendek, dan bertekstur halus. Sebab memiliki bentuk bulu yang unik, banyak para pecinta kucing yang tertarik pada kucing Laperm yang satu ini. Bulunya juga merendahkan resiko alergi pada waktu memegang ataupun menggendong kucing jenis ini. Sehingga, dapat dikatakan jika kucing Laperm ini aman untuk dipelihara pada setiap kalangan usia.",
            "Kucing Nebelung merupakan kucing yang berasal dari Amerika Serikat serta tergolong ke dalam kelompok kucing langka yang ada di dunia. Pada mulanya, kucing ini ditemukan oleh seorang yang bernama Cora Cobb. Kucing ini adalah hasil dari perkawinan silang antara kucing anggora yang berbulu hitam dengan kucing ras domestik yang berbulu pendek. Dan hasil dari kawin silang tersebut kemudian melahirkan bayi kucing yang memiliki bulu tubuh yang lebih panjang sehingga kucing tersebut diberi nama sebagai ras Nebelung. Maka tak heran apabila kucing ini mempunyai ciri fisiknya yang hampir sama dengan kucing ras Russian Blue. Dan harganya pun cukup fantastis sebab kucingnya yang begitu langka. Postur tubuhnya berukuran sedang dengan diselimuti bulu yang sangat tebal dan juga halus. Di mana kucing ini kebanyakan berwarna kebiruan.",
            "Kucing ragdoll adalah hasil dari perkawinan silang antara kucing Persia dengan Birma. Lalu hasil dari kawin silang tersebut melahirkan kucing khas yang hampir sama dengan keturunannya, terutama pada karakteristiknya. Kucing jenis ini terlihat lebih lemah serta santai dalam menghadapi berbagai hal. Dan kucing ini sangat penurut apabila digendong oleh pemiliknya ataupun orang lain. Pada mulanya, kucing Ragdol dipelihara dan kemudian dikembangkan oleh salah seorang pecinta kucing yang berasal dari Amerika Serikat yang bernama Ann Baker. Ann Baker kemudian mengawinkan silangkan antara dua jenis kucing yakni Persia dengan kucing domestik yang berwarna hitam. Dan berhasil melahirkan seekor bayi kucing berjenis Ragdoll. Sedangkan untuk ciri fisiknya yaitu memiliki ukuran tubuh yang relatif besar disertai dengan balutan bulu yang sangat halus. Oleh sebab itulah, kucing ragdoll ini termasuk ke dalam kategori kucing terbesar yang ada di dunia.",
            "Kucing rex cornish yang merupakan jenis ras kucing yang berasal dari negara Inggris. Kucing ras ini juga terlihat sangat menggemaskan serta lucu. Terlebih lagi kucing ini sangat gemar bermain bahkan bisa berakrobat layaknya seekor anjing. Kucing ras ini juga dikenal sebagai ras kucing anti-alergi, sebab tubuhnya mengandung allergen di dalamnya. Maka dari itu, kucing Rez Cornish ini sangat aman untuk semua kalangan dari berbagai usia mulai dari usia anak-anak hingga dewasa.",
            "Kucing Sabana atau sering dieja menjadi Savannah adalah kucing perkawinan silang dari kucing domestik dengan kucing Afrika yang liar. Kucing bukan merupakan kucing lama atau kuno sebab kucing ini baru dikembangbiakkan di sekitar tahun 1968. Pada mulanya ditemukan sekaligus dikembangkan, kucing ini masih cukup liar di mana merupakan salah satu sifat keturunan dari nenek moyangnya. Tetapi semakin lama si kucing Sabana ini kemudian menjadi jinak serta aman untuk dijadikan sebagai kucing peliharaan. Kucing ini juga mewarisi sifat dari nenek moyangnya sebagai kucing liar di mana ia lebih suka untuk berkeliaran di luar ruangan ataupun di alam terbuka. Oleh sebab itu, kucing Sabana mudah sekali merasa bosan pada waktu berada di dalam kandang ataupun rumah dalam jangka waktu yang lama.",
            "Kucing siam merupakan kucing yang berasal dari Thailand serta keberadaannya sudah sangat lama diketahui serta dan bahkan pasalnya termaktub di dalam manuskrip kuno Thailand. Tetapi di dalam perkembangannya serta penyebarannya sendiri baru dilaksanakan ketika modern yakni sekitar pada abad ke-19. Yang pada waktu itu terdapat kontes pameran kucing hias di acara Crystal Palace di London. Karakteristik pada kucing ini cenderung cerdas, gemar bermain, dan sangat peduli kepada pemiliknya. Oleh sebab itu, kucing tersebut cocok untuk dijadikan sebagai hewan peliharaan kesayanagn kalian. Kucing Siam ini terbagi ke dalam beberapa jenis, antara lain: jenis tradisional, klasik, dan jenis modern. Perbedaan diantara ketiganya hanya terletak di bagian postur tubuhnya saja.",
            "Sesuai dengan namanya, kucing yang satu ini berasal dari Skotlandia dengan memiliki ciri khas pada telinganya yang melipat serta terlihat kecil. Kucing ini juga memiliki sebutan lain yaitu kucing scottish fold. Pada mulanya, kucing ras ini ditemukan pada ladang pertanian kepunyaan seseorang di daerah Perthsire, Skotlandia. Kucing itu kemudian diberi nama Susie serta dijumpai tengah hamil dan kemudian melahirkan seekor bayi kucing dengan memiliki fisik yang sama dengan induknya. Dan berawal dari situlah, bayi kucing itu kemudian diadopsi oleh salah seorang dari pecinta kucing. Mereka kemudian dipelihara serta kemudian dikembangbiakkan dengan baik bersama dengan pada ahli genetik dan juga binatang.",
            "Kucing selanjutnya yang juga berasal dari Inggir adalah Munchkin. Kucing ini memiliki perawakan yang sangat mungil. Sehingga terlihat sangat menggemaskan karena kakinya yang kecil dan pendek. Sebab postur tubuhnya yang mungil itulah, banyak orang pada awalnya mengira jika kucing jenis ini memiliki kelainan. Tetapi kenyataannya, sesudah diteliti secara mendalam hal tersebut adalah hal biasa serta aman-aman saja. Walaupun begitu, kucing tersebut memiliki karakter khas yang sangat aktif dan juga energik. Kucing ini juga terkenal sebagai jenis kucing yang mudah untuk berbaur dengan lingkungan barunya, suka bermain, terutama dengan anak-anak. Sehingga tak mengherankan apabila banyak sekali anak kecil yang menyukai kucing jenis ini. Kucing jenis ini juga tergolong ke dalam jenis baru yang merupakan persilangan genetika antara kucing domestik dengan kucing kaki pendek. Kucing ini baru diperkenalkan kepada dunia luas di tahun 1991 serta baru memperoleh pengakuan dari organisasi kucing dunia TICA di tahun 1995.",
            "Sesuai dengan namanya, kucing persia berasal dari Iran atau Persia. Kucing ini merupakan ras dari kucing domestik berbulu panjang serta memiliki karakter wajah yang bulat dan moncong yang pendek. Jenis dari kucing persia ini juga cukup banyak, seperti: kucing persia flatnose, peaknose, persia himalaya, kucing persia medium, serta kucing persia campuran kucing kampung. Pada setiap jenisnya, sebetulnya kucing persia tersebut mempunyai kesamaan dalam postur tubuhnya, hanya pada beberapa bagian tubuh saja yang membedakannya.",
            "Kucing russian blue ini berasal dari Rusia. Konon katanya, kucing ini dibawa oleh seorang pelaut dari Pulau Archangle menuju Rusia sekitar pada pertengahan abad ke-19 lalu. Seiring perkembangan waktu, kucing ini kemudian menyebar hingga ke berbagai negara di bagian skandinavia sampai berakhirnya perang dunia kedua. Hanya saja, si kucng ini belum menyebar sampai ke bagian negara lainnya, sehingga salah seorang yang berasal dari Amerika Serikat membuat inovasi. Dengan cara mengawinkan silangkan antara kucing biru Rusia dengan dari Skandinavia dan dengan kucing Inggris, sehingga akan menghasilkan jenis kucing baru bernama Russian Blue sama seperti pada nenek moyangnya."
    )

    private val catImages = intArrayOf(
            R.drawable.kucing_abisinia,
            R.drawable.kucing_bengal,
            R.drawable.kucing_birma,
            R.drawable.kucing_bulu_pendek_britania,
            R.drawable.kucing_hutan_norwegia,
            R.drawable.kucing_laperm,
            R.drawable.kucing_nebelung,
            R.drawable.kucing_ragdoll,
            R.drawable.kucing_rex_cornish,
            R.drawable.kucing_sabana,
            R.drawable.kucing_siam,
            R.drawable.kucing_telinga_lipat_skotlandia,
            R.drawable.munchkin_cat,
            R.drawable.persian_cat,
            R.drawable.russian_blue_cat
    )

    val listCatData: ArrayList<Cat>
        get() {
            val list = arrayListOf<Cat>()
            for (position in catNames.indices) {
                val cat = Cat()
                cat.nameCat = catNames[position]
                cat.detailCat = catDetails[position]
                cat.priceCat = catPrice[position]
                cat.photoCat = catImages[position]
                list.add(cat)
            }
            return list
        }
}