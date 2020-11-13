package com.ivenavm.uts_201804001

import java.util.ArrayList

object DataProduk {
    private val namaProduk = arrayOf(
        "Manyo Factory",
        "Some by mi",
        "Klavuu",
        "Corsx",
        "Votre Peau",
        "Lacoco",
        "For Skin Sake",
"h.Avoskin",
        "The Bath Box",
        "Sensatia Botanicals",
        "Pampering Day",
        "Luxcrime",
        "Skin Game",
        "Joylab",
        "Harlette Beauty",
        "Somethinc",
        "N'pure",
        "Bhumi",
        "Mellydia",
        "Raiku beuty"
    )

    private val hargaProduk = arrayOf(
        "Rp 250.000",
        "Rp 150.000",
        "Rp 275.000",
        "Rp 165.000",
        "Rp 200.000",
        "Rp 150.000",
        "Rp 105.000",
        "Rp 250.000",
        "Rp 221.000",
        "Rp 320.000",
        "Rp 135.000",
        "Rp 100.000",
        "Rp 265.000",
        "Rp 350.000",
        "Rp 300.000",
        "Rp 140.000",
        "Rp 257.000",
        "Rp 164.000",
        "Rp 302.000",
        "Rp 109.000"
    )
    private val logoProduk = intArrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j,
        R.drawable.k,
        R.drawable.l,
        R.drawable.m,
        R.drawable.n,
        R.drawable.o,
        R.drawable.p,
        R.drawable.q,
        R.drawable.r,
        R.drawable.s,
        R.drawable.t
    )
    val listData: ArrayList<Produk>
        get() {
            val listProduk = arrayListOf<Produk>()
            for (position in namaProduk.indices){
                val makanan = Produk()
                makanan.produk = namaProduk[position]
                makanan.harga = hargaProduk[position]
                makanan.logo = logoProduk[position]
                listProduk.add(makanan)
            }
            return listProduk
        }
}