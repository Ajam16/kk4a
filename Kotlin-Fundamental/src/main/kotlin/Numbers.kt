fun main(){
    val panjang = "22"
    val lebar = 12.6
    val tinggi = 11
    val volume : Double

    val p = panjang.toDouble()
    val l = lebar
    val t = tinggi.toDouble()
    print("Volume dari balok yang mempunyai panjang $panjang, lebar $lebar dan tinggi $tinggi ini adalah ${hitungVolume(p, l, t)}")
}
fun hitungVolume(p : Double, l : Double, t : Double) : Float
    {
    val v = p * l * t

    return v.toFloat()
}
