package ADN_ARN

enum class Nucleotides(val s: String) {

    A("Adenine"){
        override fun complement(): Nucleotides {
            return T
        }

        override fun toString(): String {
            return A.s
        }
                },
    G("Guanine"){
        override fun complement(): Nucleotides {
            return C
        }

        override fun toString(): String {
            return G.s
        }
                },
    C("Cytosine"){
        override fun complement(): Nucleotides {
            return G
        }

        override fun toString(): String {
            return C.s
        }
                 },
    T("Thymine"){
        override fun complement(): Nucleotides {
            return A
        }

        override fun toString(): String {
            return T.s
        }
                };


    abstract fun complement(): Nucleotides
}