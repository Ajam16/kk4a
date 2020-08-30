package menghitung.volume.bangun.ruang
import java.util.*


object MenghitungVolumeBangunRuang {
    var rusuk = 0
    var panjang = 0
    var lebar = 0
    var tinggi = 0
    var jari = 0
    fun kubus() {
        val intjumlah = 0
        val bacanil = Scanner(System.`in`)
        print("Menu Volume Kubus\n")
        print("Masukan Rusuk Kubus:")
        rusuk = bacanil.nextInt()
        val jumlah = rusuk * rusuk * rusuk
        println("""Volume Kubus:$rusuk x $rusuk x $rusuk= $jumlah
---------------------""")
    }

    fun Balok() {
        val intjumlah = 0
        val bacanil = Scanner(System.`in`)
        print("Menu Volume Kubus\n")
        print("Masukan Panjang :")
        panjang = bacanil.nextInt()
        print("Masukan Lebar :")
        lebar = bacanil.nextInt()
        print("Masukan Tinggi :")
        tinggi = bacanil.nextInt()
        val jumlah = panjang * lebar * tinggi
        println("""Volume Balok:$panjang x $lebar x $tinggi= $jumlah
---------------------""")
    }

    fun Tabung() {
        val intjumlah = 0
        val bacanil = Scanner(System.`in`)
        print("Menu Volume Kubus\n")
        print("Masukan Jari Jari Lingkaran :")
        jari = bacanil.nextInt()
        print("Masukan Tinggi Tabung :")
        tinggi = bacanil.nextInt()
        val jumlah = (3.14 * jari * jari * tinggi).toInt()
        println("""Volume Tabung: 3.14  x $jari x $jari x $tinggi = $jumlah
---------------------""")
    }

    fun Kerucut() {
        val intjumlah = 0
        val bacanil = Scanner(System.`in`)
        print("Menu Volume Kerucut\n")
        print("Masukan Jari Jari Lingkaran :")
        jari = bacanil.nextInt()
        print("Masukan Tinggi Kerucut :")
        tinggi = bacanil.nextInt()
        println("""Volume Kerucut: 1/3  x $jari x $jari x $tinggi = ${(jari * jari * tinggi / 3)}
---------------------""")
    }

    fun Bola() {
        val intjumlah = 0
        val bacanil = Scanner(System.`in`)
        print("Menu Volume Bola\n")
        print("Masukan Jari Jari Bola :")
        jari = bacanil.nextInt()
        val jumlah = (4 * 3.14 * jari * jari * jari / 3).toInt()
        println("""Volume Bola: 4/3  x phi x $jari x $jari x $jari = $jumlah
---------------------""")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var pilih: Int
        val baca = Scanner(System.`in`)
        var lagi = 'y'
        var nama = ""
        var kelas = ""
        var absen = ""
        do {
            if (nama == ""){
                print("Nama: ")
                nama = baca.nextLine()
            }
            else {
                println("""Nama: $nama""")
            }
            if (kelas == ""){
                print("Kelas: ")
                kelas = baca.nextLine()
            }
            else {
                println("""Kelas: $kelas""")
            }
            if (absen == ""){
                print("Absen: ")
                absen = baca.nextLine()
            }
            else {
                println("""Absen: $absen""")
            }

            println("""
    -----------------
    Menu Perhitungan
    -----------------
    1. Volume Kubus 
    2. Volume Balok 
    3. Volume Tabung 
    4. Volume Kerucut
    5. Volume Bola
    -----------------
    """.trimIndent())
            print("Pilihanmu: ")
            pilih = baca.nextInt()
            when (pilih) {
                1 -> kubus()
                2 -> Balok()
                3 -> Tabung()
                4 -> Kerucut()
                5 -> Bola()
                else -> println("menu ada 5 pilihan")
            }
            val baca2 = Scanner(System.`in`)
            print("Pilih menu lagi [y/n]?")
            lagi = baca2.next()[0]
        } while (lagi == 'y')
    }
}