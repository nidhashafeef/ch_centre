package com.example.chcenter.api.model


data class TodayReport(
    var wardMO: ArrayList<WardMO>,
    var generalOP: ArrayList<GeneralOP>,
    var medicineOp: ArrayList<GeneralMedicineOP>,
    var pediatrician: ArrayList<Pediatrician>,
    var orthoPediatrician: ArrayList<OrthoPediatrician>,
    var ophthalmologist: ArrayList<Ophthalmologist>,
    var dental: ArrayList<Dental>,
    var ent: ArrayList<ENT>,
    var rmo: ArrayList<RMO>,
    var casuality: ArrayList<Casuality>,
    var gynecologist: ArrayList<Gynecology>,
    var skinspecialist: ArrayList<SkinSpecialist>,
    var anasthesia: ArrayList<Anasthesia>,
    var bloodbank: ArrayList<BloodBank>,
    var palliativeCancerOP: ArrayList<PalliativeOrCancerOP>
)

data class WardMO(
    var name: String
)

data class GeneralOP(
    var name: String
)


data class GeneralMedicineOP(
    var name: String
)

data class Pediatrician(
    var name: String
)

data class OrthoPediatrician(
    var name: String
)

data class Ophthalmologist(
    var name: String
)

data class Dental(
    var name: String
)

data class ENT(
    var name: String
)

data class RMO(
    var name: String
)

data class Casuality(
    var name: String
)

data class Gynecology(
    var name: String
)

data class Anasthesia(
    var name: String
)

data class SkinSpecialist(
    var name: String
)

data class BloodBank(
    var name: String
)

data class PalliativeOrCancerOP(
    var name: String
)


object TodayList {
    val TodayDoctors = listOf(
        WardMO("Bunays"),
        WardMO("A"),
        WardMO("F"),
        WardMO("V"),
        WardMO("E"),
        WardMO("Vt"),
        GeneralOP("Jamshi"),
        GeneralOP("Jamshi"),
        GeneralOP("Jamshi"),
        GeneralOP("Jamshi"),
        GeneralOP("Jamshi"),
        GeneralOP("Jamshi"),
        GeneralMedicineOP("Anu"),
        GeneralMedicineOP("Anu"),
        GeneralMedicineOP("Anu"),
        GeneralMedicineOP("Anu"),
        GeneralMedicineOP("Anu"),
        GeneralMedicineOP("Anu"),
        Pediatrician("Shifa"),
        Pediatrician("Shifa"),
        Pediatrician("Shifa"),
        Pediatrician("Shifa"),
        Pediatrician("Shifa"),
        Pediatrician("Shifa"),
        OrthoPediatrician("Shefna"),
        OrthoPediatrician("Shefna"),
        OrthoPediatrician("Shefna"),
        OrthoPediatrician("Shefna"),
        OrthoPediatrician("Shefna"),
        OrthoPediatrician("Shefna"),
        Ophthalmologist("Nidha"),
        Ophthalmologist("Nidha"),
        Ophthalmologist("Nidha"),
        Ophthalmologist("Nidha"),
        Ophthalmologist("Nidha"),
        Ophthalmologist("Nidha"),
        Dental("Anju"),
        Dental("Anju"),
        Dental("Anju"),
        Dental("Anju"),
        Dental("Anju"),
        Dental("Anju"),
        ENT("Shahma"),
        ENT("Shahma"),
        ENT("Shahma"),
        ENT("Shahma"),
        ENT("Shahma"),
        ENT("Shahma"),
        RMO("Shahana"),
        RMO("Shahana"),
        RMO("Shahana"),
        RMO("Shahana"),
        RMO("Shahana"),
        RMO("Shahana"),
        Casuality("Anju"),
        Casuality("Anju"),
        Casuality("Anju"),
        Casuality("Anju"),
        Casuality("Anju"),
        Gynecology("Shahma"),
        Gynecology("Shahma"),
        Gynecology("Shahma"),
        Gynecology("Shahma"),
        Gynecology("Shahma"),
        SkinSpecialist("Shefna"),
        SkinSpecialist("Shefna"),
        SkinSpecialist("Shefna"),
        SkinSpecialist("Shefna"),
        SkinSpecialist("Shefna"),
        SkinSpecialist("Shefna"),
        Anasthesia("Jamshi"),
        Anasthesia("Jamshi"),
        Anasthesia("Jamshi"),
        Anasthesia("Jamshi"),
        Anasthesia("Jamshi"),
        Anasthesia("Jamshi"),
        BloodBank("Shifa"),
        BloodBank("Shifa"),
        BloodBank("Shifa"),
        BloodBank("Shifa"),
        BloodBank("Shifa"),
        BloodBank("Shifa"),
        PalliativeOrCancerOP("Anu"),
        PalliativeOrCancerOP("Anu"),
        PalliativeOrCancerOP("Anu"),
        PalliativeOrCancerOP("Anu"),
        PalliativeOrCancerOP("Anu"),
        PalliativeOrCancerOP("Anu")
    )
}

