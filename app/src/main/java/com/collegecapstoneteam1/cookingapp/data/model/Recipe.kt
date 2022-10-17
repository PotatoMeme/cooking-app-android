package com.collegecapstoneteam1.cookingapp.data.model


import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Entity(tableName = "recipes")
@Parcelize
data class Recipe(

    @ColumnInfo(name = "ATT_FILE_NO_MAIN")
    @SerializedName("ATT_FILE_NO_MAIN")
    val aTTFILENOMAIN: String,

    @ColumnInfo(name = "ATT_FILE_NO_MK")
    @SerializedName("ATT_FILE_NO_MK")
    val aTTFILENOMK: String,

    @ColumnInfo(name = "HASH_TAG")
    @SerializedName("HASH_TAG")
    val hASHTAG: String,

    @ColumnInfo(name = "INFO_CAR")
    @SerializedName("INFO_CAR")
    val iNFOCAR: String,

    @ColumnInfo(name = "INFO_ENG")
    @SerializedName("INFO_ENG")
    val iNFOENG: String,

    @ColumnInfo(name = "INFO_FAT")
    @SerializedName("INFO_FAT")
    val iNFOFAT: String,

    @ColumnInfo(name = "INFO_NA")
    @SerializedName("INFO_NA")
    val iNFONA: String,

    @ColumnInfo(name = "INFO_PRO")
    @SerializedName("INFO_PRO")
    val iNFOPRO: String,

    @ColumnInfo(name = "INFO_WGT")
    @SerializedName("INFO_WGT")
    val iNFOWGT: String,

    @ColumnInfo(name = "MANUAL01")
    @SerializedName("MANUAL01")
    val mANUAL01: String,

    @ColumnInfo(name = "MANUAL02")
    @SerializedName("MANUAL02")
    val mANUAL02: String,

    @ColumnInfo(name = "MANUAL03")
    @SerializedName("MANUAL03")
    val mANUAL03: String,

    @ColumnInfo(name = "MANUAL04")
    @SerializedName("MANUAL04")
    val mANUAL04: String,

    @ColumnInfo(name = "MANUAL05")
    @SerializedName("MANUAL05")
    val mANUAL05: String,

    @ColumnInfo(name = "MANUAL06")
    @SerializedName("MANUAL06")
    val mANUAL06: String,

    @ColumnInfo(name = "MANUAL07")
    @SerializedName("MANUAL07")
    val mANUAL07: String,

    @ColumnInfo(name = "MANUAL08")
    @SerializedName("MANUAL08")
    val mANUAL08: String,

    @ColumnInfo(name = "MANUAL09")
    @SerializedName("MANUAL09")
    val mANUAL09: String,

    @ColumnInfo(name = "MANUAL10")
    @SerializedName("MANUAL10")
    val mANUAL10: String,

    @ColumnInfo(name = "MANUAL11")
    @SerializedName("MANUAL11")
    val mANUAL11: String,

    @ColumnInfo(name = "MANUAL12")
    @SerializedName("MANUAL12")
    val mANUAL12: String,

    @ColumnInfo(name = "MANUAL13")
    @SerializedName("MANUAL13")
    val mANUAL13: String,

    @ColumnInfo(name = "MANUAL14")
    @SerializedName("MANUAL14")
    val mANUAL14: String,

    @ColumnInfo(name = "MANUAL15")
    @SerializedName("MANUAL15")
    val mANUAL15: String,

    @ColumnInfo(name = "MANUAL16")
    @SerializedName("MANUAL16")
    val mANUAL16: String,

    @ColumnInfo(name = "MANUAL17")
    @SerializedName("MANUAL17")
    val mANUAL17: String,

    @ColumnInfo(name = "MANUAL18")
    @SerializedName("MANUAL18")
    val mANUAL18: String,

    @ColumnInfo(name = "MANUAL19")
    @SerializedName("MANUAL19")
    val mANUAL19: String,

    @ColumnInfo(name = "MANUAL20")
    @SerializedName("MANUAL20")
    val mANUAL20: String,

    @ColumnInfo(name = "MANUAL_IMG01")
    @SerializedName("MANUAL_IMG01")
    val mANUALIMG01: String,

    @ColumnInfo(name = "MANUAL_IMG02")
    @SerializedName("MANUAL_IMG02")
    val mANUALIMG02: String,

    @ColumnInfo(name = "MANUAL_IMG03")
    @SerializedName("MANUAL_IMG03")
    val mANUALIMG03: String,

    @ColumnInfo(name = "MANUAL_IMG04")
    @SerializedName("MANUAL_IMG04")
    val mANUALIMG04: String,

    @ColumnInfo(name = "MANUAL_IMG05")
    @SerializedName("MANUAL_IMG05")
    val mANUALIMG05: String,

    @ColumnInfo(name = "MANUAL_IMG06")
    @SerializedName("MANUAL_IMG06")
    val mANUALIMG06: String,

    @ColumnInfo(name = "MANUAL_IMG07")
    @SerializedName("MANUAL_IMG07")
    val mANUALIMG07: String,

    @ColumnInfo(name = "MANUAL_IMG08")
    @SerializedName("MANUAL_IMG08")
    val mANUALIMG08: String,

    @ColumnInfo(name = "MANUAL_IMG09")
    @SerializedName("MANUAL_IMG09")
    val mANUALIMG09: String,

    @ColumnInfo(name = "MANUAL_IMG10")
    @SerializedName("MANUAL_IMG10")
    val mANUALIMG10: String,

    @ColumnInfo(name = "MANUAL_IMG11")
    @SerializedName("MANUAL_IMG11")
    val mANUALIMG11: String,

    @ColumnInfo(name = "MANUAL_IMG12")
    @SerializedName("MANUAL_IMG12")
    val mANUALIMG12: String,

    @ColumnInfo(name = "MANUAL_IMG13")
    @SerializedName("MANUAL_IMG13")
    val mANUALIMG13: String,

    @ColumnInfo(name = "MANUAL_IMG14")
    @SerializedName("MANUAL_IMG14")
    val mANUALIMG14: String,

    @ColumnInfo(name = "MANUAL_IMG15")
    @SerializedName("MANUAL_IMG15")
    val mANUALIMG15: String,

    @ColumnInfo(name = "MANUAL_IMG16")
    @SerializedName("MANUAL_IMG16")
    val mANUALIMG16: String,

    @ColumnInfo(name = "MANUAL_IMG17")
    @SerializedName("MANUAL_IMG17")
    val mANUALIMG17: String,

    @ColumnInfo(name = "MANUAL_IMG18")
    @SerializedName("MANUAL_IMG18")
    val mANUALIMG18: String,

    @ColumnInfo(name = "MANUAL_IMG19")
    @SerializedName("MANUAL_IMG19")
    val mANUALIMG19: String,

    @ColumnInfo(name = "MANUAL_IMG20")
    @SerializedName("MANUAL_IMG20")
    val mANUALIMG20: String,

    @ColumnInfo(name = "RCP_NM")
    @SerializedName("RCP_NM")
    val rCPNM: String,

    @ColumnInfo(name = "RCP_PARTS_DTLS")
    @SerializedName("RCP_PARTS_DTLS")
    val rCPPARTSDTLS: String,

    @ColumnInfo(name = "RCP_PAT2")
    @SerializedName("RCP_PAT2")
    val rCPPAT2: String,

    @PrimaryKey(autoGenerate = false)
    @SerializedName("RCP_SEQ")
    val rCPSEQ: String,

    @ColumnInfo(name = "RCP_WAY2")
    @SerializedName("RCP_WAY2")
    val rCPWAY2: String
) : Parcelable {
    fun getDetailList(): List<Detail> {
        val size = getDetailSize()
        val list = mutableListOf<Detail>()

        if (size == 0) {
            return list
        }

        list.add(Detail(mANUAL01, mANUALIMG01))
        if (size == 1) {
            return list
        }

        list.add(Detail(mANUAL02, mANUALIMG02))
        if (size == 2) {
            return list
        }

        list.add(Detail(mANUAL03, mANUALIMG03))
        if (size == 3) {
            return list
        }

        list.add(Detail(mANUAL04, mANUALIMG04))
        if (size == 4) {
            return list
        }

        list.add(Detail(mANUAL05, mANUALIMG05))
        if (size == 5) {
            return list
        }

        list.add(Detail(mANUAL06, mANUALIMG06))
        if (size == 6) {
            return list
        }

        list.add(Detail(mANUAL07, mANUALIMG07))
        if (size == 7) {
            return list
        }

        list.add(Detail(mANUAL08, mANUALIMG08))
        if (size == 8) {
            return list
        }

        list.add(Detail(mANUAL09, mANUALIMG09))
        if (size == 9) {
            return list
        }

        list.add(Detail(mANUAL10, mANUALIMG10))
        if (size == 10) {
            return list
        }

        list.add(Detail(mANUAL11, mANUALIMG11))
        if (size == 11) {
            return list
        }

        list.add(Detail(mANUAL12, mANUALIMG12))
        if (size == 12) {
            return list
        }

        list.add(Detail(mANUAL13, mANUALIMG13))
        if (size == 13) {
            return list
        }

        list.add(Detail(mANUAL14, mANUALIMG14))
        if (size == 14) {
            return list
        }

        list.add(Detail(mANUAL15, mANUALIMG15))
        if (size == 15) {
            return list
        }

        list.add(Detail(mANUAL16, mANUALIMG16))
        if (size == 16) {
            return list
        }

        list.add(Detail(mANUAL17, mANUALIMG17))
        if (size == 17) {
            return list
        }

        list.add(Detail(mANUAL18, mANUALIMG18))
        if (size == 18) {
            return list
        }


        list.add(Detail(mANUAL19, mANUALIMG19))
        if (size == 19) {
            return list
        }

        list.add(Detail(mANUAL20, mANUALIMG20))
        return list
    }

    fun getDetailSize(): Int {
        if (mANUAL01.isNullOrEmpty()) {
            return 0
        } else if (mANUAL02.isNullOrEmpty()) {
            return 1
        } else if (mANUAL03.isNullOrEmpty()) {
            return 2
        } else if (mANUAL04.isNullOrEmpty()) {
            return 3
        } else if (mANUAL05.isNullOrEmpty()) {
            return 4
        } else if (mANUAL06.isNullOrEmpty()) {
            return 5
        } else if (mANUAL07.isNullOrEmpty()) {
            return 6
        } else if (mANUAL08.isNullOrEmpty()) {
            return 7
        } else if (mANUAL09.isNullOrEmpty()) {
            return 8
        } else if (mANUAL10.isNullOrEmpty()) {
            return 9
        } else if (mANUAL11.isNullOrEmpty()) {
            return 10
        } else if (mANUAL12.isNullOrEmpty()) {
            return 11
        } else if (mANUAL13.isNullOrEmpty()) {
            return 12
        } else if (mANUAL14.isNullOrEmpty()) {
            return 13
        } else if (mANUAL15.isNullOrEmpty()) {
            return 14
        } else if (mANUAL16.isNullOrEmpty()) {
            return 15
        } else if (mANUAL17.isNullOrEmpty()) {
            return 16
        } else if (mANUAL18.isNullOrEmpty()) {
            return 17
        } else if (mANUAL19.isNullOrEmpty()) {
            return 18
        } else if (mANUAL20.isNullOrEmpty()) {
            return 19
        } else {
            return 20
        }
    }
}