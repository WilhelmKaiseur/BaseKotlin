package ADN_ARN

class ARN(f1:Fibre<Nucleides>) {
    var F1 = f1

    fun convertir(N: Nucleides): Nucleides {

        return when(N) {
            Nucleides.A -> Nucleides.U
            Nucleides.U -> Nucleides.A
            Nucleides.C -> Nucleides.G
            else -> Nucleides.C
        }
    }

}
